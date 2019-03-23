package g30124.avram.alexandru.l2.e5;

import java.util.Random;
public class ex5
{
        static void bubbleSort(int[] v) {
            int n = v.length;
            int aux = 0;
            for(int i=0; i < n; i++){
                for(int j=1; j < (n-i); j++){
                    if(v[j-1] > v[j]){

                        aux = v[j-1];
                        v[j-1] = v[j];
                        v[j] = aux;
                    }

                }
            }
        }

    public static void main(String[] args){

        int[] v = new int[10];
        Random r = new Random();

        System.out.println("Vectorul initial: " );
        for(int i=0; i<10; i++){
            v[i] = r.nextInt(10);
            System.out.println(+v[i] );
        }

        System.out.println("Vectorul dupa aplicarea algoritmului BubbleSort" );
        bubbleSort(v);

        for(int i=0; i<10; i++){
            System.out.println(+v[i] );
        }
    }
}
