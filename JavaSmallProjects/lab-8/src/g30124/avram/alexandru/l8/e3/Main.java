package g30124.avram.alexandru.l8.e3;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Main {
    public static void Encription(String fileName) throws IOException{

        BufferedReader bf=new BufferedReader(new FileReader(fileName));
        BufferedWriter wr=new BufferedWriter(new FileWriter("encriptare.txt"));

        String line;
        while((line=bf.readLine())!=null)
        {

            for(int i=0;i<line.length();i++)
            {
                char c=line.charAt(i);
                c++;
                wr.write(c);
            }
            wr.newLine();
        }
        wr.close();
        bf.close();
    }
    public static void Decription (String fileName) throws IOException {
        BufferedReader bf=new BufferedReader(new FileReader(fileName));
        BufferedWriter wr=new BufferedWriter(new FileWriter("decriptare.txt"));

        String line;
        while((line=bf.readLine())!=null)
        {

            for(int i=0;i<line.length();i++)
            {
                char c=line.charAt(i);
                c--;
                wr.write(c);
            }
            wr.newLine();
        }
        wr.close();
        bf.close();
    }
    public static void main(String[] args) throws IOException {

        String fileEnc="data.enc.txt";
        String fileDec="encriptare.txt";
        Encription(fileEnc);
        Decription(fileDec);


    }
}