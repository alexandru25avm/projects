package g30124.avram.alexandru.l4.e8;

public class Rectangle  extends Shape {
    protected double width = 1.0;
    protected double length  = 1.0;

    public Rectangle(){
    }


    public Rectangle(double width, double length){
        this.length=length;
        this.width=width;
}
    public Rectangle(double width, double length, String color, boolean filled){
        super(color,filled);
        this.width=width;
        this.length=length;
}

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return getLength()*getWidth();
    }
    public double getPerimeter(){
        return 2*getLength()+getWidth()*2;
    }
    @Override
    public String toString(){
        return "A Rectangle with width= "+width+" and length="+length+" , which is a subclass of "+super.toString();
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2,4);
        rectangle.setColor("blue");
        System.out.println(rectangle.toString());

    }

}
