package exercicio1;

public class MsgFoto extends Mensagem {

    private int tamanho;

    public MsgFoto(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public Mensagem sendMensagem(String mensagem) {
        this.conteudo = mensagem;
        return this;
    }
}
