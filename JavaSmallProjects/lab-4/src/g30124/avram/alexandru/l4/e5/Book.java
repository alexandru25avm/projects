package g30124.avram.alexandru.l4.e5;
import g30124.avram.alexandru.l4.e4.Author;


public class Book {
    private String name;
    private Author author;
    private double price;
    private int qtyInStock = 0;

    public Book(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }
    public Book(String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }
    public String getName() {
        return name;
    }
    public Author getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQtyInStock() {
        return qtyInStock;
    }
    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }
    @Override
    public String toString() {
        return "'" + name + "' " + "by " + author.getName() + " (" + author.getGender() + ") " + "at " + author.getEmail();

    }
    public static void main(String[] args) {
        Author a1 =new Author(" Robert T. Kiyosaki","robert.kiyosaki@business.ro",'M');

        Book b1 = new Book( "Tata bogat, tata sarac ",a1,100,20);

        System.out.println(b1.toString());
    }
}




