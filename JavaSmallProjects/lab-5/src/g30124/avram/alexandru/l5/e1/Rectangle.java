package g30124.avram.alexandru.l5.e1;

public class Rectangle extends Shape {
    protected double width;
    protected double lenght;

    public Rectangle(){

    }
    public Rectangle(double width, double lenght) {
        this.width = width;
        this.lenght = lenght;
    }

    public Rectangle(String color, boolean filled, double width, double lenght) {
        super(color, filled);
        this.width = width;
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getLenght() {
        return lenght;
    }



    public double getArea() {
        return getLenght()*getWidth(); //replace with formula for get area
    }

    public double getPerimeter() {
        return 2*(getLenght()+getWidth()); //replace with formula for get perimeter
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("red",true,4,2);
        System.out.println(rectangle.toString());
    }
}
