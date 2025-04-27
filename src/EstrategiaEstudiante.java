public class EstrategiaEstudiante implements EstrategiaPrecio {
    private static final double DESCUENTO = 0.20;

    @Override
    public double calcularPrecio(Menu menu) {
        return menu.getPrecio() * (1 - DESCUENTO);
    }
}