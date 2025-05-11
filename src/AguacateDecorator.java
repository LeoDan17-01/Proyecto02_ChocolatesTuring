/**
 * Decorador que agrega aguacate a un menu existente
 * Extiende la funcionalidad del menu original agregando el ingrediente aguacate
 */
public class AguacateDecorator extends ExtraDecorator {

    /**
     * Constructor que recibe un objeto de tipo Menu
     * Este menu sera decorado con aguacate
     *
     * @param menu el menu base al cual se le agregara aguacate
     */
    public AguacateDecorator(Menu menu) {
        super(menu);
    }

    /**
     * Retorna la descripcion del menu incluyendo el ingrediente aguacate
     *
     * @return descripcion del menu con aguacate
     */
    @Override
    public String getDescripcion() {
        return menu.getDescripcion() + " + Aguacate";
    }

    /**
     * Retorna el precio del menu incluyendo el costo adicional del aguacate
     *
     * @return precio total del menu con aguacate
     */
    @Override
    public double getPrecio() {
        return menu.getPrecio() + 7.00;
    }
}
