package isOverlapOrNot
// You are given the coordinates for two rectangles, having all sides parallel to the axes.
// Find out if the rectangles overlap or not.

public class Punct {
    int x;
    int y;

    public Punct(int x, int y) {
        this.x = x;
        this.y = y;
    }



    public static boolean isOverlap(Punct A, Punct B, Punct C, Punct D, Punct A1, Punct B1, Punct C1, Punct D1) {
        if ( B.x < A1.x || B.y < D1.y || A.y < D1.y || A.x > B1.x || A.y < C1.y || D.y > A1.y ) {
            return false;
        }
        return true;

    }

    public static void main(String[] args) {
        Punct A = new Punct(10, 10);
        Punct B = new Punct(15, 10);
        Punct C = new Punct(15, 5);
        Punct D = new Punct(10, 5);
        Punct A1 = new Punct(5, 15);
        Punct B1 = new Punct(20, 15);
        Punct C1 = new Punct(20, 7);
        Punct D1 = new Punct(5, 7);
        double m = ((B.y - A.y) / (B.x - A.x));

        if (m == 0 && (A.x == D.x && B.x == C.x)) {
            System.out.println("Dreapta AB este paralela cu axa orizontala");
            System.out.println("Dreapta AD si BC este paralela cu axa verticala");


        if (isOverlap(A,B,C,D,A1,B1,C1,D1)) {
            System.out.println("Rectangles overlap");
        } else {
            System.out.println("Rectangles don't overlap");
        }

}

    }
}