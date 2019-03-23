package g30124.avram.alexandru.l8.e1;

class TemperatureException extends Exception{
    int t;
    public TemperatureException(int t,String msg) {
        super(msg);
        this.t = t;
    }

    int getTemp(){
        return t;
    }
}//.class
