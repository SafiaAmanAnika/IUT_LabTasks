public class Book {
    private String title, author, isbn;
    private double cost;
    private Boolean isAvailable;

    public Book(){}
    public Book(String title, String author, String isbn, double cost, Boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.cost = cost;
        this.isAvailable = isAvailable;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }

    public Boolean getIsAvailable() {
        return isAvailable;
    }
    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public void displayBookInfo() {
        System.out.println(
            "Book name: " + getTitle() + "\nBook author: " + getAuthor()
            + "\nBook ISBN: " + getIsbn() + "\nBook cost: Tk. " + getCost()
            + "\nBook availability: " + (getIsAvailable()? "Yes" : "No"));
        System.out.println("------------------------");
    }
}