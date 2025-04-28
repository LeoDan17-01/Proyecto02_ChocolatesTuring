public class MenuConCarneDesayuno extends Menu {

    public MenuConCarneDesayuno() {
        descripcion = "Desayuno con Carne: Tacos de chorizo, jugo natural, pan";
        precioBase = 65.0;
        tipo = TipoMenu.DESAYUNO;
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
