public class QuesoDecorator extends ExtraDecorator {
    public QuesoDecorator(Menu menu) { super(menu); }

    @Override 
    public String getDescripcion() { 
        return menu.getDescripcion() + " + Queso"; 
    }
    
    @Override 
    public double getPrecio() { 
        return menu.getPrecio() + 8.00; 
    }
}