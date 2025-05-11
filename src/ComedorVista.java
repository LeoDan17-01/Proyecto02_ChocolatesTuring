import java.util.List;

/**
 * Vista del comedor que muestra informacion relevante al usuario
 * Incluye menus disponibles estado del comedor e informes de pedidos
 */
public class ComedorVista {

    /**
     * Muestra los menus disponibles en el comedor
     *
     * @param menus lista de menus disponibles
     */
    public void mostrarMenuDisponible(List<Menu> menus) {
        System.out.println("\n--- MENUS DISPONIBLES ---");
        for (Menu menu : menus) {
            System.out.printf("- %s (%s): $%.2f\n", menu.getDescripcion(), menu.getTipo(), menu.getPrecio());
        }
    }

    /**
     * Muestra el estado actual del comedor si esta abierto o cerrado
     *
     * @param abierto verdadero si el comedor esta abierto falso si esta cerrado
     */
    public void mostrarEstadoComedor(boolean abierto) {
        System.out.println("\nEstado del Comedor: " + (abierto ? "ABIERTO" : "CERRADO"));
    }

    /**
     * Muestra el informe detallado de un pedido
     *
     * @param informe texto con el detalle del pedido
     */
    public void mostrarInformePedido(String informe) {
        System.out.println("\n--- DETALLE DEL PEDIDO ---");
        System.out.println(informe);
    }
}
