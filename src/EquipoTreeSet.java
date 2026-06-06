public class EquipoTreeSet implements Comparable<EquipoTreeSet> {

    private int id;
    private String nombre;
    private String pais;

    public EquipoTreeSet() {
    }

    public EquipoTreeSet(int id, String nombre, String pais) {
        this.id = id;
        this.nombre = nombre;
        this.pais = pais;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPais() {
        return pais;
    }

    @Override
    public int compareTo(EquipoTreeSet o) {
        return this.id - o.getId();
    }
}