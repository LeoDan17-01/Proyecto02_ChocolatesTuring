import java.util.ArrayList;
import java.util.List;

/**
 * Modelo que representa el comedor
 * Administra los pedidos el estado del comedor y los menus disponibles
 */
public class ComedorModel {
    private List<Pedido> pedidos = new ArrayList<>();
    private EstadoComedor estadoComedor = new EstadoComedor();
    private List<Menu> menusDisponibles = new ArrayList<>();

    /**
     * Registra un nuevo pedido en el comedor
     *
     * @param pedido el pedido que se desea registrar
     */
    public void registrarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    /**
     * Genera un informe para un pedido especifico
     *
     * @param pedido el pedido del cual se desea obtener el informe
     * @return una cadena con el informe del pedido
     */
    public String generarInformePedido(Pedido pedido) {
        return pedido.generarInforme();
    }

    /**
     * Agrega un menu a la lista de menus disponibles
     *
     * @param menu el menu que se desea agregar
     */
    public void agregarMenu(Menu menu) {
        menusDisponibles.add(menu);
    }

    /**
     * Retorna la lista de menus disponibles
     *
     * @return lista de menus disponibles
     */
    public List<Menu> getMenusDisponibles() {
        return menusDisponibles;
    }

    /**
     * Retorna el estado actual del comedor
     *
     * @return objeto que representa el estado del comedor
     */
    public EstadoComedor getEstadoComedor() {
        return estadoComedor;
    }
}
