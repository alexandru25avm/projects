package g30124.avram.alexandru.l9.e2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.util.*;

public class ButtonAndTextField extends JFrame{

    HashMap accounts = new HashMap();

    JLabel tArea;
    JTextField tcounter;
    JTextArea counter;
    JButton increment;

    ButtonAndTextField(){

        setTitle("Counter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        init();
        setSize(200,300);
        setVisible(true);
    }

    public void init(){

        this.setLayout(null);
        int width=80;int height = 20;

        tcounter = new JTextField();
        tcounter.setBounds(50,100,width, height);

        increment = new JButton("Click");
        increment.setBounds(50,50,width, height);

        increment.addActionListener(new Increment());

        add(tcounter);add(increment);

    }

    public static void main(String[] args) {
        new ButtonAndTextField();
    }

    class Increment implements ActionListener{

        int counter=1;

        public void actionPerformed(ActionEvent e){

            ButtonAndTextField.this.tcounter.setText("           "+counter);
            counter ++;

        }
    }

}


