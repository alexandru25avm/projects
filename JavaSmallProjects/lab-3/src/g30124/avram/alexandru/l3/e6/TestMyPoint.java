package g30124.avram.alexandru.l3.e6;

public class TestMyPoint {

    public static void main(String[] args) {

        MyPoint p1 = new MyPoint(1, 0);
        System.out.println(p1);
        MyPoint p2 = new MyPoint(5, 0);
        System.out.println(p2);
        System.out.println("Distanta ,folosind metoda 1, de la puntul p1 de coordonate" +p1+  "la punctul p2 de coordonate "+p2+ "este:"+p1.Distance(p2));

        System.out.println("Distanta ,folosind metoda 2, de la puntul p1 de coordonate" +p1+  "la punctul p2 de coordonate "+p2+ "este:"+p1.Distance(5,0));

        }
}
