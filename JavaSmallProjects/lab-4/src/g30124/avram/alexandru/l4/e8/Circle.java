package g30124.avram.alexandru.l4.e8;

public class Circle extends Shape{
    protected double radius=1.0;

    public Circle(){

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(boolean filled,double radius , String color ){
        super(color,filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "A Circle with radius="+radius+" which is a subclass of "+ super.toString();
    }

    public static void main(String[] args) {
        Circle circle = new Circle(3 );
        System.out.println(circle.toString());

    }

}
