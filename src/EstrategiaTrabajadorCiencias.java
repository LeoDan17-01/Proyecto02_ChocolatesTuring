/**
 * Estrategia de precio para usuarios que son trabajadores de ciencias
 * Aplica un descuento fijo sobre el precio del menu
 */
public class EstrategiaTrabajadorCiencias implements EstrategiaPrecio {
    private static final double DESCUENTO = 0.10;

    /**
     * Calcula el precio del menu aplicando un descuento para trabajadores de ciencias
     *
     * @param menu el menu al cual se aplica la estrategia
     * @return precio con descuento aplicado
     */
    @Override
    public double calcularPrecio(Menu menu) {
        return menu.getPrecio() * (1 - DESCUENTO);
    }
}
