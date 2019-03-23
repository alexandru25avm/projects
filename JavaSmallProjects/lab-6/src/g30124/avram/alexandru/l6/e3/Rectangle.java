package g30124.avram.alexandru.l6.e3;
import java.awt.*;

public class Rectangle implements Shape{

    private int length;
    private int width;
    private Color color;
    private int x;
    private int y;
    private String ID;
    private boolean filled;

    public Rectangle(Color color, int x, int y, int length, int width) {

        this.color=color;
        this.x=x;
        this.y=y;
        this.length = length;
        this.width = width;
    }

    public Rectangle(String ID,Color color, int x, int y, int length, int width, boolean filled) {

        this.ID = ID;
        this.filled = filled;
        this.color=color;
        this.x=x;
        this.y=y;
        this.length = length;
        this.width = width;
    }

    public Rectangle(String ID, Color color, int x, int y, int length, int width) {

        this.length = length;
        this.width = width;
        this.color=color;
        this.x=x;
        this.y=y;
    }


    public int getLength() {
        return length;
    }


    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }
    
    public void setWidth(int width) {
        this.width = width;
    }
    @Override
    public Color getColor() {
        return color;
    }
    @Override
    public void setColor(Color color) {
        this.color = color;
    }
    @Override
    public int getX() {
        return x;
    }
    @Override
    public void setX(int x) {
        this.x = x;
    }
    @Override
    public int getY() {
        return y;
    }
    @Override
    public void setY(int y) {
        this.y = y;
    }
    @Override
    public String getID() {
        return ID;
    }
    @Override
    public void setID(String ID) {
        this.ID = ID;
    }
    @Override
    public boolean isFilled() {
        return filled;
    }
    @Override
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public void draw(Graphics g) {
        System.out.println("Drawing a rectangel with length "+length+" and width "+width+" "+getColor().toString()+"and ID:"+getID());
        g.setColor(getColor());
        g.drawRect(getX(), getY(), width, length);

        if ( isFilled() == true)
        {
            g.fillRect(getX(), getY(), width, length);
        }


    }


}
