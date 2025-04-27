public class MenuCarneFactory implements MenuFactory {
    @Override public Menu crearMenuDesayuno() { return new MenuDesayunoConCarne(); }
    @Override public Menu crearMenuComida() { return new MenuComidaConCarne(); }
    @Override public Menu crearMenuCena() { return new MenuCenaConCarne(); }
}