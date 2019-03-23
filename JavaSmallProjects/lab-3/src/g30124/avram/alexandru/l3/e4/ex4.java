package g30124.avram.alexandru.l3.e4;

import becker.robots.*;

public class ex4
{
    public static void main(String[] args)
    {
        // Set up the initial situation
        City LosAngeles = new City();
        Wall A0 = new Wall(LosAngeles, 1, 1, Direction.WEST);
        Wall A1 = new Wall(LosAngeles, 2, 1, Direction.WEST);
        Wall B0 = new Wall(LosAngeles, 2, 1, Direction.SOUTH);
        Wall B1 = new Wall(LosAngeles, 2, 2, Direction.SOUTH);
        Wall C0 = new Wall(LosAngeles, 2, 2, Direction.EAST);
        Wall C1 = new Wall(LosAngeles, 1, 2, Direction.EAST);
        Wall D0 = new Wall(LosAngeles, 1, 1, Direction.NORTH);
        Wall D1 = new Wall(LosAngeles, 1, 2, Direction.NORTH);
        Robot steve = new Robot(LosAngeles, 0, 2, Direction.WEST);




            steve.turnLeft();
            steve.turnLeft();
            steve.move();
            steve.turnLeft();
            steve.turnLeft();
            steve.turnLeft();
            steve.move();
            steve.move();
            steve.move();
            steve.turnLeft();
            steve.turnLeft();
            steve.turnLeft();
            steve.move();
            steve.move();
            steve.move();
            steve.turnLeft();
            steve.turnLeft();
            steve.turnLeft();
            steve.move();
            steve.move();
            steve.move();
            steve.turnLeft();
            steve.turnLeft();
            steve.turnLeft();
            steve.move();
            steve.move();

    }
}