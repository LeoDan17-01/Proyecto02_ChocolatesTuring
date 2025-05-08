public abstract class ExtraDecorator extends Menu {
    protected Menu menu;

    public ExtraDecorator(Menu menu) {
        super(menu.getDescripcion(), menu.getPrecioBase(), menu.getTipo());  
        this.menu = menu;
    }

    @Override public abstract String getDescripcion();
    @Override public abstract double getPrecio();
}