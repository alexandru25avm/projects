package g30124.avram.alexandru.l4.e4;
import org.junit.*;

import static org.junit.Assert.*;


public class AuthorTest {


    @Test
    public void TestGetName(){
        Author a1 = new Author("Ion Creanga","ion.creanga@junimea.ro",'M');
        assertEquals("Ion Creanga","Ion Creanga" );
        Author a2 = new Author("Mihai Eminescu","mihai.eminescu@junimea.ro",'M');
        assertNotSame(a2.getName(), a1.getName());
    }
    @Test
    public void TestGetEmail(){
        Author a1 = new Author("Ion Creanga","ion.creanga@junimea.ro",'M');
        Author a2 = new Author("Mihai Eminescu","mihai.eminescu@junimea.ro",'M');
        assertNotNull(a1.getEmail());
    }
    @Test
    public void TestGetGender(){
        Author a1 = new Author("Ion Creanga","ion.creanga@junimea.ro",'M');
        Author a2 = new Author("Mihai Eminescu","mihai.eminescu@junimea.ro",'M');
        assertNotNull(a1.getGender());
        assertNotNull(a2.getGender());
        assertSame(a1.getGender(),a2.getGender() );
    }
    @Test
    public void TestSetEmail(){
        Author a1 = new Author("Ion Creanga","ion.creanga@junimea.ro",'M');
        a1.setEmail("office@junimea.ro");
        assertEquals(a1.getEmail(),"office@junimea.ro" );
    }
}
