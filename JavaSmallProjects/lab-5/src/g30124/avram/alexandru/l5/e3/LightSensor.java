package g30124.avram.alexandru.l5.e3;

import java.util.Random;

public class LightSensor extends Sensor {
    public int readValue(){
        Random random = new Random();
        return random.nextInt(100);
    }
}
