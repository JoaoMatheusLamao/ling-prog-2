package exercicio1;

public abstract class Mensagem {
    protected   Contatinho destinatario;
    protected String horaEnvio;
    protected String conteudo;

    public abstract Mensagem sendMensagem(String mensagem);

    @Override
    public String toString() {
        return "Mensagem{" +
                "destinatario=" + destinatario +
                ", horaEnvio='" + horaEnvio + '\'' +
                ", conteudo='" + conteudo + '\'' +
                '}';
    }
}
