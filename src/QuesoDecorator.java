/**
 * Decorador que agrega queso a un menu existente
 * Extiende la funcionalidad del menu original agregando el ingrediente queso
 */
public class QuesoDecorator extends ExtraDecorator {

    /**
     * Constructor que recibe un objeto de tipo Menu
     * Este menu sera decorado con queso
     *
     * @param menu el menu base al cual se le agregara queso
     */
    public QuesoDecorator(Menu menu) {
        super(menu);
    }

    /**
     * Retorna la descripcion del menu incluyendo el ingrediente queso
     *
     * @return descripcion del menu con queso
     */
    @Override
    public String getDescripcion() {
        return menu.getDescripcion() + " + Queso";
    }

    /**
     * Retorna el precio del menu incluyendo el costo adicional del queso
     *
     * @return precio total del menu con queso
     */
    @Override
    public double getPrecio() {
        return menu.getPrecio() + 8.00;
    }
}
