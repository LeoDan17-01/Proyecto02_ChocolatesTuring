/**
 * Fabrica concreta que crea menus vegetarianos para diferentes tiempos del dia
 * Implementa la interfaz MenuFactory
 */
public class MenuVegetarianoFactory implements MenuFactory {

    /**
     * Crea un menu vegetariano para desayuno
     *
     * @return instancia de MenuVegetarianoDesayuno
     */
    @Override
    public Menu crearMenuDesayuno() {
        return new MenuVegetarianoDesayuno();
    }

    /**
     * Crea un menu vegetariano para comida
     *
     * @return instancia de MenuVegetarianoComida
     */
    @Override
    public Menu crearMenuComida() {
        return new MenuVegetarianoComida();
    }

    /**
     * Crea un menu vegetariano para cena
     *
     * @return instancia de MenuVegetarianoCena
     */
    @Override
    public Menu crearMenuCena() {
        return new MenuVegetarianoCena();
    }
}
