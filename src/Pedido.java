import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Pedido {
    private String id = UUID.randomUUID().toString();
    private Usuario usuario;
    private List<Menu> items = new ArrayList<>();
    private LocalDateTime fecha;
    private double total;

    public String generarInforme() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pedido #").append(id.substring(0, 8)).append("\n");
        sb.append("Cliente: ").append(usuario.getNombre()).append("\n");
        sb.append("Items:\n");
        items.forEach(item -> 
            sb.append("- ").append(item.getDescripcion())
              .append(": $").append(String.format("%.2f", item.getPrecio())).append("\n"));
        sb.append("Total: $").append(String.format("%.2f", total));
        return sb.toString();
    }

    // Getters y Setters
    public String getId() { return id; }
    public Usuario getUsuario() { return usuario; }
    public void setUsuario(Usuario usuario) { this.usuario = usuario; }
    public List<Menu> getItems() { return new ArrayList<>(items); }
    public void setItems(List<Menu> items) { this.items = new ArrayList<>(items); }
    public LocalDateTime getFecha() { return fecha; }
    public void setFecha(LocalDateTime fecha) { this.fecha = fecha; }
    public double getTotal() { return total; }
    public void setTotal(double total) { this.total = total; }
}