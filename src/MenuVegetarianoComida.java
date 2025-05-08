import java.util.ArrayList;

public class MenuVegetarianoComida extends Menu {
    
    public MenuVegetarianoComida() {
        super("Menú Vegetariano de Comida", 20, TipoMenu.COMIDA);
        platillos = new ArrayList<>();
        platillos.add(new Platillo("Alambre de soya", 32));
        platillos.add(new Platillo("Agua del día", 8));
        platillos.add(new Platillo("Sopa de Lentejas", 20));
    }

    @Override
    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public double getPrecio() {
        double precioTotal = precioBase;
        for (Platillo platillo : platillos) {
            precioTotal += platillo.getPrecio();
        }
        return precioTotal;
    }

    
}
