/**
 * Interfaz que define una estrategia para calcular el precio de un menu
 * Permite aplicar logicas distintas segun el tipo de usuario
 */
public interface EstrategiaPrecio {

    /**
     * Calcula el precio del menu segun una estrategia especifica
     *
     * @param menu el menu al cual se aplica la estrategia
     * @return precio resultante del menu
     */
    double calcularPrecio(Menu menu);
}
