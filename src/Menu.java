import java.util.List;

public abstract class Menu {
    protected String descripcion;
    protected double precioBase;
    protected TipoMenu tipo;
    protected List<Platillo> platillos;

    public Menu(String descripcion, double precioBase, TipoMenu tipo) {
        this.descripcion = descripcion;
        this.precioBase = precioBase;
        this.tipo = tipo;
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
        for (Platillo platillo : platillos) {
            System.out.println(platillo.getNombre() + " - Precio: $" + platillo.getPrecio());
        }
    }
    // Getters y Setters
    public double getPrecioBase() { return precioBase; }
    public void setPrecioBase(double precioBase) { this.precioBase = precioBase; }
    public TipoMenu getTipo() { return tipo; }
    public void setTipo(TipoMenu tipo) { this.tipo = tipo; }
}