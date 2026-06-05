public class Equipo {
    private String nombre;
    private String pais;
    private int copas;

    // Constructor para crear el equipo con sus 3 datos
    public Equipo(String nombre, String pais, int copas) {
        this.nombre = nombre;
        this.pais = pais;
        this.copas = copas;
    }

    // Métodos para que Ejemplo2LinkedList pueda leer los datos
    public String getNombre() {
        return nombre;
    }

    public String getPais() {
        return pais;
    }

    public int getCopas() {
        return copas;
    }
}
