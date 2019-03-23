package g30124.avram.alexandru.l6.e1;
import java.awt.*;

public class Rectangle extends Shape{

    private int length;
    private int width;

    public Rectangle(Color color, int x, int y, int length, int width) {
        super(color, x, y);
        this.length = length;
        this.width = width;
    }

    public Rectangle(String ID,Color color, int x, int y, int length, int width, boolean filled) {
        super(color, x, y, ID, filled);
        this.length = length;
        this.width = width;
    }

    public Rectangle(String ID, Color color, int x, int y, int length, int width) {
        super(color, x, y, ID);
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw(Graphics g) {
        System.out.println("Drawing a rectangel with length "+length+" and width "+width+" "+getColor().toString()+"and ID:"+super.getID());
        g.setColor(getColor());
        g.drawRect(getX(), getY(), width, length);

        if ( isFilled() == true)
        {
            g.fillRect(getX(), getY(), width, length);
        }


    }


}
