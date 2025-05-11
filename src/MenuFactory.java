/**
 * Interfaz para la creacion de menus segun el tiempo del dia
 * Define metodos para generar menus de desayuno comida y cena
 */
public interface MenuFactory {

    /**
     * Crea un menu de desayuno
     *
     * @return instancia de Menu para desayuno
     */
    Menu crearMenuDesayuno();

    /**
     * Crea un menu de comida
     *
     * @return instancia de Menu para comida
     */
    Menu crearMenuComida();

    /**
     * Crea un menu de cena
     *
     * @return instancia de Menu para cena
     */
    Menu crearMenuCena();
}
