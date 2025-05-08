import java.util.ArrayList;
import java.util.List;

public class MenuConCarneComida extends Menu {
    private List<Platillo> platillos;

    public MenuConCarneComida() {
        super("Menú con Carne de Comida", 60, TipoMenu.COMIDA);
        platillos = new ArrayList<>();
        platillos.add(new Platillo("Alambre de pollo o res", 32));
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
