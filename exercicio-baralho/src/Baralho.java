import java.util.Arrays;

public class Baralho {
    private Carta[] cartas;

    public Baralho() {
        this.cartas = new Carta[56];
        int count = 0;
        for (Naipe n : Naipe.values()){
            for (Valor v : Valor.valuesWithoutCoringa()){
                this.cartas[count] = new Carta(n, v);
                count++;
            }
            this.cartas[count] = new Carta(Valor.CORINGA);
            count++;
        }
    }

    public void embaralhar(){
        if (this.cartas == null){
            return;
        }
        for (int i = 0; i < 1000000; i++) {
            int a = (int) (Math.random() * this.cartas.length);
            int b = (int) (Math.random() * this.cartas.length);

            Carta temp = this.cartas[a];
            this.cartas[a] = this.cartas[b];
            this.cartas[b] = temp;
        }
    }

    public Carta distribuirCarta(){
        if (this.cartas == null){
            return null;
        }
        Carta temp = null;
        for (int i = this.cartas.length - 1; i >= 0; i--) {

            if (this.cartas[i] == null){
                continue;
            }
            temp = this.cartas[i];
            this.cartas[i] = null;
            break;
        }

        return temp;
    }

    public boolean hasCarta(){
        if (this.cartas == null){
            return false;
        }
        for (Carta a : this.cartas){
            if (a != null){
                return true;
            }
        }
        return false;
    }

    public void imprimirBaralho(){
        if (this.cartas == null){
            return;
        }
        Arrays.stream(this.cartas).forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "Baralho{" +
                "cartas=" + Arrays.toString(cartas) +
                '}';
    }
}
