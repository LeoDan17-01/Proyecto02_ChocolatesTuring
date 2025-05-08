public class MenuVegetarianoFactory implements MenuFactory {
    @Override public Menu crearMenuDesayuno() { return new MenuVegetarianoDesayuno(); }
    @Override public Menu crearMenuComida() { return new MenuVegetarianoComida(); }
    @Override public Menu crearMenuCena() { return new MenuVegetarianoCena(); }
}