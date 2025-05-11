/**
 * Interfaz para observar cambios en el estado del comedor
 * Los observadores seran notificados cuando el comedor cambie su estado
 */
public interface ComensalObserver {

    /**
     * Metodo que se ejecuta cuando el estado del comedor cambia
     *
     * @param comedorAbierto verdadero si el comedor esta abierto falso si esta cerrado
     */
    void actualizar(boolean comedorAbierto);
}
