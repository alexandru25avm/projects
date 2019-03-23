package g30124.avram.alexandru.l2.e1;

import java.util.Scanner;

public class ex1
{
    public static void main (String[] args)
    {

        Scanner sc= new Scanner(System.in);
        int nr1;
        int nr2;
        System.out.println("Intoduceti nr1");
        nr1 = sc.nextInt();

        System.out.println("Introduceti nr2:");
        nr2 = sc.nextInt();

        if (nr2 > nr1)
        {
            System.out.println("Maximul este : nr2");
        }
        else if ( nr1 > nr2)
        {
            System.out.println("Maximul este : nr1");
        }
        else
        {
            System.out.println("Numere sunt egale => nr1=nr2");
        }
    }

}
