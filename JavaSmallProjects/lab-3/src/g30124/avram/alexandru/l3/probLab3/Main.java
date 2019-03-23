package g30124.avram.alexandru.l3.probLab3;
// problema de la inceputul Laboratorului 3 ;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        int i,n,ok=0;
        int []s;
        Scanner in = new Scanner(System.in);
        System.out.print("Introduceti lungimea vectorului ");
        n=in.nextInt();
        s=new int [n];
        for(i=0;i<n;i++)
        {
            System.out.print("A["+i+"]= ");
            s[i]=in.nextInt();
        }

        Solution solutie=new Solution();
        s=solutie.checkArrayElements(s,n);

        for(i=0;i<n;i++)
        {
            if(s[i]!=0)
            {
                System.out.println(" --- ");
                System.out.println("Result: A["+i+"]= " +s[i] );
            }



        }
    }
}
