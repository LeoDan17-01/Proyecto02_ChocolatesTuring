public class Usuario {
    private String nombre;
    private String identificacion;
    private TipoUsuario tipo;

    // Constructor
    public Usuario(String nombre, String identificacion, TipoUsuario tipo) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.tipo = tipo;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getIdentificacion() { return identificacion; }
    public void setIdentificacion(String identificacion) { this.identificacion = identificacion; }
    public TipoUsuario getTipo() { return tipo; }
    public void setTipo(TipoUsuario tipo) { this.tipo = tipo; }
}