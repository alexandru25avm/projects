package g30124.avram.alexandru.l6.e1;

import java.awt.*;

public abstract class Shape {

    private Color color;
    private int x;
    private int y;
    private String ID;
    private boolean filled;

    public Shape(Color color, int x, int y, String ID, boolean filled) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.ID = ID;
        this.filled = filled;
    }

    public Shape(Color color, int x, int y, String ID) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.ID = ID;
    }

    public Shape(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void draw(Graphics g);

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

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }



}
