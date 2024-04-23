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

    @Override
    public String toString() {
        return "Title: " + title + "\n" + "Autor:" + autor;
    }
}
