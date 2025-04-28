public class CremaDecorator extends ExtraDecorator {
    public CremaDecorator(Menu menu) { super(menu); }

    @Override 
    public String getDescripcion() { 
        return menu.getDescripcion() + " + Crema"; 
    }
    
    @Override 
    public double getPrecio() { 
        return menu.getPrecio() + 5.00; 
    }
}