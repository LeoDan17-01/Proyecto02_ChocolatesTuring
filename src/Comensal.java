public class Comensal implements ComensalObserver {
    private String nombre;
    private String matricula;
    private TipoUsuario tipo;
    private EstrategiaPrecio estrategiaPrecio;

    public Comensal(String nombre, String matricula, TipoUsuario tipo) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.tipo = tipo;
        this.estrategiaPrecio = crearEstrategia(tipo);  // Asignamos la estrategia de precio según el tipo de usuario
    }

    @Override
    public void actualizar(boolean comedorAbierto) {
        System.out.println("Notificación para " + nombre + ": Comedor " + 
                         (comedorAbierto ? "ABIERTO" : "CERRADO"));
    }

    private EstrategiaPrecio crearEstrategia(TipoUsuario tipoUsuario) {
        switch (tipoUsuario) {
            case ESTUDIANTE:
                return new EstrategiaEstudiante();
            case PROFESOR:
                return new EstrategiaProfesor();
            case VISITANTE:
                return new EstrategiaVisitante();
            default:
                throw new IllegalArgumentException("Tipo de usuario desconocido");
        }
    }

    public double calcularPrecio(Menu menu) {
        return estrategiaPrecio.calcularPrecio(menu);
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }
    public TipoUsuario getTipo() { return tipo; }
    public void setTipo(TipoUsuario tipo) { this.tipo = tipo; }
}