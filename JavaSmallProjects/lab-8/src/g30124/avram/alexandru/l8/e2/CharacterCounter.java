package g30124.avram.alexandru.l8.e2;

import java.io.*;
import java.util.*;

public class CharacterCounter {
    public static void main (String args[]) throws IOException{

        char character;
        BufferedReader stdin = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("Give the character:");
        character=stdin.readLine().charAt(0);

        int number=0;

        BufferedReader in = new BufferedReader(
                new FileReader("D:\\JavaSourceCode\\lab5\\src\\g30124\\avram\\alexandru\\l8\\e2\\input.txt"));
        String s = new String();
        while((s = in.readLine())!= null)
        {
            char lin[]=s.toCharArray();
            for(int i=0; i<lin.length;i++)
            {
                if( lin[i]==character)
                {
                    number++;
                }
            }
        }
        in.close();
        System.out.println("The character " +character+  " appears " +number+ " times");
    }

}
