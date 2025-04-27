public abstract class ExtraDecorator extends Menu {
    protected Menu menu;

    public ExtraDecorator(Menu menu) {
        this.menu = menu;
    }

    @Override public abstract String getDescripcion();
    @Override public abstract double getPrecio();
}