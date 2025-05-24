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

    /**
     * Retorna el nombre del usuario.
     *
     * @return nombre del usuario
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del usuario.
     *
     * @param nombre nuevo valor para el nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Retorna la identificacion del usuario.
     *
     * @return identificacion del usuario
     */
    public String getIdentificacion() {
        return identificacion;
    }

    /**
     * Establece la identificacion del usuario.
     *
     * @param identificacion nuevo valor para la identificacion
     */
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    /**
     * Retorna el tipo de usuario.
     *
     * @return tipo de usuario
     */
    public TipoUsuario getTipo() {
        return tipo;
    }

    /**
     * Establece el tipo de usuario.
     *
     * @param tipo nuevo valor para el tipo de usuario
     */
    public void setTipo(TipoUsuario tipo) {
        this.tipo = tipo;
    }
}
