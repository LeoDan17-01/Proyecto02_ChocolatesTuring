import java.util.List;
import java.util.ArrayList;

/**
 * Clase abstracta que representa un menu base
 * Contiene descripcion precio base tipo de menu y una lista de platillos
 */
public abstract class Menu {
    protected String descripcion;
    protected double precioBase;
    protected TipoMenu tipo;
    protected List<Platillo> platillos;

    /**
     * Constructor que inicializa los atributos del menu
     *
     * @param descripcion descripcion general del menu
     * @param precioBase precio base sin incluir extras
     * @param tipo tipo de menu
     */
    public Menu(String descripcion, double precioBase, TipoMenu tipo) {
        this.descripcion = descripcion;
        this.precioBase = precioBase;
        this.tipo = tipo;
        this.platillos = new ArrayList<>();
    }

    /**
     * Retorna la descripcion completa del menu
     *
     * @return descripcion con detalles y extras
     */
    public abstract String getDescripcion();

    /**
     * Retorna el precio total del menu incluyendo extras
     *
     * @return precio con extras
     */
    public abstract double getPrecio();

    /**
     * Retorna la lista de platillos incluidos en el menu
     *
     * @return lista de platillos
     */
    public List<Platillo> getPlatillos() {
        return platillos;
    }

    /**
     * Muestra la informacion completa del menu y sus platillos
     * Incluye costo adicional por el trabajo de cocina
     */
    public void mostrarMenu() {
        System.out.println(getDescripcion() + " - Precio: $" + getPrecio());
        System.out.println("Platillos incluidos:");
        System.out.println("Por el trabajo de nuestros companeros en la cocina + $20");

        for (int i = 0; i < platillos.size(); i++) {
            Platillo platillo = platillos.get(i);
            System.out.print(platillo.getNombre() + " $" + platillo.getPrecio());
            if (i < platillos.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public TipoMenu getTipo() {
        return tipo;
    }

    public void setTipo(TipoMenu tipo) {
        this.tipo = tipo;
    }
}
