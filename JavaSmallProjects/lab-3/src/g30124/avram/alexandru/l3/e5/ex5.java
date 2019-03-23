package g30124.avram.alexandru.l3.e5;

import becker.robots.*;

public class ex5
{
    public static void main(String[] args) {

        City LasVegas = new City();
        Wall block0 = new Wall(LasVegas, 1, 1, Direction.WEST);
        Wall block1 = new Wall(LasVegas, 2, 1, Direction.WEST);
        Wall block2 = new Wall(LasVegas, 2, 1, Direction.SOUTH);
        Wall block3 = new Wall(LasVegas, 2, 2, Direction.SOUTH);
        Wall block4 = new Wall(LasVegas, 1, 2, Direction.EAST);
        Wall block5 = new Wall(LasVegas, 1, 1, Direction.NORTH);
        Wall block6 = new Wall(LasVegas, 1, 2, Direction.NORTH);
        Wall block7 = new Wall(LasVegas, 1, 2, Direction.SOUTH);
        Robot mark = new Robot(LasVegas, 1, 2, Direction.SOUTH);
        Thing newsletter = new Thing(LasVegas, 2, 2);
        mark.turnLeft();
        mark.turnLeft();
        mark.turnLeft();
        mark.move();
        mark.turnLeft();
        mark.move();
        mark.turnLeft();
        mark.move();
        mark.pickThing();
        mark.turnLeft();
        mark.turnLeft();
        mark.move();
        mark.turnLeft();
        mark.turnLeft();
        mark.turnLeft();
        mark.move();
        mark.turnLeft();
        mark.turnLeft();
        mark.turnLeft();
        mark.move();
        mark.turnLeft();
        mark.turnLeft();

    }
    }