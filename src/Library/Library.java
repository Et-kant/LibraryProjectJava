package Library;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Library {
    public static HashMap<String, Book> Data;

    public Library(){
        Data = new HashMap<>();
    }

    //Metodo que se encarga de subir los libros al hashmap, add book
    public static void bookAdd(Book book){
        Data.put(book.getTitle(), book);
    }

    //metodo para buscar segun titulo

    public void searchByTitle(String title){
        if (Data.containsKey(title)){
            System.out.println("El  libro esta disponible");
            System.out.println("Mas informacion al respecto " + Data.get(title));
        }else{
            System.out.println("No hay informacion acerca de este libro");
        }
    }

    //metodo encargada de buscar basado en autor
    public void searchByAutor(String autor){
        List<Book> located = new ArrayList<>();
        for (Book book : Data.values()){
            if (book.getAutor().equalsIgnoreCase(autor)){
                located.add(book);
            }
        }

        if(located.isEmpty()){
            System.out.println("No se encontraron libros de este autor");
        }else{
            System.out.println("Libros del autor : " + autor + ":  ");
            for (Book book : located){
                System.out.println("Titulo: " + book.getTitle());
                System.out.println("Autor: " + book.getAutor());
                System.out.println("ISBN: " + book.getISBN());
                System.out.println("Editorial: " +  book.getEditorial());
                System.out.println("Año: " + book.getYear());
            }
        }
    }

    public void showInventory(){
        System.out.println("The inventory on the Library: ");
        for (Book book : Data.values()){
            System.out.println(book + "\n");
        }
    }


}
