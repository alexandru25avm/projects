package g30124.avram.alexandru.l4.e6;

import g30124.avram.alexandru.l4.e4.Author;



public class Book {

    private String name;
    private double price;
    private int qtyInStock = 0 ;
    Author[] authors=new Author[3];

    public Book(String name, double price, int qtyInStock, Author[] authors) {
        this.name = name;
        this.price = price;
        this.qtyInStock = qtyInStock;
        this.authors = authors;
    }

    public Book(String name, double price, Author[] authors) {
        this.name = name;
        this.price = price;
        this.authors = authors;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public String toString() {
        return "'"+name+"' "+"by "+ authors.length+" authors";
    }
    public void PrintAllAuthors(){
        for ( int i=0 ; i< this.getAuthors().length ; i++)
        {
            System.out.println("Author["+i+"]:"+authors[i]);
        }

    }

    public static void main(String[] args) {
        Author[] authors=new Author[2];
        authors [0] = new Author("Ion Creanga","ion.creanga@junimea.ro",'M');
        authors [1] = new Author(" Robert T. Kiyosaki","robert.kiyosaki@business.ro",'M');

        Book b1 = new Book("Tata bogat ,tata sarac ",100,10,authors);
        System.out.println(b1.toString());
        System.out.println("---");
        b1.PrintAllAuthors();
    }
}
