import java.util.ArrayList;
import java.util.List;

public class ComedorModel {
    private List<Pedido> pedidos = new ArrayList<>();
    private EstadoComedor estadoComedor = new EstadoComedor();
    private List<Menu> menusDisponibles = new ArrayList<>();

    // Método para registrar un pedido
    public void registrarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    // Método para generar el informe de un pedido
    public String generarInformePedido(Pedido pedido) {
        return pedido.generarInforme();
    }

    // Métodos para agregar menús disponibles
    public void agregarMenu(Menu menu) {
        menusDisponibles.add(menu);
    }

    // Método para obtener los menús disponibles
    public List<Menu> getMenusDisponibles() {
        return menusDisponibles;
    }

    // Obtener estado del comedor
    public EstadoComedor getEstadoComedor() {
        return estadoComedor;
    }
}
