import java.util.List;
import java.util.ArrayList;

public abstract class Menu {
    protected String descripcion;
    protected double precioBase;
    protected TipoMenu tipo;
    protected List<Platillo> platillos;

    public Menu(String descripcion, double precioBase, TipoMenu tipo) {
        this.descripcion = descripcion;
        this.precioBase = precioBase;
        this.tipo = tipo;
        this.platillos = new ArrayList<>();
    }

    public abstract String getDescripcion();
    public abstract double getPrecio();
    // Método para obtener la lista de platillos
    public List<Platillo> getPlatillos() {
        return platillos;  // Retorna la lista de platillos
    }
    
    // Método para mostrar la descripción del menú y los platillos
    public void mostrarMenu() {
        System.out.println(getDescripcion() + " - Precio: $" + getPrecio());
        System.out.println("Platillos incluidos:");
        System.out.println("Por el trabajo de nuestros compañeros en la cocina + $20");


        for (int i = 0; i < platillos.size(); i++) {
            Platillo platillo = platillos.get(i);
            // Imprimir cada platillo y su precio
            System.out.print(platillo.getNombre() + " $" + platillo.getPrecio());
            // Si no es el último platillo, añadimos una coma y espacio
            if (i < platillos.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    // Getters y Setters
    public double getPrecioBase() { return precioBase; }
    public void setPrecioBase(double precioBase) { this.precioBase = precioBase; }
    public TipoMenu getTipo() { return tipo; }
    public void setTipo(TipoMenu tipo) { this.tipo = tipo; }
}