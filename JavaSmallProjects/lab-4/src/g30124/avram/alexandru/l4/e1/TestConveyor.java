package g30124.avram.alexandru.l4.e1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TestConveyor {

    @Test
    public void shouldAddBox(){
        Conveyor c = new Conveyor();
        Box b = new Box(c,0,1);
        assertEquals(b.getId(), c.getBox(0).getId());
    }

    @Test
    public void shouldMoveBoxToRight(){
        Conveyor c = new Conveyor();
        Box b = new Box(c,1,1);
        c.moveRight();
        assertEquals(b.getId(), c.getBox(2).getId());
    }

    @Test
    public void shouldMoveBoxToLeft(){
        Conveyor c = new Conveyor();
        Box b = new Box(c,2,1);
        c.moveLeft();
        assertEquals(b.getId(), c.getBox(1).getId());


    }

}