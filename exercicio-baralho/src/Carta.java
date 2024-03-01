public class Carta {
    private Naipe naipe;
    private Valor valor;

    public Carta(Naipe naipe, Valor valor) {
        this.naipe = naipe;
        this.valor = valor;
    }
    public Carta(Valor valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        String valorFormatted = String.format("%-15s", "valor = " + this.valor);
        String naipeFormatted = "";
        if (this.naipe != null) {
            naipeFormatted = String.format("| %-15s", "naipe = " + this.naipe);
        }
        return valorFormatted + naipeFormatted;
    }
}
