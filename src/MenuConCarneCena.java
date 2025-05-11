import java.util.ArrayList;

/**
 * Representa un menu de cena que incluye carne
 * Hereda de la clase Menu e inicializa platillos especificos para la cena
 */
public class MenuConCarneCena extends Menu {

    /**
     * Constructor que define descripcion precio base tipo de menu y platillos incluidos
     */
    public MenuConCarneCena() {
        super("Menu con Carne de Cena", 20, TipoMenu.CENA);
        platillos = new ArrayList<>();
        platillos.add(new Platillo("Pasta con Carne", 32));
        platillos.add(new Platillo("Ensalada", 20));
        platillos.add(new Platillo("Te o Leche", 8));
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
