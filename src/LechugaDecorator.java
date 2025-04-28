public class LechugaDecorator extends ExtraDecorator {
    public LechugaDecorator(Menu menu) { super(menu); }

    @Override public String getDescripcion() { 
        return menu.getDescripcion() + " + Lechuga"; 
    }
    
    @Override public double getPrecio() { 
        return menu.getPrecio() + 5.00; 
    }
}