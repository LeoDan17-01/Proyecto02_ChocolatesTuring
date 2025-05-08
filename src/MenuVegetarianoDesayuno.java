import java.util.ArrayList;
import java.util.List;

public class MenuVegetarianoDesayuno extends Menu {
    private List<Platillo> platillos;

    public MenuVegetarianoDesayuno() {
        super("Menú Vegetariano de Desayuno", 60, TipoMenu.DESAYUNO);
        platillos = new ArrayList<>();
        platillos.add(new Platillo("Quesadillas de Flor de calabaza", 32));
        platillos.add(new Platillo("Café o té", 8));
        platillos.add(new Platillo("Fruta", 20));
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