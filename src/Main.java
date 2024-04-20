import java.util.ArrayList;
import java.util.Scanner;

interface ArticuloElectronico {
    double getPrecio();
    String getDescripcion();
    void mostrarDetalles();
}

class SistemaInventario {
    private ArrayList<ArticuloElectronico> inventario;
    private Scanner scanner;

    public SistemaInventario() {
        inventario = new ArrayList<>();
        scanner = new Scanner(System.in);
    }
    public void ejecutar() {
        boolean salir = false;
        while (!salir) {
            System.out.println("\nSistema de gestion de inventario");
            System.out.println("1. Agregar articulo");
            System.out.println("2. Modificar articulo");
            System.out.println("3. Ver inventario");
            System.out.println("4. Salir");
            System.out.print("Ingrese su opcion: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    agregarArticulo();
                    break;
                case 2:

                    break;
                case 3:
                    verInventario();
                    break;
                case 4:
                    salir = true;
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }
        }
        scanner.close();
    }

    private void agregarArticulo() {
        System.out.println("\nMenu para agregar articulo");
        System.out.println("1. Agregar telefono movil");
        System.out.println("2. Agregar laptop");
        System.out.print("Ingrese su opcion: ");
        int opcion = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Ingrese la descripción: ");
        String descripcion = scanner.nextLine();
        System.out.print("Ingrese el precio: ");
        double precio = scanner.nextDouble();

        switch (opcion) {
            case 1:
                inventario.add(new TelefonoMovil(nombre, modelo, descripcion, precio));
                break;
            case 2:
                inventario.add(new Laptop(nombre, modelo, descripcion, precio));
                break;
            default:
                System.out.println("Opcion invalida.");
        }
    }

    private void verInventario() {
        System.out.println("\nLista de inventario:");
        for (int i = 0; i < inventario.size(); i++) {
            System.out.print("[" + (i + 1) + "] ");
            inventario.get(i).mostrarDetalles();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        SistemaInventario sistema = new SistemaInventario();
        sistema.ejecutar();
    }
}


