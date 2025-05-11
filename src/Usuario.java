/**
 * Representa un usuario dentro del sistema del comedor
 * Contiene informacion basica como nombre identificacion y tipo de usuario
 */
public class Usuario {
    private String nombre;
    private String identificacion;
    private TipoUsuario tipo;

    /**
     * Constructor que inicializa un usuario con sus datos
     *
     * @param nombre nombre del usuario
     * @param identificacion identificador unico del usuario
     * @param tipo tipo de usuario definido en TipoUsuario
     */
    public Usuario(String nombre, String identificacion, TipoUsuario tipo) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public TipoUsuario getTipo() {
        return tipo;
    }

    public void setTipo(TipoUsuario tipo) {
        this.tipo = tipo;
    }
}
