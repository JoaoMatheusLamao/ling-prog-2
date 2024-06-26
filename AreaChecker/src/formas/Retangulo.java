package formas;

public class Retangulo implements Calculable {
    private final double lado1;
    private final double lado2;

    public Retangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public double calcularArea() {
        return lado1 * lado2;
    }
}
