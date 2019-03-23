package g30124.avram.alexandru.l5.e1;

class Circle extends Shape {
    protected double radius;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI*radius*radius; //replace with formula for get area
    }

    public double getPerimeter() {
        return 2*Math.PI*radius; //replace with formula for get perimeter
    }
}
