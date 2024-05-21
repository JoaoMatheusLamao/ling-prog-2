package exercicio1;

public class MsgTexto extends Mensagem {

    private int numChar;

    public MsgTexto(int numChar) {
        this.numChar = numChar;
    }

    public int getNumChar() {
        return numChar;
    }

    public void setNumChar(int numChar) {
        this.numChar = numChar;
    }

    @Override
    public Mensagem sendMensagem(String mensagem) {
        this.conteudo = mensagem;
        return this;
    }
}
