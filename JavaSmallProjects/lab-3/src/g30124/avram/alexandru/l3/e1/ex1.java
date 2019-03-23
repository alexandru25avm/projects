package g30124.avram.alexandru.l3.e1;
import becker.robots.*;

public class ex1
{
    public static void main(String[] args)
    {
        // Set up the initial situation
        City prague = new City();
        Thing parcel = new Thing(prague, 1, 2);
        Robot karel = new Robot(prague, 1, 10, Direction.EAST);
        Thing parcel2 = new Thing(prague, 1, 5);
        // Direct the robot to the final situation
        karel.turnLeft();	// start turning right as three turn lefts
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
        karel.move();
        karel.move();
        karel.pickThing();
        karel.move();
        karel.move();
        karel.move();
        karel.pickThing();
        karel.turnLeft();	// start turning right as three turn lefts
        karel.turnLeft();	// finished turning right
        karel.move();
        karel.move();
        karel.move();
        karel.move();
        karel.move();
        karel.move();
        karel.move();
        karel.move();
        karel.putThing();
        karel.move();
        karel.putThing();
        karel.move();
        karel.move();
    }
}