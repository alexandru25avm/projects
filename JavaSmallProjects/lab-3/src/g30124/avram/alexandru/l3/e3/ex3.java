package g30124.avram.alexandru.l3.e3;
import becker.robots.*;
//ex4
public class ex3 {
    public static void main(String[] args) {
        // Set up the initial situation
        City ny = new City();
        Robot karel = new Robot(ny, 1, 1, Direction.EAST);
        karel.move();
        karel.move();
        karel.move();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
    }
}