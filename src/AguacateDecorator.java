public class AguacateDecorator extends ExtraDecorator {
    public AguacateDecorator(Menu menu) { super(menu); }

    @Override 
    public String getDescripcion() { 
        return menu.getDescripcion() + " + Aguacate"; 
    }
    
    @Override 
    public double getPrecio() { 
        return menu.getPrecio() + 7.00; 
    }
}