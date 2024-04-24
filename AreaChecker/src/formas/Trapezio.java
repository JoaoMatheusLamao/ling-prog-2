package formas;

public class Trapezio implements Calculable {
    private final double b1;
    private final double b2;
    private final double h;

    public Trapezio(double b1, double b2, double h) {
        this.b1 = b1;
        this.b2 = b2;
        this.h = h;
    }

    @Override
    public double calcularArea() {
        return (b1 + b2) * h / 2;
    }
}
