public class Main {
    public static void main(String[] args) {
        ComedorModel model = new ComedorModel();
        ComedorView view = new ComedorView();
        ComedorController controller = new ComedorController(model, view);
        
        Usuario estudiante = new Usuario("Ana López", "E987654", TipoUsuario.ESTUDIANTE);
        controller.actualizarEstadoComedor(true);
        
        MenuFactory factory = new MenuVegetarianoFactory();
        Menu menu = factory.crearMenuComida();
        menu = new QuesoExtraDecorator(menu);
        
        controller.seleccionarMenu(menu, estudiante);
    }
}