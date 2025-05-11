import java.util.ArrayList;

/**
 * Representa un menu de comida que incluye carne
 * Hereda de la clase Menu e inicializa platillos especificos para la comida
 */
public class MenuConCarneComida extends Menu {

    /**
     * Constructor que define descripcion precio base tipo de menu y platillos incluidos
     */
    public MenuConCarneComida() {
        super("Menu con Carne de Comida", 20, TipoMenu.COMIDA);
        platillos = new ArrayList<>();
        platillos.add(new Platillo("Alambre de pollo o res", 32));
        platillos.add(new Platillo("Agua del dia", 8));
        platillos.add(new Platillo("Sopa de Lentejas", 20));
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
