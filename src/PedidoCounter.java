import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Clase utilitaria para manejar el contador persistente de números de pedido.
 * Almacena el último número usado en un archivo para mantener la secuencia entre ejecuciones.
 */
public class PedidoCounter {
    private static final String COUNTER_FILE = "pedido_counter.txt";
    private static int counter = 0;

    static {
        try {
            if (Files.exists(Paths.get(COUNTER_FILE))) {
                String content = new String(Files.readAllBytes(Paths.get(COUNTER_FILE)));
                counter = Integer.parseInt(content.trim());
            }
        } catch (IOException | NumberFormatException e) {
            System.err.println("Error al cargar el contador de pedidos: " + e.getMessage());
            counter = 0;
        }
    }

    /**
     * Obtiene el siguiente número de pedido en la secuencia y lo persiste
     * @return el siguiente número de pedido disponible
     */
    public static int getNextPedidoNumber() {
        counter++;
        saveCounter();
        return counter;
    }

    /**
     * Guarda el valor actual del contador en el archivo
     */
    private static void saveCounter() {
        try {
            Files.write(Paths.get(COUNTER_FILE), String.valueOf(counter).getBytes());
        } catch (IOException e) {
            System.err.println("Error al guardar el contador de pedidos: " + e.getMessage());
        }
    }
}