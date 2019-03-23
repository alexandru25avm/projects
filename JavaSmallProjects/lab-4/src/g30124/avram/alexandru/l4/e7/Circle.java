package g30124.avram.alexandru.l4.e7;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String toString() {
        return "Radius: " + radius + "color: "+color ;
    }

    public double getArea() {
        return 3.14*(radius*radius);
    }
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        System.out.println("Area: " +circle.getArea());
        System.out.println(circle.toString());
    }


}
