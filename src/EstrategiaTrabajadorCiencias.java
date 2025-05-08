public class EstrategiaTrabajadorCiencias implements EstrategiaPrecio{
    private static final double DESCUENTO = 0.10;  // Descuento del 10% para trabajadores de ciencias

    @Override
    public double calcularPrecio(Menu menu) {
        return menu.getPrecio() * (1 - DESCUENTO);  // Aplicamos el descuento al precio base
    }
}
