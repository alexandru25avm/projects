package g30124.avram.alexandru.l4.e5;
import g30124.avram.alexandru.l4.e4.Author;
import org.junit.*;

import static java.lang.System.exit;
import static org.junit.Assert.*;

public class BookTest {

    @Test
    public void TestGetNameOfBook(){
        Author a1 = new Author("Ion Creanga","ion.creanga@junimea.ro",'M');
        Book b1 = new Book("Amintiri din copilarie",a1,100);
        assertEquals(b1.getName(),"Amintiri din copilarie" );

    }
    @Test
    public void TestGetAuthor(){
        Author a1 = new Author("Ion Creanga","ion.creanga@junimea.ro",'M');
        Author a2 = new Author("Mihai Eminescu ","Mihai.Eminescu@junimea.ro",'M');
        Book b1 = new Book("Amintiri din copilarie",a1,100);
        Book b2 = new Book("Amintiri din copilarie",a2,100);
        assertEquals("Ion Creanga", a1.getName());
        assertNotSame(b1.getAuthor(), b2.getName());
    }

    @Test
    public void TestGetPriceNotNull(){
        Author a1 = new Author("Ion Creanga","ion.creanga@junimea.ro",'M');
        Book b1 = new Book("Amintiri din copilarie",a1,100);
        assertNotNull(b1.getPrice());
    }
    @Test
    public void TestGetPrice(){
        Author a1 = new Author("Ion Creanga","ion.creanga@junimea.ro",'M');
        Book b1 = new Book("Amintiri din copilarie",a1,100);
        assertEquals(b1.getPrice(), 100, 0.0001);
    }

    @Test
    public void TestgetQtyInStock(){
        Author a1 = new Author(" Robert T. Kiyosaki","robert.kiyosaki@business.ro",'M');
        Book b1 = new Book("Tata bogat, tata sarac ",a1,100,20);
        assertEquals(20, b1.getQtyInStock());

    }
    @Test
    public void CountStock(){
        Author a1 = new Author(" Robert T. Kiyosaki","robert.kiyosaki@business.ro",'M');
        Book b1 = new Book("Tata bogat, tata sarac ",a1,100,20);
        double  StockPrice = b1.getQtyInStock() * b1.getPrice();
        if ( StockPrice > 1000 )
        assertEquals(2000, StockPrice,0.001);
        else exit(1);
    }

    @Test
    public void TestSetPrice(){
        Author a1 =new Author(" Robert T. Kiyosaki","robert.kiyosaki@business.ro",'M');
        Book b1 = new Book("Tata bogat, tata sarac ",a1,100,20);
        b1.setPrice(300);
        assertEquals(300, b1.getPrice(),0.01);
      //  System.out.println(b1.getPrice());
    }

    @Test
    public void TestsetQtyInStock(){
        Author a1 =new Author(" Robert T. Kiyosaki","robert.kiyosaki@business.ro",'M');
        Book b1 = new Book( "Tata bogat, tata sarac ",a1,100,20);

        b1.setQtyInStock(1000);

        assertEquals(1000, b1.getQtyInStock(),0.01);
        assertFalse(b1.getQtyInStock()==20);
    }

    @Test
    public void TestToString(){
        Author a1 =new Author(" Robert T. Kiyosaki","robert.kiyosaki@business.ro",'M');
        Book b1 = new Book( "Tata bogat, tata sarac ",a1,100,20);
        assertEquals("'Tata bogat, tata sarac ' by  Robert T. Kiyosaki (M) at robert.kiyosaki@business.ro",b1.toString());
    }

    

}
