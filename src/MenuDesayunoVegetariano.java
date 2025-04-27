public class MenuDesayunoVegetariano extends Menu {
    public MenuDesayunoVegetariano() {
        descripcion = "Desayuno Vegetariano";
        precioBase = 25.50;
        tipo = TipoMenu.DESAYUNO;
    }

    @Override public String getDescripcion() { return descripcion; }
    @Override public double getPrecio() { return precioBase; }
}