import java.util.Iterator;
import java.util.TreeSet;

public class Tester {

    private TreeSet<Ficha> misFichas;

    public Tester() {
        misFichas = new TreeSet<>();
    }

    private void generarFichas() {
        while (misFichas.size() <= 6) {
            misFichas.add(new Ficha());
        }
    }

    public void mostrarFichasAscendentes() {
        generarFichas();
        System.out.println("Fichas Ordenadas de Forma Ascendente: ");
        Iterator<Ficha> it = misFichas.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println();
    }

    public void mostrarFichasDescendentes() {
        generarFichas();
        System.out.println("Fichas Ordenadas de Forma Descendente: ");
        Iterator<Ficha> it = misFichas.descendingIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println();
    }

}
