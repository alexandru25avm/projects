package g30124.avram.alexandru.l4.e8;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestSquare {
    @Test
    public void testGetSide(){
        Square square=new Square(2);
        assertEquals(2,square.getSide(),0.01);
    }

    @Test
    public void testSetSide(){
        Square square=new Square(2);
        square.setSide(100);
        assertEquals(100,square.getSide(),0.01);
    }

    @Test
    public void testSetWidth(){
        Square square=new Square(2);
        square.setWidth(2000);
        assertEquals(2000, square.getWidth(),0.01);
    }
    @Test
    public void testToString(){
        Square square=new Square(4,true,"red");
        assertEquals("A Square with side= 4.0 , which is a subclass of A Rectangle with width= 4.0 and length=4.0 , which is a subclass of a shape with color of red and true", square.toString());
    }

}
