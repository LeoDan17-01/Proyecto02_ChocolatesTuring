import java.util.ArrayList;
import java.util.List;

public class EstadoComedor {
    private boolean abierto;
    private List<ComensalObserver> comensales = new ArrayList<>();

    public void agregarObserver(ComensalObserver comensal) {
        comensales.add(comensal);
    }

    public void eliminarObserver(ComensalObserver comensal) {
        comensales.remove(comensal);
    }

    public void notificarObservers() {
        for (ComensalObserver comensal : comensales) {
            comensal.actualizar(abierto);
        }
    }

    // Getters y Setters
    public boolean isAbierto() { return abierto; }
    public void setAbierto(boolean abierto) { 
        this.abierto = abierto; 
        notificarObservers();
    }
    public List<ComensalObserver> getComensales() { return new ArrayList<>(comensales); }
    public void setComensales(List<ComensalObserver> comensales) { 
        this.comensales = new ArrayList<>(comensales); 
    }
}