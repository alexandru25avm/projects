package g30124.avram.alexandru.l5.e3;

abstract class Sensor {

    String location;

    public abstract int readValue();

    public String getLocation(){
        return location;
    }



}

