import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. Bienvenida al Comedor Estudiantil
        System.out.println("¡Bienvenido al Comedor Estudiantil! :)");
        
        // 2. Selección del tipo de usuario
        System.out.println("¿Qué tipo de usuario eres?");
        System.out.println("1. Estudiante 20%");
        System.out.println("2. Profesor 10%");
        System.out.println("3. Visitante");
        System.out.println("4. Trabajador de Ciencias 10%");
        int tipoUsuario = scanner.nextInt();
        TipoUsuario tipo = seleccionarTipoUsuario(tipoUsuario);
        Comensal comensal = new Comensal("Comensal", "0000", tipo);
        
        // 3. Selección del menú
        System.out.println("¿Qué tipo de menú deseas?");
        System.out.println("Todas las opciones valen $60");
        System.out.println("1. Desayuno");
        System.out.println("2. Comida");
        System.out.println("3. Cena");
        int tipoMenu = scanner.nextInt();
        
        // Menú según tipo de comida
        Menu menu = seleccionarMenu(tipoMenu, scanner);
        menu.mostrarMenu();

        // 4. Selección de extras
        menu = seleccionarExtras(menu, scanner);  // Ahora pasamos comensal como parámetro
        
        // Calcular el precio final con descuento
        double precioFinal = comensal.calcularPrecio(menu);

        // 5. Mostrar el ticket con descuento
        System.out.println("\n--- TICKET DE COMPRA ---");
        System.out.println("Usuario: " + comensal.getNombre());
        System.out.println("Menú seleccionado: " + menu.getDescripcion());
        System.out.println("Precio base: $" + menu.getPrecio());
        System.out.println("Precio con descuento: $" + precioFinal);
        
        // Despedida
        System.out.println("\n¡Gracias por visitar el Comedor Estudiantil! ¡Vuelve pronto!");
    }

    // Método para seleccionar tipo de usuario
    private static TipoUsuario seleccionarTipoUsuario(int tipoUsuario) {
        switch (tipoUsuario) {
            case 1: return TipoUsuario.ESTUDIANTE;
            case 2: return TipoUsuario.PROFESOR;
            case 3: return TipoUsuario.VISITANTE;
            case 4: return TipoUsuario.TRABAJADOR_CIENCIAS;
            default: throw new IllegalArgumentException("Opción no válida.");
        }
    }

    // Método para seleccionar menú según el tipo de comida
    private static Menu seleccionarMenu(int tipoMenu, Scanner scanner) {
        Menu menu = null;
        switch (tipoMenu) {
            case 1:
                System.out.println("¿Prefieres un menú con Carne o Vegetariano?");
                System.out.println("1. Con Carne");
                System.out.println("2. Vegetariano");
                int opcionDesayuno = scanner.nextInt();
                menu = (opcionDesayuno == 1) ? new MenuConCarneDesayuno() : new MenuVegetarianoDesayuno();
                break;
            case 2:
                System.out.println("¿Prefieres un menú con Carne o Vegetariano?");
                System.out.println("1. Con Carne");
                System.out.println("2. Vegetariano");
                int opcionComida = scanner.nextInt();
                menu = (opcionComida == 1) ? new MenuConCarneComida() : new MenuVegetarianoComida();
                break;
            case 3:
                System.out.println("¿Prefieres un menú con Carne o Vegetariano?");
                System.out.println("1. Con Carne");
                System.out.println("2. Vegetariano");
                int opcionCena = scanner.nextInt();
                menu = (opcionCena == 1) ? new MenuConCarneCena() : new MenuVegetarianoCena();
                break;
            default:
                throw new IllegalArgumentException("Opción no válida.");
        }
        return menu;
    }

    // Método para seleccionar extras
    private static Menu seleccionarExtras(Menu menu, Scanner scanner) {
        char agregarExtras = 'S';  // Iniciamos el ciclo preguntando si quiere agregar extras
    
        while (agregarExtras == 'S' || agregarExtras == 's') {
            // Mostrar opciones de extras
            System.out.println("¿Qué extra deseas agregar?");
            System.out.println("1. Lechuga + $5");
            System.out.println("2. Queso + $8");
            System.out.println("3. Hielo + $3");
            System.out.println("4. Salsa Picante + $5");
            System.out.println("5. Aguacate + $7");
            System.out.println("6. Crema + $5");
            System.out.println("0. Salir");
    
            // Leer la opción seleccionada por el usuario
            int opcionExtra = scanner.nextInt();
    
            // Si el usuario selecciona 0, salimos del ciclo
            if (opcionExtra == 0) {
                agregarExtras = 'N';  // Cambiamos la variable para salir del ciclo
            } else {
                // Seleccionar el decorador correspondiente según la opción
                switch (opcionExtra) {
                    case 1:
                        menu = new LechugaDecorator(menu);
                        break;
                    case 2:
                        menu = new QuesoDecorator(menu);
                        break;
                    case 3:
                        menu = new HieloDecorator(menu);
                        break;
                    case 4:
                        menu = new SalsaPicanteDecorator(menu);
                        break;
                    case 5:
                        menu = new AguacateDecorator(menu);
                        break;
                    case 6:
                        menu = new CremaDecorator(menu);
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
            }
    
            // Preguntar al usuario si desea agregar otro extra
            if (agregarExtras != 'N') {
                System.out.println("¿Deseas agregar otro extra? (S para sí, N para no)");
                agregarExtras = scanner.next().charAt(0);  // Leer la respuesta del usuario
            }
        }
        return menu;  // Retornamos el menú con los extras aplicados
    }
}

