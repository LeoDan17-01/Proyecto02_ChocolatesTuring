public class SalsaPicanteDecorator extends ExtraDecorator {
    public SalsaPicanteDecorator(Menu menu) { super(menu); }

    @Override public String getDescripcion() { 
        return menu.getDescripcion() + " + Salsa Picante"; 
    }
    
    @Override public double getPrecio() { 
        return menu.getPrecio() + 5.00; 
    }
}