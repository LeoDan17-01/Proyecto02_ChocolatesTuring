/**
 * Clase abstracta que representa un decorador para agregar extras a un menu
 * Extiende la clase Menu y delega en el menu original
 */
public abstract class ExtraDecorator extends Menu {
    protected Menu menu;

    /**
     * Constructor que inicializa el decorador con un menu base
     *
     * @param menu el menu que sera decorado con extras
     */
    public ExtraDecorator(Menu menu) {
        super(menu.getDescripcion(), menu.getPrecioBase(), menu.getTipo());
        this.menu = menu;
    }

    /**
     * Retorna la descripcion del menu incluyendo los extras
     *
     * @return descripcion con extras
     */
    @Override
    public abstract String getDescripcion();

    /**
     * Retorna el precio total del menu incluyendo los extras
     *
     * @return precio con extras
     */
    @Override
    public abstract double getPrecio();
}
