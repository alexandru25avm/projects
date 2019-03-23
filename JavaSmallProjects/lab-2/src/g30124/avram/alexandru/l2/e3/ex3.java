package g30124.avram.alexandru.l2.e3;
import java.util.Scanner;
public class ex3 {
    public static void main(String[] args) {

        int number1, number2;
        int i, j,prim=1;
        Scanner in = new Scanner(System.in);
        System.out.print("\n Introduceti cele doua capete ale intervalului \n");
        number1 = in.nextInt();
        number2 = in.nextInt();

        for (i = number1; i <= number2; i++)
        {
            for (j = 2; j < i/2; j++) {

                if (number1 % j == 0)
                {
                    prim = 0;
                }
            }
                if (prim ==1 )
                {
                    System.out.println(number1);
                    prim=0;
                }
                else
                    {
                    prim = 1;
                }
                number1++;
            }
        }


    }
