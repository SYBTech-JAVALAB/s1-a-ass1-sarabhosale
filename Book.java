
public class Book {

    private String title;
    private String author;
    private String isbn;
    private double price;
    private int stock;

    public Book(String title, String author, String isbn, double price, int stock) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
        this.stock = stock;
    }

    public void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Price: " + price);
        System.out.println("Stock: " + stock);
    }

    public void applyDiscount(double percent) {
        price = price - (price * percent / 100);
        System.out.println("Price after " + percent + "% discount = " + price);
    }

    public void addStock(int quantity) {
        stock = stock + quantity;
        System.out.println(quantity + " books added. New stock = " + stock);
    }

    public void checkAvailability() {
        if (stock > 0) {
            System.out.println("Book is available for purchase.");
        } else {
            System.out.println("Book is out of stock.");
        }
    }

}