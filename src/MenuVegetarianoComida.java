import java.util.ArrayList;

/**
 * Representa un menu vegetariano para la comida
 * Hereda de la clase Menu e incluye platillos vegetarianos especificos
 */
public class MenuVegetarianoComida extends Menu {

    /**
     * Constructor que define descripcion precio base tipo de menu y platillos vegetarianos
     */
    public MenuVegetarianoComida() {
        super("Menu Vegetariano de Comida", 20, TipoMenu.COMIDA);
        platillos = new ArrayList<>();
        platillos.add(new Platillo("Alambre de soya", 32));
        platillos.add(new Platillo("Agua del dia", 8));
        platillos.add(new Platillo("Sopa de Lentejas", 20));
    }

    /**
     * Retorna la descripcion del menu vegetariano
     *
     * @return descripcion textual del menu
     */
    @Override
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Calcula el precio total sumando el precio base y el precio de los platillos
     *
     * @return precio total del menu vegetariano
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
