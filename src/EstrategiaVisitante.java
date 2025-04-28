public class EstrategiaVisitante implements EstrategiaPrecio {

    @Override
    public double calcularPrecio(Menu menu) {
        // Los visitantes no tienen descuento, pagan el precio completo
        return menu.getPrecio();
    }
}