import java.util.ArrayList;


public class MenuConCarneDesayuno extends Menu {

    public MenuConCarneDesayuno() {
        super("Menú con Carne de Desayuno", 20, TipoMenu.DESAYUNO);
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
