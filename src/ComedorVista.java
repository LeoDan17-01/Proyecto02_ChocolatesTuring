import java.util.List;

public class ComedorVista {
    public void mostrarMenuDisponible(List<Menu> menus) {
        System.out.println("\n--- MENÚS DISPONIBLES ---");
        for (Menu menu : menus) {
            System.out.printf("- %s: $%.2f\n", menu.getDescripcion(), menu.getPrecio());
        }
    }

    public void mostrarEstadoComedor(boolean abierto) {
        System.out.println("\nEstado del Comedor: " + (abierto ? "ABIERTO" : "CERRADO"));
    }

    public void mostrarInformePedido(String informe) {
        System.out.println("\n--- DETALLE DEL PEDIDO ---");
        System.out.println(informe);
    }
}