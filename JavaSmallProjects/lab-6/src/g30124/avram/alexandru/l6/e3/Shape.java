package g30124.avram.alexandru.l6.e3;

import java.awt.*;

public interface Shape {
    abstract void draw(Graphics g);
    String getID();

    public Color getColor();
    public void setColor(Color color);
    public int getX();
    public void setX(int x);
    public int getY();
    public void setY(int y);
    public boolean isFilled();
    public void setFilled(boolean filled);
    public void setID(String ID);


}
