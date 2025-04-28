public class EstrategiaProfesor implements EstrategiaPrecio {
    private static final double DESCUENTO = 0.10;  // 10% de descuento para profesores

    @Override
    public double calcularPrecio(Menu menu) {
        return menu.getPrecio() * (1 - DESCUENTO);  // Aplicamos el descuento al precio base
    }
}
