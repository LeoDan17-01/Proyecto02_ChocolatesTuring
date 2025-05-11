/**
 * Representa un comensal que observa el estado del comedor
 * Aplica una estrategia de precio segun el tipo de usuario
 */
public class Comensal implements ComensalObserver {
    private String nombre;
    private String matricula;
    private TipoUsuario tipo;
    private EstrategiaPrecio estrategiaPrecio;

    /**
     * Constructor que inicializa un comensal con su nombre matricula y tipo de usuario
     *
     * @param nombre nombre del comensal
     * @param matricula identificador del comensal
     * @param tipo tipo de usuario asociado al comensal
     */
    public Comensal(String nombre, String matricula, TipoUsuario tipo) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.tipo = tipo;
        this.estrategiaPrecio = crearEstrategia(tipo);
    }

    /**
     * Metodo invocado cuando se actualiza el estado del comedor
     *
     * @param comedorAbierto indica si el comedor esta abierto
     */
    @Override
    public void actualizar(boolean comedorAbierto) {
        System.out.println("Notificacion para " + nombre + ": Comedor " +
                         (comedorAbierto ? "ABIERTO" : "CERRADO"));
    }

    /**
     * Crea una estrategia de precio segun el tipo de usuario
     *
     * @param tipoUsuario tipo de usuario
     * @return estrategia de precio correspondiente
     */
    private EstrategiaPrecio crearEstrategia(TipoUsuario tipoUsuario) {
        switch (tipoUsuario) {
            case ESTUDIANTE:
                return new EstrategiaEstudiante();
            case PROFESOR:
                return new EstrategiaProfesor();
            case VISITANTE:
                return new EstrategiaVisitante();
            case TRABAJADOR_CIENCIAS:
                return new EstrategiaTrabajadorCiencias();
            default:
                throw new IllegalArgumentException("Tipo de usuario desconocido");
        }
    }

    /**
     * Calcula el precio final del menu segun la estrategia del comensal
     *
     * @param menu objeto menu a calcular el precio
     * @return precio final del menu
     */
    public double calcularPrecio(Menu menu) {
        return estrategiaPrecio.calcularPrecio(menu);
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }
    public TipoUsuario getTipo() { return tipo; }
    public void setTipo(TipoUsuario tipo) { this.tipo = tipo; }
}
