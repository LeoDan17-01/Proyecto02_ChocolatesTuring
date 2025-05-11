import java.util.ArrayList;

/**
 * Representa un menu vegetariano para la cena
 * Hereda de la clase Menu e incluye platillos vegetarianos especificos
 */
public class MenuVegetarianoCena extends Menu {

    /**
     * Constructor que define descripcion precio base tipo de menu y platillos vegetarianos
     */
    public MenuVegetarianoCena() {
        super("Menu Vegetariano de Cena", 20, TipoMenu.CENA);
        platillos = new ArrayList<>();
        platillos.add(new Platillo("Pasta Vegetariana", 32));
        platillos.add(new Platillo("Ensalada", 20));
        platillos.add(new Platillo("Te o leche de soya", 8));
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
