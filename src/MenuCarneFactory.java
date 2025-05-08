public class MenuCarneFactory implements MenuFactory {
    @Override public Menu crearMenuDesayuno() { return new MenuConCarneDesayuno(); }
    @Override public Menu crearMenuComida() { return new MenuConCarneComida(); }
    @Override public Menu crearMenuCena() { return new MenuConCarneCena(); }
}