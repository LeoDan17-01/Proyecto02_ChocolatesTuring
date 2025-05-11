/**
 * Estrategia de precio para usuarios de tipo profesor
 * Aplica un descuento fijo sobre el precio del menu
 */
public class EstrategiaProfesor implements EstrategiaPrecio {
    private static final double DESCUENTO = 0.10;

    /**
     * Calcula el precio del menu aplicando un descuento de profesor
     *
     * @param menu el menu al cual se aplica la estrategia
     * @return precio con descuento aplicado
     */
    @Override
    public double calcularPrecio(Menu menu) {
        return menu.getPrecio() * (1 - DESCUENTO);
    }
}
