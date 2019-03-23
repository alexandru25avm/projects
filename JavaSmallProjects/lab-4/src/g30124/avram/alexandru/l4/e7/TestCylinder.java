package g30124.avram.alexandru.l4.e7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCylinder
{

    @Test
    public void TestGetHeight(){
        Cylinder cylinder = new Cylinder(6,6);
        assertEquals(6, cylinder.getHeight(),0.01 );

    }


    @Test
    public void TestGetArea(){
        Cylinder cylinder = new Cylinder(2,3);
        assertEquals(28.26, cylinder.getArea(),0.01);

    }

    @Test
    public void TestGetVolume(){
        Cylinder cylinder = new Cylinder(2,3);
        assertEquals(56.52, cylinder.getVolume(),0.01);
    }



}
