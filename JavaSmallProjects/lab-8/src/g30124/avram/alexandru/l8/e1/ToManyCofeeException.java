package g30124.avram.alexandru.l8.e1;

public class ToManyCofeeException extends Exception {
    int to;
    public ToManyCofeeException(int to,String msg) {
        super(msg);
        this.to = to;
    }

    int getTO(){
        return to;
    }

}
