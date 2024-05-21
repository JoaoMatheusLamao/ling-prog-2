package exercicio2;

import java.util.List;

public class ListaCompra implements Calculavel{
    private List<ItemCompra> itensCompra;
    private int qtdeMax;

    public ListaCompra(int qtdeMax) {
        this.qtdeMax = qtdeMax;
    }

    public List<ItemCompra> getItensCompra() {
        return itensCompra;
    }

    public int getQtdeMax() {
        return qtdeMax;
    }

    public void incluir(ItemCompra itemCompra) {
        if (this.itensCompra.size() < this.qtdeMax){
            this.itensCompra.add(itemCompra);
        }
    }

    @Override
    public double calcularPreco() {
        double total = 0;
        for (ItemCompra itemCompra : this.itensCompra) {
            total += itemCompra.calcularPreco();
        }

        return total;
    }
}
