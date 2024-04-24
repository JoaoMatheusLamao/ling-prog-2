import formas.*;

public class Factory {
    public static Calculable factory(Forma f, double... v) {
        return switch (f) {
            case QUADRADO -> new Quadrado(v[0]);
            case RETANGULO -> new Retangulo(v[0], v[1]);
            case CIRCULO -> new Circulo(v[0]);
            case TRIANGULO -> new Triangulo(v[0], v[1]);
            case PARALELOGRAMA -> new Paralelograma(v[0], v[1]);
            case TRAPEZIO -> new Trapezio(v[0], v[1], v[2]);
            case HEXAGONO -> new Hexagono(v[0]);
            case LOSANGO -> new Losango(v[0], v[1]);
            case CUBO -> new Cubo(v[0]);
            default -> null;
        };
    }
}
