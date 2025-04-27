import java.util.ArrayList;
import java.util.List;

public class ComedorModel {
    private List<Pedido> pedidos = new ArrayList<>();
    private EstadoComedor estadoComedor = new EstadoComedor();

    public void registrarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public String generarInformePedido(Pedido pedido) {
        return pedido.generarInforme();
    }

    // Getters
    public List<Pedido> getPedidos() { return new ArrayList<>(pedidos); }
    public EstadoComedor getEstadoComedor() { return estadoComedor; }
}