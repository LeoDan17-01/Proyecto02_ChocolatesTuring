public class MenuVegetarianoFactory implements MenuFactory {
    @Override public Menu crearMenuDesayuno() { return new MenuDesayunoVegetariano(); }
    @Override public Menu crearMenuComida() { return new MenuComidaVegetariana(); }
    @Override public Menu crearMenuCena() { return new MenuCenaVegetariana(); }
}