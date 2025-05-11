/**
 * Estrategia de precio para usuarios de tipo visitante
 * No aplica descuento el precio del menu es el original
 */
public class EstrategiaVisitante implements EstrategiaPrecio {

    /**
     * Retorna el precio original del menu sin aplicar descuento
     *
     * @param menu el menu al cual se aplica la estrategia
     * @return precio sin descuento
     */
    @Override
    public double calcularPrecio(Menu menu) {
        return menu.getPrecio();
    }
}
