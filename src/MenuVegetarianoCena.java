import java.util.ArrayList;

public class MenuVegetarianoCena extends Menu {

    public MenuVegetarianoCena() {
        super("Menú Vegetariano de Cena", 20, TipoMenu.CENA);
        platillos = new ArrayList<>();
        platillos.add(new Platillo("Pasta Vegetariana", 32));
        platillos.add(new Platillo("Ensalada", 20));
        platillos.add(new Platillo("Té o leche de soya", 8));
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
