package g30124.avram.alexandru.l9.e4;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class TicTacToe extends JFrame {

    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9;
    JTextField tWin;
    public int counter = 0;

    TicTacToe() {

        setTitle("X&0");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        init();
        setSize(500, 500);
        setVisible(true);
    }

    public void init() {

        this.setLayout(null);
        int width = 80;
        int height = 80;

        tWin = new JTextField();
        tWin.setBounds(160, 20, 80, 20);

        b1 = new JButton();
        b1.setBounds(40, 80, width, height);

        b2 = new JButton();
        b2.setBounds(40, 160, width, height);

        b3 = new JButton();
        b3.setBounds(40, 240, width, height);

        b4 = new JButton("");
        b4.setBounds(120, 80, width, height);

        b5 = new JButton();
        b5.setBounds(120, 160, width, height);

        b6 = new JButton();
        b6.setBounds(120, 240, width, height);

        b7 = new JButton();
        b7.setBounds(200, 80, width, height);

        b8 = new JButton();
        b8.setBounds(200, 160, width, height);

        b9 = new JButton();
        b9.setBounds(200, 240, width, height);

        b1.addActionListener(new TicTacToe.TratareButon1());
        b2.addActionListener(new TicTacToe.TratareButon2());
        b3.addActionListener(new TicTacToe.TratareButon3());
        b4.addActionListener(new TicTacToe.TratareButon4());
        b5.addActionListener(new TicTacToe.TratareButon5());
        b6.addActionListener(new TicTacToe.TratareButon6());
        b7.addActionListener(new TicTacToe.TratareButon7());
        b8.addActionListener(new TicTacToe.TratareButon8());
        b9.addActionListener(new TicTacToe.TratareButon9());

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(tWin);

    }

    public String GameOver() {
        String g = "";
        if (TicTacToe.this.b1.getText().equals(TicTacToe.this.b2.getText()) && TicTacToe.this.b1.getText().equals(TicTacToe.this.b3.getText()) && !(TicTacToe.this.b1.getText().equals("")))//l1
            g = TicTacToe.this.b1.getText();

        else if (TicTacToe.this.b1.getText().equals(TicTacToe.this.b4.getText()) && TicTacToe.this.b1.getText().equals(TicTacToe.this.b7.getText())&& !(TicTacToe.this.b1.getText().equals("")))//c1
            g = TicTacToe.this.b1.getText();

        else if (TicTacToe.this.b1.getText().equals(TicTacToe.this.b5.getText()) && TicTacToe.this.b1.getText().equals(TicTacToe.this.b9.getText())&& !(TicTacToe.this.b1.getText().equals("")))//d1
            g = TicTacToe.this.b1.getText();

        else if (TicTacToe.this.b4.getText().equals(TicTacToe.this.b5.getText()) && TicTacToe.this.b4.getText().equals(TicTacToe.this.b6.getText())&& !(TicTacToe.this.b4.getText().equals("")))//l2
            g = TicTacToe.this.b4.getText();

        else if (TicTacToe.this.b7.getText().equals(TicTacToe.this.b8.getText()) && TicTacToe.this.b7.getText().equals(TicTacToe.this.b9.getText())&& !(TicTacToe.this.b7.getText().equals("")))//l3
            g = TicTacToe.this.b7.getText();

        else if (TicTacToe.this.b2.getText().equals(TicTacToe.this.b5.getText()) && TicTacToe.this.b2.getText().equals(TicTacToe.this.b8.getText())&& !(TicTacToe.this.b2.getText().equals("")))//c2
            g = TicTacToe.this.b2.getText();

        else if (TicTacToe.this.b3.getText().equals(TicTacToe.this.b6.getText()) && TicTacToe.this.b3.getText().equals(TicTacToe.this.b9.getText())&& !(TicTacToe.this.b3.getText().equals("")))//c3
            g = TicTacToe.this.b3.getText();

        else if (TicTacToe.this.b3.getText().equals(TicTacToe.this.b5.getText()) && TicTacToe.this.b3.getText().equals(TicTacToe.this.b7.getText())&& !(TicTacToe.this.b3.getText().equals("")))//d2
            g = TicTacToe.this.b3.getText();

        return g;
    }

    public static void main(String[] args) {
        new TicTacToe();
    }

    class TratareButon1 implements ActionListener {


        public void actionPerformed(ActionEvent e) {
            if (GameOver().equals("")) {
                if (TicTacToe.this.b1.getText().equals("")) {
                    if (counter % 2 == 1)
                        TicTacToe.this.b1.setText("X");
                    else
                        TicTacToe.this.b1.setText("0");
                    counter++;
                }
            } else
                TicTacToe.this.tWin.setText("Winner : " + GameOver());
        }
    }

    class TratareButon2 implements ActionListener {


        public void actionPerformed(ActionEvent e) {
            if (GameOver().equals("")) {
                if (TicTacToe.this.b2.getText().equals("")) {
                    if (counter % 2 == 1)
                        TicTacToe.this.b2.setText("X");
                    else
                        TicTacToe.this.b2.setText("0");
                    counter++;
                }
            } else
                TicTacToe.this.tWin.setText("Winner : " + GameOver());
        }
    }

    class TratareButon3 implements ActionListener {


        public void actionPerformed(ActionEvent e) {
            if (GameOver().equals("")) {
                if (TicTacToe.this.b3.getText().equals("")) {
                    if (counter % 2 == 1)
                        TicTacToe.this.b3.setText("X");
                    else
                        TicTacToe.this.b3.setText("0");
                    counter++;
                }
            } else
                TicTacToe.this.tWin.setText("Winner : " + GameOver());
        }
    }

    class TratareButon4 implements ActionListener {


        public void actionPerformed(ActionEvent e) {
            if (GameOver().equals("")) {
                if (TicTacToe.this.b4.getText().equals("")) {
                    if (counter % 2 == 1)
                        TicTacToe.this.b4.setText("X");
                    else
                        TicTacToe.this.b4.setText("0");
                    counter++;
                }
            } else
                TicTacToe.this.tWin.setText("Winner : " + GameOver());
        }
    }

    class TratareButon5 implements ActionListener {


        public void actionPerformed(ActionEvent e) {
            if (GameOver().equals("")) {
                if (TicTacToe.this.b5.getText().equals("")) {
                    if (counter % 2 == 1)
                        TicTacToe.this.b5.setText("X");
                    else
                        TicTacToe.this.b5.setText("0");
                    counter++;
                }
            } else
                TicTacToe.this.tWin.setText("Winner : " + GameOver());
        }
    }

    class TratareButon6 implements ActionListener {


        public void actionPerformed(ActionEvent e) {
            if (GameOver().equals("")) {
                if (TicTacToe.this.b6.getText().equals("")) {
                    if (counter % 2 == 1)
                        TicTacToe.this.b6.setText("X");
                    else
                        TicTacToe.this.b6.setText("0");
                    counter++;
                }
            } else
                TicTacToe.this.tWin.setText("Winner : " + GameOver());
        }
    }

    class TratareButon7 implements ActionListener {


        public void actionPerformed(ActionEvent e) {
            if (GameOver().equals("")) {
                if (TicTacToe.this.b7.getText().equals("")) {
                    if (counter % 2 == 1)
                        TicTacToe.this.b7.setText("X");
                    else
                        TicTacToe.this.b7.setText("0");
                    counter++;
                }
            } else
                TicTacToe.this.tWin.setText("Winner : " + GameOver());
        }
    }

    class TratareButon8 implements ActionListener {


        public void actionPerformed(ActionEvent e) {
            if (GameOver().equals("")) {
                if (TicTacToe.this.b8.getText().equals("")) {
                    if (counter % 2 == 1)
                        TicTacToe.this.b8.setText("X");
                    else
                        TicTacToe.this.b8.setText("0");
                    counter++;
                }
            } else
                TicTacToe.this.tWin.setText("Winner : " + GameOver());
        }
    }

    class TratareButon9 implements ActionListener {


        public void actionPerformed(ActionEvent e) {
            if (GameOver().equals("")) {
                if (TicTacToe.this.b9.getText().equals("")) {
                    if (counter % 2 == 1)
                        TicTacToe.this.b9.setText("X");
                    else
                        TicTacToe.this.b9.setText("0");
                    counter++;
                }
            } else
                TicTacToe.this.tWin.setText("Winner : " + GameOver());
        }
    }
}