package g30124.avram.alexandru.l4.e8;

import static java.lang.Boolean.TRUE;

public class Square extends Rectangle {
    public Square(){

    }
    public Square(double side){
        super.length=side;
        super.width=side;
    }
    public Square(double side, boolean filled, String color){
        super.length=side;
        super.width=side;
        super.color=color;
        super.filled=filled;

    }

    public double getSide(){
        return length; // return width ( width = lenght ) ;
    }

    public void setSide(double side){
        super.length=side;
        super.width=side;
    }
    public void setWidth(double side){
        super.length=side;
        super.width=side;
    }

    public String toString(){
        return "A Square with side= "+length+" , which is a subclass of "+super.toString();
    }

    public static void main(String[] args) {
        Square square = new Square(4,TRUE,"red");
        System.out.println(square.toString());
    }
}
