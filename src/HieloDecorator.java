public class HieloDecorator extends ExtraDecorator {
    public HieloDecorator(Menu menu) { super(menu); }

    @Override 
    public String getDescripcion() { 
        return menu.getDescripcion() + " + Hielo"; 
    }
    
    @Override 
    public double getPrecio() { 
        return menu.getPrecio() + 3.00; 
    }
}