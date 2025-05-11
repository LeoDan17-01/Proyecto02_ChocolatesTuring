/**
 * Decorador que agrega hielo a un menu existente
 * Extiende la funcionalidad del menu original agregando el ingrediente hielo
 */
public class HieloDecorator extends ExtraDecorator {

    /**
     * Constructor que recibe un objeto de tipo Menu
     * Este menu sera decorado con hielo
     *
     * @param menu el menu base al cual se le agregara hielo
     */
    public HieloDecorator(Menu menu) {
        super(menu);
    }

    /**
     * Retorna la descripcion del menu incluyendo el ingrediente hielo
     *
     * @return descripcion del menu con hielo
     */
    @Override
    public String getDescripcion() {
        return menu.getDescripcion() + " + Hielo";
    }

    /**
     * Retorna el precio del menu incluyendo el costo adicional del hielo
     *
     * @return precio total del menu con hielo
     */
    @Override
    public double getPrecio() {
        return menu.getPrecio() + 3.00;
    }
}
