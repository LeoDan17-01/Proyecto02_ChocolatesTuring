/**
 * Decorador que agrega salsa picante a un menu existente
 * Extiende la funcionalidad del menu original agregando el ingrediente salsa picante
 */
public class SalsaPicanteDecorator extends ExtraDecorator {

    /**
     * Constructor que recibe un objeto de tipo Menu
     * Este menu sera decorado con salsa picante
     *
     * @param menu el menu base al cual se le agregara salsa picante
     */
    public SalsaPicanteDecorator(Menu menu) {
        super(menu);
    }

    /**
     * Retorna la descripcion del menu incluyendo el ingrediente salsa picante
     *
     * @return descripcion del menu con salsa picante
     */
    @Override
    public String getDescripcion() {
        return menu.getDescripcion() + " + Salsa Picante";
    }

    /**
     * Retorna el precio del menu incluyendo el costo adicional de la salsa picante
     *
     * @return precio total del menu con salsa picante
     */
    @Override
    public double getPrecio() {
        return menu.getPrecio() + 5.00;
    }
}
