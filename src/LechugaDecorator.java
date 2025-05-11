/**
 * Decorador que agrega lechuga a un menu existente
 * Extiende la funcionalidad del menu original agregando el ingrediente lechuga
 */
public class LechugaDecorator extends ExtraDecorator {

    /**
     * Constructor que recibe un objeto de tipo Menu
     * Este menu sera decorado con lechuga
     *
     * @param menu el menu base al cual se le agregara lechuga
     */
    public LechugaDecorator(Menu menu) {
        super(menu);
    }

    /**
     * Retorna la descripcion del menu incluyendo el ingrediente lechuga
     *
     * @return descripcion del menu con lechuga
     */
    @Override
    public String getDescripcion() {
        return menu.getDescripcion() + " + Lechuga";
    }

    /**
     * Retorna el precio del menu incluyendo el costo adicional de la lechuga
     *
     * @return precio total del menu con lechuga
     */
    @Override
    public double getPrecio() {
        return menu.getPrecio() + 5.00;
    }
}
