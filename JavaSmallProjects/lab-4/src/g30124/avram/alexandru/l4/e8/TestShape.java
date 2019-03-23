package g30124.avram.alexandru.l4.e8;

import org.junit.Test;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import static org.junit.Assert.assertEquals;

public class TestShape {
    @Test
    public void testGetColor(){
        Shape shape = new Shape("red",TRUE);
        assertEquals("red", shape.getColor());
    }
    @Test
    public void testIsFilled(){
        Shape shape = new Shape("red",true);
        assertEquals(true, shape.isFilled());
    }
    @Test
    public void testsetFilled(){
        Shape shape = new Shape("red",TRUE);
        shape.setFilled(FALSE);
        assertEquals(FALSE, shape.isFilled());
    }
    @Test
    public void testSetColor(){
        Shape shape = new Shape("red",TRUE);
        shape.setColor("black");
        assertEquals("black", shape.getColor());
    }
    @Test
    public void testToString(){
        Shape shape = new Shape("black",TRUE);
        assertEquals("a shape with color of black and true",shape.toString());
    }
}
