public class MenuVegetarianoDesayuno extends Menu {
    public MenuVegetarianoDesayuno() {
        descripcion = "Desayuno Vegetariano";
        precioBase = 25.50;
        tipo = TipoMenu.DESAYUNO;
    }

    @Override public String getDescripcion() { return descripcion; }
    @Override public double getPrecio() { return precioBase; }
}