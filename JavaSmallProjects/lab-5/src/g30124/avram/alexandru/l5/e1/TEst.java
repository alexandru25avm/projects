package g30124.avram.alexandru.l5.e1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TEst {
    @Test
    public void testGetAreaRect(){
        Shape rectangle = new Rectangle(2,4);
        rectangle.setColor("red");
        assertEquals(8, rectangle.getArea(),0.01);

    }

    @Test
    public void testGetPerimRect(){
        Shape rectangle = new Rectangle( 2 ,10);
        assertEquals(24, rectangle.getPerimeter(),0.01);
    }

    @Test
    public void testGetAreaSquare() {
        Shape s = new Square() {
            @Override
            public double getSide(double side) {
                return super.getSide(side);
            }
        };
        ((Square) s).setSide(12);
        assertEquals(144.0, ((Square) s).getArea(), 0.1);
    }

    @Test
    public void testGetPerimeterSquare(){
        Shape square = new Square() {
            @Override
            public double getSide(double side) {
                return super.getSide(side);
            }
        };
        ((Square)square).setSide(10);

        assertEquals(40, ((Square)square).getPerimeter(),0.01);

    }
    @Test
    public void testGetAreaCircle(){
        Shape circle = new Circle(2);
        assertEquals(12.56, circle.getArea(),0.01);

    }
    public void testGetPerimeterCircle(){
        Shape circle = new Circle(2);
        assertEquals(12.56, circle.getPerimeter(),0.01);

    }
}
