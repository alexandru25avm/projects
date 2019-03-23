package g30124.avram.alexandru.l8.e1;

public class TestMyException {
    public static void f() throws MyException {
        System.out.println("Exceptie in f()");
        throw new MyException();
    }
    public static void g() throws MyException {
        System.out.println("Exceptie in g()");
        throw new MyException("aruncata din g()");
    }
    public static void main(String[] args) {
        try {
            f();
        } catch(MyException e) {e.printStackTrace();}
        try {
            g();
        } catch(MyException e) {e.printStackTrace();}
    }
}

