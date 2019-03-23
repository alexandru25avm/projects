package g30124.avram.alexandru.l4.e6;
import g30124.avram.alexandru.l4.e4.Author;
import org.junit.*;

import static org.junit.Assert.assertEquals;

public class BookTest {

    @Test
    public void TestGetName() {
        Author[] authors = new Author[2];
        authors[0] = new Author("Ion Creanga", "ion.creanga@junimea.ro", 'M');
        authors[1] = new Author(" Robert T. Kiyosaki", "robert.kiyosaki@business.ro", 'M');
        Book b1 = new Book("Tata bogat ,tata sarac", 100, 10, authors);

        assertEquals("Tata bogat ,tata sarac", b1.getName());
    }

    @Test
    public void TestGetPrice() {
        Author[] authors = new Author[3];
        authors[0] = new Author("Mihai Eminescu", "ion.creanga@junimea.ro", 'M');
        authors[1] = new Author("Ion Creanga", "mihai.eminescu@junimea.ro", 'M');
        authors[2] = new Author("Ioan Slavici", "Ioan.Slavici@junimea.ro", 'M');
        Book b1 = new Book("Literatura Romaneasca", 50, 10, authors);

        assertEquals(50, b1.getPrice(), 0.01);
    }

    @Test
    public void TestGetQtyInStock() {
        Author[] authors = new Author[4];
        authors[0] = new Author("Mihai Eminescu", "ion.creanga@junimea.ro", 'M');
        authors[1] = new Author("Ion Creanga", "mihai.eminescu@junimea.ro", 'M');
        authors[2] = new Author("Ioan Slavici", "Ioan.Slavici@junimea.ro", 'M');
        authors[3] = new Author("Camil Petrescu", "Camil.Petrescu@junimea.ro", 'M');
        Book b1 = new Book("Literatura Romaneasca Esentiala", 50, 10, authors);

        assertEquals(10, b1.getQtyInStock());
    }

    @Test
    public void TestSetPrice() {
        Author[] authors = new Author[2];
        authors[0] = new Author("Mihai Eminescu", "ion.creanga@junimea.ro", 'M');
        authors[1] = new Author("Ion Creanga", "mihai.eminescu@junimea.ro", 'M');
        Book book1 = new Book("BAC", 50, 10, authors);

        book1.setPrice(25);

        assertEquals(25, book1.getPrice(), 0.01);
    }

    @Test
    public void TestSetQtyInStock() {
        Author[] authors = new Author[2];
        authors[0] = new Author("Mihai Eminescu", "ion.creanga@junimea.ro", 'M');
        authors[1] = new Author("Ion Creanga", "mihai.eminescu@junimea.ro", 'M');
        Book book1 = new Book("BAC", 50, 10, authors);

        book1.setQtyInStock(1000);
        assertEquals(1000, book1.getQtyInStock(), 0.01);
    }

    @Test
    public void TestPrintAllAuthors() {
        Author[] authors = new Author[2];
        authors[0] = new Author("Mihai Eminescu", "ion.creanga@junimea.ro", 'M');
        authors[1] = new Author("Ion Creanga", "mihai.eminescu@junimea.ro", 'M');
        Book book1 = new Book("BAC", 50, 10, authors);

        assertEquals("Mihai Eminescu", authors[0].getName());
        assertEquals("Ion Creanga", authors[1].getName());

    }

    @Test
    public void TestToString() {
        Author[] authors = new Author[2];
        authors[0] = new Author("Mihai Eminescu", "ion.creanga@junimea.ro", 'M');
        authors[1] = new Author("Ion Creanga", "mihai.eminescu@junimea.ro", 'M');
        Book book1 = new Book("BAC", 50, 10, authors);
        assertEquals("'BAC' by 2 authors", book1.toString());
    }


}
