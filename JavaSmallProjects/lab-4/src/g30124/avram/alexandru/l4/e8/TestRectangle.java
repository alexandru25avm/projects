package g30124.avram.alexandru.l4.e8;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestRectangle {
    @Test
    public void TestGetWidth(){
        Rectangle rectangle = new Rectangle(2,1);
        assertEquals(2, rectangle.getWidth(),0.01);
    }
    @Test
    public void TestGetLength(){
        Rectangle rectangle = new Rectangle(2,1);
        assertEquals(1, rectangle.getLength(),0.01);
    }

    @Test
    public void TestSetLength(){
        Rectangle rectangle = new Rectangle(2,1);
        rectangle.setLength(10);
        assertEquals(10, rectangle.getLength(),0.01);
    }
    @Test
    public void TestSetWidth(){
        Rectangle rectangle = new Rectangle(2,1);
        rectangle.setWidth(10);
        assertEquals(10, rectangle.getWidth(),0.01);
    }
    @Test
    public void TestGetPerimeter(){
        Rectangle rectangle = new Rectangle(2,1);
        assertEquals(6, rectangle.getPerimeter(),0.01);
    }
    @Test
    public void TestGetArea(){
        Rectangle rectangle = new Rectangle(2,1);
        assertEquals(2, rectangle.getArea(),0.01);
    }
    @Test
    public void TestToString(){
        Rectangle rectangle = new Rectangle(2,4);
        rectangle.setColor("blue");
        assertEquals("A Rectangle with width= 2.0 and length=4.0 , which is a subclass of a shape with color of blue and true", rectangle.toString());
    }



}
