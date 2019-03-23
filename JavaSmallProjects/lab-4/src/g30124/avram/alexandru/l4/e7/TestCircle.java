package g30124.avram.alexandru.l4.e7;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCircle {

    @Test
    public void TestCircleArea(){
       Circle c1= new Circle(1);
        assertEquals(3.1415, c1.getArea(),0.01);
    }

    @Test
    public void TestCircleRadius(){
        Circle c2 = new Circle(1);
        assertEquals(1,c2.getRadius(),0.01);

    }
    @Test
    public void TestToString(){
        Circle c3 = new Circle(2);
        assertEquals("Radius: 2.0color: red",c3.toString() );
    }

}
