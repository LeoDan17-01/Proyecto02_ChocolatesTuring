import java.util.ArrayList;
import java.util.List;

public class MenuConCarneDesayuno extends Menu {

    private List<Platillo> platillos;

    public MenuConCarneDesayuno() {
        super("Menú con Carne de Desayuno", 60, TipoMenu.DESAYUNO);
        platillos = new ArrayList<>();
        platillos.add(new Platillo("Tacos de Carne", 32));
        platillos.add(new Platillo("Fruta", 20));
        platillos.add(new Platillo("Café o té", 8));
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
