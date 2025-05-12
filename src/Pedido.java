import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Representa un pedido realizado por un usuario
 * Contiene los items del pedido su fecha el total y un identificador unico
 */
public class Pedido {
    private String id = UUID.randomUUID().toString();
    private int numeroPedido;
    private Usuario usuario;
    private List<Menu> items = new ArrayList<>();
    private LocalDateTime fecha;
    private double total;

    /**
     * Genera un informe textual del pedido con datos del cliente y detalle de los items
     *
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

    /**
     * Retorna el identificador unico del pedido
     *
     * @return ID del pedido
     */
    public String getId() {
        return id;
    }

    /**
     * Retorna el numero secuencial del pedido
     *
     * @return numero del pedido
     */
    public int getNumeroPedido() {
        return numeroPedido;
    }

    /**
     * Define el numero secuencial del pedido
     *
     * @param numeroPedido numero asignado al pedido
     */
    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    /**
     * Retorna el usuario que realizo el pedido
     *
     * @return objeto usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * Asigna el usuario al pedido
     *
     * @param usuario usuario que realizo el pedido
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * Retorna una copia de los menus incluidos en el pedido
     *
     * @return lista de items del pedido
     */
    public List<Menu> getItems() {
        return new ArrayList<>(items);
    }

    /**
     * Asigna una lista de menus como items del pedido
     *
     * @param items lista de menus
     */
    public void setItems(List<Menu> items) {
        this.items = new ArrayList<>(items);
    }

    /**
     * Retorna la fecha en que se realizo el pedido
     *
     * @return fecha del pedido
     */
    public LocalDateTime getFecha() {
        return fecha;
    }

    /**
     * Define la fecha del pedido
     *
     * @param fecha fecha asignada al pedido
     */
    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    /**
     * Retorna el total del pedido
     *
     * @return monto total
     */
    public double getTotal() {
        return total;
    }

    /**
     * Asigna el monto total del pedido
     *
     * @param total valor total a registrar
     */
    public void setTotal(double total) {
        this.total = total;
    }
}
