package g30124.avram.alexandru.l4.e8;

public class Shape {
    protected String color = "red";
    protected boolean filled = true;


    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString(){
        return "a shape with color of "+color+" and "+filled;
    }

    public static void main(String[] args) {
        Shape shape= new Shape("black",true);
        System.out.println(shape.toString());
    }
}
