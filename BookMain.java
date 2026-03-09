
public class BookMain {
    public static void main(String[] args) {

        Book book1 = new Book("Atomic Habits", "James Clear", "1111", 500, 10);
        Book book2 = new Book("Data Structures", "Seymour Lipschutz", "2222", 800, 0);

        System.out.println("------ Book 1 Details ------");
        book1.displayBook();
        book1.applyDiscount(10);
        book1.addStock(5);
        book1.checkAvailability();

        System.out.println("\n------ Book 2 Details ------");
        book2.displayBook();
        book2.applyDiscount(5);
        book2.addStock(10);
        book2.checkAvailability();
    }
}

