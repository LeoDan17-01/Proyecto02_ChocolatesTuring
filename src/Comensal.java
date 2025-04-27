public class Comensal implements ComensalObserver {
    private String nombre;
    private String matricula;
    private TipoUsuario tipo;

    @Override
    public void actualizar(boolean comedorAbierto) {
        System.out.println("Notificación para " + nombre + ": Comedor " + 
                         (comedorAbierto ? "ABIERTO" : "CERRADO"));
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }
    public TipoUsuario getTipo() { return tipo; }
    public void setTipo(TipoUsuario tipo) { this.tipo = tipo; }
}