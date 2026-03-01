public class BookTest {
    public static void main(String[] args) {
        Book b1 = new Book("Malibu Rising", "Taylor Jenkins Reid", "999-3-16-148572", 255.55, false);
        b1.displayBookInfo();

        Book b2 = new Book();
        b2.setTitle("Harry Potter and the Philosopher's Stone");
        b2.setAuthor("J. K. Rowling");
        b2.setIsbn("978-3-16-148410");
        b2.setCost(500.00);
        b2.setIsAvailable(true);
        b2.displayBookInfo();
    }
}