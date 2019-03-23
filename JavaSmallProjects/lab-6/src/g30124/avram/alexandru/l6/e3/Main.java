import g30124.avram.alexandru.l6.e3.Circle;
import g30124.avram.alexandru.l6.e3.DrawingBoard;
import g30124.avram.alexandru.l6.e3.Rectangle;
import g30124.avram.alexandru.l6.e3.Shape;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        DrawingBoard b1 = new DrawingBoard();
        Shape s1 = new Circle("2", Color.RED, 23,54,80,true);
        b1.addShape(s1);
        Shape s2 = new Circle("10",Color.GREEN, 80,50,100);
        b1.addShape(s2);
        Shape s3 = new Rectangle("30",Color.DARK_GRAY,160,120,150,100,true);
        b1.addShape(s3);
        Shape s4 = new Circle("43",Color.cyan,30,10,80);
        b1.addShape(s4);


        b1.deteleShape("2");
        b1.deteleShape("10");
    }
}
