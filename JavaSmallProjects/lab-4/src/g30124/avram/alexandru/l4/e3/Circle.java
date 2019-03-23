package g30124.avram.alexandru.l4.e3;



public class Circle {
    private double radius=1.0;
    private String color="Red";

Circle(){
}
Circle(double radius , String color){
    this.color=color;
    this.radius=radius;
}

public double getRadius(){

    return radius;
}

public double getArea(){
    double A ;
    A = radius*radius*Math.PI;
    return A;
}

public static void main(String[] args) {

    Circle c1 = new Circle();
    Circle c2 = new Circle(2,"blue");
    System.out.println("Area=" + c1.getArea());
    System.out.println("Area=" + c2.getArea());


}

}

