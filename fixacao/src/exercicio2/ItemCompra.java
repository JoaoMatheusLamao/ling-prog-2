package exercicio2;

public class ItemCompra implements Calculavel{

    private int quantidade;
    private Produto produto;
    private double desconto;

    @Override
    public double calcularPreco() {
        return quantidade * (produto.getPreco() - desconto);
    }

    public ItemCompra(Produto produto, double desconto) {
        this.produto = produto;
        this.desconto = desconto;
    }
}
