package formas;

public class Losango implements Calculable {
    private final double d1;
    private final double d2;

    public Losango(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }

    @Override
    public double calcularArea() {
        Triangulo r = new Triangulo(d1, d2);
        return r.calcularArea();
    }
}
