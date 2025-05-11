/**
 * Representa un platillo individual con nombre y precio
 * Utilizado como parte de un menu
 */
public class Platillo {
    private String nombre;
    private double precio;

    /**
     * Constructor que inicializa el platillo con nombre y precio
     *
     * @param nombre nombre del platillo
     * @param precio precio del platillo
     */
    public Platillo(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    /**
     * Retorna el nombre del platillo
     *
     * @return nombre del platillo
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Retorna el precio del platillo
     *
     * @return precio del platillo
     */
    public double getPrecio() {
        return precio;
    }
}
