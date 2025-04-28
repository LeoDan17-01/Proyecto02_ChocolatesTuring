public class MenuConCarneComida extends Menu {

    public MenuConCarneComida() {
        descripcion = "Comida con Carne: Pollo asado, papas fritas, ensalada";
        precioBase = 75.0;
        tipo = TipoMenu.COMIDA;
    }

    @Override 
    public String getDescripcion() { 
        return descripcion; 
    }

    @Override 
    public double getPrecio() { 
        return precioBase; 
    }
}
