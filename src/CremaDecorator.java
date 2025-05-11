/**
 * Decorador que agrega crema a un menu existente
 * Extiende la funcionalidad del menu original agregando el ingrediente crema
 */
public class CremaDecorator extends ExtraDecorator {

    /**
     * Constructor que recibe un objeto de tipo Menu
     * Este menu sera decorado con crema
     *
     * @param menu el menu base al cual se le agregara crema
     */
    public CremaDecorator(Menu menu) {
        super(menu);
    }

    /**
     * Retorna la descripcion del menu incluyendo el ingrediente crema
     *
     * @return descripcion del menu con crema
     */
    @Override
    public String getDescripcion() {
        return menu.getDescripcion() + " + Crema";
    }

    /**
     * Retorna el precio del menu incluyendo el costo adicional de la crema
     *
     * @return precio total del menu con crema
     */
    @Override
    public double getPrecio() {
        return menu.getPrecio() + 5.00;
    }
}
