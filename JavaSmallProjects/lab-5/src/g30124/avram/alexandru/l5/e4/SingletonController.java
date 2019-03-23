package g30124.avram.alexandru.l5.e4;

import g30124.avram.alexandru.l5.e3.Controller;
import g30124.avram.alexandru.l5.e3.LightSensor;
import g30124.avram.alexandru.l5.e3.TemperatureSensor;


public class SingletonController {

    private static volatile SingletonController instance = null;

    public SingletonController() {
    }

    public static SingletonController getInstance() {
        synchronized (SingletonController.class) {
            if (instance == null) {
                instance = new SingletonController();
            }
        }
        return instance;
    }
    LightSensor lightSensor = new LightSensor();
    TemperatureSensor temperatureSensor = new TemperatureSensor();
    public void control() {
        int i = 0;
        while (i < 20) {
            System.out.println("Temperature: "+temperatureSensor.readValue());
            System.out.println("Light: "+lightSensor.readValue());
            try {
                Thread.sleep(1000);
                System.out.println("---");
            } catch (InterruptedException e) {
                System.err.println(e);
            }
            i++;
        }
    }

    public static void main(String[] args) {
        SingletonController singletonController = new SingletonController();
        singletonController.control();
    }

}



