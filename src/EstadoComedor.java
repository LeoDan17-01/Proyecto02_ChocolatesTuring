import java.util.ArrayList;
import java.util.List;

/**
 * Representa el estado del comedor y gestiona a los observadores
 * Notifica a los comensales cuando el estado cambia
 */
public class EstadoComedor {
    private boolean abierto;
    private List<ComensalObserver> comensales = new ArrayList<>();

    /**
     * Agrega un observador a la lista de comensales
     *
     * @param comensal objeto que implementa ComensalObserver
     */
    public void agregarObserver(ComensalObserver comensal) {
        comensales.add(comensal);
    }

    /**
     * Elimina un observador de la lista de comensales
     *
     * @param comensal objeto que implementa ComensalObserver
     */
    public void eliminarObserver(ComensalObserver comensal) {
        comensales.remove(comensal);
    }

    /**
     * Notifica a todos los observadores sobre el estado actual del comedor
     */
    public void notificarObservers() {
        for (ComensalObserver comensal : comensales) {
            comensal.actualizar(abierto);
        }
    }

    /**
     * Verifica si el comedor esta abierto
     *
     * @return verdadero si esta abierto falso en caso contrario
     */
    public boolean isAbierto() {
        return abierto;
    }

    /**
     * Cambia el estado del comedor y notifica a los observadores
     *
     * @param abierto nuevo estado del comedor
     */
    public void setAbierto(boolean abierto) {
        this.abierto = abierto;
        notificarObservers();
    }

    /**
     * Retorna una copia de la lista de observadores registrados
     *
     * @return lista de comensales observadores
     */
    public List<ComensalObserver> getComensales() {
        return new ArrayList<>(comensales);
    }

    /**
     * Reemplaza la lista de observadores con una nueva lista
     *
     * @param comensales nueva lista de observadores
     */
    public void setComensales(List<ComensalObserver> comensales) {
        this.comensales = new ArrayList<>(comensales);
    }
}
