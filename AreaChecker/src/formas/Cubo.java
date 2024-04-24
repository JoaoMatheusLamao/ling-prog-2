package formas;

public class Cubo implements Calculable {
    private final double lado;

    public Cubo(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        Quadrado q = new Quadrado(lado);
        return 6 * q.calcularArea();
    }
}
