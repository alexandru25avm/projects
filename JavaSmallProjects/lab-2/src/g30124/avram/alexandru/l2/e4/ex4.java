
package g30124.avram.alexandru.l2.e4;


import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v=new int[20];
        int max;
        int i;
        int n;
        System.out.println("Introduceti nr de elemente ale vectorului V");
        n=sc.nextInt();
        for(i=0;i<n;i++) {
            System.out.format("v[%d] =", i);
            v[i]=sc.nextInt();
        }
        max=v[0];
        for (i=1;i<10;i++)
        {

            if ( v[i] > max)
            {
                max = v[i];

            }
        }
            System.out.println("Val maxima :" +max);

    }
}
