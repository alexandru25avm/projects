package g30124.avram.alexandru.l9.e3;


import javax.swing.*;

import java.io.*;
import java.util.Scanner;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FieldAndText extends JFrame {

    JLabel doc;
    JTextField tdoc;
    JTextArea tArea;
    JButton bUpload;

    FiledText() {

        setTitle("File Uploader");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        init();
        setSize(500, 500);
        setVisible(true);
    }

    public void init() {

        this.setLayout(null);
        int width = 80;
        int height = 20;

        doc = new JLabel("Document name: ");
        doc.setBounds(10, 50, width, height);

        tdoc = new JTextField();
        tdoc.setBounds(70, 50, width, height);

        bUpload = new JButton("Upload");
        bUpload.setBounds(40, 80, width, height);

        bUpload.addActionListener(new TratareButonUpload());

        tArea = new JTextArea();
        tArea.setBounds(50, 110, 400, 280);

        add(doc);
        add(tdoc);
        add(bUpload);
        add(tArea);

    }


    public String Reader(String fileName) throws IOException {

        File fin = new File(fileName);
        BufferedReader bfin = new BufferedReader(new FileReader(fin));

        String line,msg="";

        while ((line = bfin.readLine()) != null) {
            int line_count = line.length();
            for (int i = 0; i < line_count; i++) {
                char c = line.charAt(i);
                msg+=c;
            }
            msg+="\n";
        }
        return msg;
    }


    public static void main(String[] args) {
        new FiledText();
    }

    class TratareButonUpload implements ActionListener {


        public void actionPerformed(ActionEvent e) {
            String fileName = FiledText.this.tdoc.getText();
            try {
                FiledText.this.tArea.setText(""+Reader(fileName));
            } catch (IOException e1) {
                e1.printStackTrace();
            }

        }
    }
}
