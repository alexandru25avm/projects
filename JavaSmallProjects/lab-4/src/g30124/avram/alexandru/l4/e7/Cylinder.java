package g30124.avram.alexandru.l4.e7;

public class Cylinder extends Circle {
    private double height;


    public Cylinder(){
        super();
        this.height=1.0;
    }

    public Cylinder( double radius) {
        super(radius);
    }

    public Cylinder( double height,double radius) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume(){
        return getArea()*height;
    }

    public double getArea(){
        return super.getArea();
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(2,3);
        System.out.println("Area:"+cylinder.getArea());
        System.out.println("Volume: "+cylinder.getVolume());


    }

}
