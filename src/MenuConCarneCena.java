public class MenuConCarneCena extends Menu {

    public MenuConCarneCena() {
        descripcion = "Cena con Carne: Carne asada, ensalada, arroz";
        precioBase = 70.0;
        tipo = TipoMenu.CENA;
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
