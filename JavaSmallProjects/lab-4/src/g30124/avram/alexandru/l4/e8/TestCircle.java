package g30124.avram.alexandru.l4.e8;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class TestCircle {
    @Test
    public void TestGetRadius(){
        Circle circle = new Circle(3 );
        assertEquals(3, circle.getRadius(),0.01);
    }
    @Test
    public void TestGetArea(){
        Circle circle = new Circle(3 );
        assertEquals(28.274, circle.getArea(),0.01);
    }
    @Test
    public void TestGetPerimeter(){
        Circle circle = new Circle(3 );
        assertEquals(18.849, circle.getPerimeter(),0.01);
    }
    @Test
    public void TestSetRadius(){
        Circle circle = new Circle(3 );
        circle.setRadius(10);
        assertEquals(10, circle.getRadius(),0.01);
    }

    @Test
    public void TestSetToString(){
        Circle circle = new Circle(3 );
        assertEquals("A Circle with radius=3.0 which is a subclass of a shape with color of red and true", circle.toString());
    }

}
