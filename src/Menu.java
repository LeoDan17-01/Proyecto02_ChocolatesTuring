public abstract class Menu {
    protected String descripcion;
    protected double precioBase;
    protected TipoMenu tipo;

    public abstract String getDescripcion();
    public abstract double getPrecio();
    
    // Getters y Setters
    public double getPrecioBase() { return precioBase; }
    public void setPrecioBase(double precioBase) { this.precioBase = precioBase; }
    public TipoMenu getTipo() { return tipo; }
    public void setTipo(TipoMenu tipo) { this.tipo = tipo; }
}