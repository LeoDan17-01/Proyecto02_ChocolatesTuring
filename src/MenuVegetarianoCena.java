public class MenuVegetarianoCena extends Menu {

    public MenuVegetarianoCena() {
        descripcion = "Cena Vegetariana: Sopa de lentejas, pan integral, ensalada verde";
        precioBase = 55.0;
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
