package g30124.avram.alexandru.l9.e1;

import javax.swing.*;


   public class SimpleApp extends JFrame{

    SimpleApp(){
        setTitle("Title1");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,500);
        setVisible(true);
    }

    public static void main(String[] args) {
        SimpleApp a = new SimpleApp();
    }

}