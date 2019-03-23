package g30124.avram.alexandru.l5.e3;

public class Controller {
    TemperatureSensor temperatureSensor = new TemperatureSensor();
    LightSensor lightSensor = new LightSensor();

    public Controller(TemperatureSensor temperatureSensor, LightSensor lightSensor) {
        this.temperatureSensor = temperatureSensor;
        this.lightSensor = lightSensor;
    }

    public void control() {
        int i = 0;
        while (i < 20) {
            System.out.println("Temperature: "+temperatureSensor.readValue());
            System.out.println("Light: "+lightSensor.readValue());
            try {
                Thread.sleep(1000);
                System.out.println("---");
            } catch (Exception e) {
                System.out.println("ERROR: "+e );
            }
            i++;
        }
    }

    public static void main(String[] args) {
        Controller controller = new Controller(new TemperatureSensor(),new LightSensor());
        controller.control();
    }


}
