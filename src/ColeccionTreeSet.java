import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

public class ColeccionTreeSet {

    public static void main(String[] args) {

        Set<String> lista = new TreeSet();

        lista.add("hola");
        lista.add("que tal?");
        lista.add("ya casi es navidad");
        lista.add("programadores");
        lista.add("hola");
        lista.add("el sabado hay clases");

        Iterator it = lista.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("");
        System.out.println("*************** LISTA 2 ***************");

        TreeSet<EquipoTreeSet> equipos = new TreeSet();

        equipos.add(new EquipoTreeSet(4, "Once Lobos FC", "El Salvador"));
        equipos.add(new EquipoTreeSet(1, "Sonsonate FC", "El Salvador"));
        equipos.add(new EquipoTreeSet(3, "CD FAS", "El Salvador"));
        equipos.add(new EquipoTreeSet(5, "Municipal Limeño", "El Salvador"));
        equipos.add(new EquipoTreeSet(2, "Aguila", "El Salvador"));
        equipos.add(new EquipoTreeSet(1, "Chalatenango FC", "El Salvador"));

        for (EquipoTreeSet eq : equipos) {
            System.out.println(eq.getId() + " " + eq.getNombre());
        }
    }
}