package Library;

public class Book {

    private String title;
    private String autor;
    private String ISBN;
    private String editorial;
    private int year;
    private double price;

    protected boolean lent;

    public Book(String title, String autor, String ISBN, String editorial, int year, double price) {
        this.title = title;
        this.autor = autor;
        this.ISBN = ISBN;
        this.editorial = editorial;
        this.year = year;
        this.price = price;
    }

    public String getTitle(){
        return title;
    }

    public String getAutor(){
        return autor;
    }

    public String getISBN(){
        return ISBN;
    }

    public String getEditorial(){
        return editorial;
    }

    public int getYear(){
        return year;
    }

    public double getPrice(){
        return year;
    }

    //sobre escritura del constructor, ya que este muestra en pantalla
    // la informacion del libro basado en su posicion en memoria , con esto podemos mostrar la informacion
    @Override
    public String toString() {
        return "\n Title: " + title + "\n" + "Autor:" + autor;
    }
}
