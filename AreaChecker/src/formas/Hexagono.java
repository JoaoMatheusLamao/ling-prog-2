package formas;

public class Hexagono implements Calculable {
    private final double lado;

    public Hexagono(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return 3 * ((Math.pow(lado, 2) * Math.sqrt(3))/2);
    }
}
