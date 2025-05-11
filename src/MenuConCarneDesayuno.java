import java.util.ArrayList;

/**
 * Representa un menu de desayuno que incluye carne
 * Hereda de la clase Menu e inicializa platillos especificos para el desayuno
 */
public class MenuConCarneDesayuno extends Menu {

    /**
     * Constructor que define descripcion precio base tipo de menu y platillos incluidos
     */
    public MenuConCarneDesayuno() {
        super("Menu con Carne de Desayuno", 20, TipoMenu.DESAYUNO);
        platillos = new ArrayList<>();
        platillos.add(new Platillo("Tacos de Carne", 32));
        platillos.add(new Platillo("Fruta", 20));
        platillos.add(new Platillo("Cafe o te", 8));
    }

    /**
     * Retorna la descripcion del menu
     *
     * @return descripcion textual del menu
     */
    @Override
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Calcula el precio total sumando el precio base y el precio de todos los platillos
     *
     * @return precio total del menu
     */
    @Override
    public double getPrecio() {
        double precioTotal = precioBase;
        for (Platillo platillo : platillos) {
            precioTotal += platillo.getPrecio();
        }
        return precioTotal;
    }
}
