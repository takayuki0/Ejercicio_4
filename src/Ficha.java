import java.util.Comparator;

public class Ficha implements Comparable {

    private int ladoA = (int) Math.round(Math.random() * 6);
    private int ladoB = (int) Math.round(Math.random() * 6);

    public Ficha() {

    }

    public int pesoPonderado() {
        return Math.max(ladoA, ladoB) * 6 + Math.min(ladoA, ladoB);
    }

    public int getLadoA() {
        return ladoA;
    }

    public void setLadoA(int ladoA) {
        this.ladoA = ladoA;
    }

    public int getLadoB() {
        return ladoB;
    }

    public void setLadoB(int ladoB) {
        this.ladoB = ladoB;
    }

    @Override
    public String toString() {
        return "Ficha: [" + ladoA +
                " : " + ladoB +
                "]" + " Peso ponderado: " + pesoPonderado();
    }

    @Override
    public int compareTo(Object o) {
        Ficha ficha = (Ficha) o;
        return Integer.compare(pesoPonderado(), ((Ficha) o).pesoPonderado());
    }
}