package g30124.avram.alexandru.l2.e6;

import java.util.Scanner;

public class ex6 {
    static int recursiveFactorial(int n){
        if (n==1) return 1;
        else return n*recursiveFactorial(n-1);
    }

    static int iterativeFactorial(int n){
        int i,factorial=1;
        for(i=1; i<=n;i++)
            factorial*=i;
        return factorial;
    }

    public static void main(String[] args){
        int x;
        Scanner in = new Scanner(System.in);
        System.out.println("Insert  x= ");
        x = in.nextInt();


        System.out.println("Factorialul lui n calculat iterativ: "+iterativeFactorial(x));
        System.out.println("Factorialul lui n calculat recursiv: "+recursiveFactorial(x));
    }
}
