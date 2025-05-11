import java.util.ArrayList;

/**
 * Representa un menu vegetariano para el desayuno
 * Hereda de la clase Menu e incluye platillos vegetarianos especificos
 */
public class MenuVegetarianoDesayuno extends Menu {

    /**
     * Constructor que define descripcion precio base tipo de menu y platillos vegetarianos
     */
    public MenuVegetarianoDesayuno() {
        super("Menu Vegetariano de Desayuno", 20, TipoMenu.DESAYUNO);
        platillos = new ArrayList<>();
        platillos.add(new Platillo("Quesadillas de Flor de calabaza", 32));
        platillos.add(new Platillo("Cafe o te", 8));
        platillos.add(new Platillo("Fruta", 20));
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
