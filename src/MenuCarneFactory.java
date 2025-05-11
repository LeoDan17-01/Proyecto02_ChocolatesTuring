/**
 * Fabrica concreta que crea menus con carne para diferentes tiempos del dia
 * Implementa la interfaz MenuFactory
 */
public class MenuCarneFactory implements MenuFactory {

    /**
     * Crea un menu de desayuno con carne
     *
     * @return instancia de MenuConCarneDesayuno
     */
    @Override
    public Menu crearMenuDesayuno() {
        return new MenuConCarneDesayuno();
    }

    /**
     * Crea un menu de comida con carne
     *
     * @return instancia de MenuConCarneComida
     */
    @Override
    public Menu crearMenuComida() {
        return new MenuConCarneComida();
    }

    /**
     * Crea un menu de cena con carne
     *
     * @return instancia de MenuConCarneCena
     */
    @Override
    public Menu crearMenuCena() {
        return new MenuConCarneCena();
    }
}
