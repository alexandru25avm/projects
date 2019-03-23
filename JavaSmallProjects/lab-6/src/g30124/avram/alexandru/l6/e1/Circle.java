package g30124.avram.alexandru.l6.e1;
import java.awt.*;

public class Circle extends Shape{

    private int radius;

    public Circle(Color color, int x, int y, int radius) {
        super(color, x, y);
        this.radius = radius;
    }

    public Circle(String ID,Color color, int x, int y,  int radius, boolean filled) {
        super(color, x, y, ID, filled);
        this.radius = radius;
    }

    public Circle(String ID, Color color, int x, int y, int radius) {
        super(color, x, y, ID);
        this.radius = radius;
    }


    public int getRadius() {
        return radius;
    }


    @Override
    public void draw(Graphics g) {
        System.out.println("Drawing a circle "+this.radius+" color: "+getColor().toString()+" and ID: "+getID());

        g.setColor(getColor());
        g.drawOval(getX(), getY(), radius, radius);
        if ( isFilled() == true)
        {
            g.fillOval(getX(), getY(), radius, radius);
        }

    }
}
