public class MenuVegetarianoComida extends Menu {

    public MenuVegetarianoComida() {
        descripcion = "Comida Vegetariana: Ensalada de quinoa, arroz integral, vegetales al vapor";
        precioBase = 60.0;
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
