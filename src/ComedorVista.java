import java.util.List;

public class ComedorVista {
    // Mostrar los menús disponibles
    public void mostrarMenuDisponible(List<Menu> menus) {
        System.out.println("\n--- MENÚS DISPONIBLES ---");
        for (Menu menu : menus) {
            System.out.printf("- %s (%s): $%.2f\n", menu.getDescripcion(), menu.getTipo(), menu.getPrecio());
        }
    }

    // Mostrar estado del comedor
    public void mostrarEstadoComedor(boolean abierto) {
        System.out.println("\nEstado del Comedor: " + (abierto ? "ABIERTO" : "CERRADO"));
    }

    // Mostrar informe de un pedido
    public void mostrarInformePedido(String informe) {
        System.out.println("\n--- DETALLE DEL PEDIDO ---");
        System.out.println(informe);
    }
}
