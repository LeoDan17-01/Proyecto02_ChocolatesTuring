import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Representa un pedido realizado por un usuario
 * Contiene los items del pedido su fecha y el total calculado
 */
public class Pedido {
    private String id = UUID.randomUUID().toString();
    private int numeroPedido;
    private Usuario usuario;
    private List<Menu> items = new ArrayList<>();
    private LocalDateTime fecha;
    private double total;

    /**
     * Genera un informe textual del pedido incluyendo número de pedido, cliente, items y total
     * @return informe del pedido en formato texto
     */
    public String generarInforme() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pedido #").append(numeroPedido).append("\n");
        sb.append("ID: ").append(id.substring(0, 8)).append("\n");
        sb.append("Cliente: ").append(usuario.getNombre()).append("\n");
        sb.append("Items:\n");
        items.forEach(item -> 
            sb.append("- ").append(item.getDescripcion())
              .append(": $").append(String.format("%.2f", item.getPrecio())).append("\n"));
        sb.append("Total: $").append(String.format("%.2f", total));
        return sb.toString();
    }

    // Resto de los métodos getters y setters...
    public String getId() {
        return id;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Menu> getItems() {
        return new ArrayList<>(items);
    }

    public void setItems(List<Menu> items) {
        this.items = new ArrayList<>(items);
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}