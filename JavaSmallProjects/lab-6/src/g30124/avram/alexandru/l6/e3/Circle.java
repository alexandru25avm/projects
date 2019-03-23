package g30124.avram.alexandru.l6.e3;
import java.awt.*;

public class Circle implements Shape{

    private int radius;
    private Color color;
    private int x;
    private int y;
    private String ID;
    private boolean filled;

    public Circle(Color color, int x, int y, int radius) {
        this.color=color;
        this.x=x;
        this.y=y;
        this.radius = radius;
    }

    public Circle(String ID,Color color, int x, int y,  int radius, boolean filled) {

        this.color=color;
        this.x=x;
        this.y=y;
        this.ID=ID;
        this.filled=filled;
        this.radius = radius;
    }

    public Circle(String ID, Color color, int x, int y, int radius) {
        this.color=color;
        this.x=x;
        this.y=y;
        this.ID=ID;

        this.radius = radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
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

