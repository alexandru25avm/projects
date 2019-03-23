package g30124.avram.alexandru.l4.e3;
import static org.junit.Assert.assertEquals;

import g30124.avram.alexandru.l4.e7.Cylinder;
import org.junit.Test;
public class TestCircle {

    @Test
    public void TestCircleArea(){
        Circle c1= new Circle(1,"blue");
        assertEquals(3.1415, c1.getArea(),0.01);
    }

    @Test
    public void TestCircleRadius(){
        Circle c2 = new Circle(10,"red");
        assertEquals(10,c2.getRadius(),0.01);
    }

}
