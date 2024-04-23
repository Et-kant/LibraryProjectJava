package Library;

import java.util.HashMap;
import java.util.List;

public class Library {
    public static HashMap<String, Book> Data;

    public Library(){
        Data = new HashMap<>();
    }

    //Method that it is used in order to add books into the Hashmap, this requires
    //2 variable, title and the object book
    public static void bookAdd(Book book){
        Data.put(book.getTitle(), book);
    }

    public void searchByTitle(String title){
        if (Data.containsKey(title)){
            System.out.println("The book is available");
            System.out.println("More information: " + Data.get(title));
        }else{
            System.out.println("There is no information about this book");
        }
    }

    public void searchByAutor(String autor){
        for (Book book : Data.values()){
            if (book.getAutor().equalsIgnoreCase(autor)){
                System.out.println(book);
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
