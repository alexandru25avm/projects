package g30124.avram.alexandru.l4.e2;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class TestPoint {

    @Test
    public void shouldDistance() {
        MyPoint p1 = new MyPoint(1, 0);
        MyPoint p2 = new MyPoint(5, 0);
        assertEquals(p1.Distance(5 , 0),4);



        assertEquals(p1.Distance(p2),4);
    }
}
