package UImenu;

import Library.Library;
import Library.Library;
import Library.Book;

import java.util.Scanner;

public class UImenu {
    //creacion de metodo que se encargara de cargar el menu
    public static void showMenu(){
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Agregar Nuevo Libro");
            System.out.println("2. Buscar Libro por Título");
            System.out.println("3. Buscar Libro por Autor");
            System.out.println("4. Mostrar Inventario");
            System.out.println("5. Salir");
            System.out.print("Ingrese el número de la opción que desea realizar: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    // Agregar Nuevo Libro
                    Book newbook = new Book("title", "autor", "ISBN", "Editorial", 1998, 2000);
                    Book newbook2 = new Book("maria", "antonieta", "ISBN", "wewewe", 2112, 2321);
                    Library.bookAdd(newbook);
                    Library.bookAdd(newbook2);

                    System.out.println("Libro agregado correctamente.");
                    break;
                case 2:
                    // Buscar Libro por Título
                    System.out.println("\nBuscar Libro por Título:");
                    System.out.print("Ingrese el título del libro a buscar: ");
                    String title = scanner.nextLine();
                    library.searchByTitle(title);
                    break;
                case 3:
                    // Buscar Libro por Autor
                    System.out.println("\nBuscar Libro por Autor:");
                    System.out.print("Ingrese el nombre del autor a buscar: ");
                    String autorBusqueda = scanner.nextLine();
                    library.searchByAutor(autorBusqueda);

                case 4:
                    // Mostrar Inventario
                    library.showInventory();
                    break;
                case 5:
                    // Salir
                    System.out.println("Saliendo del sistema.");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, ingrese un número del 1 al 5.");
            }
        } while (opcion != 5);

    }

}
