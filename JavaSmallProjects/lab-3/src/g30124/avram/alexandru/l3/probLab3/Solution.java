package g30124.avram.alexandru.l3.probLab3;


public class Solution {
    public int[] checkArrayElements(int[]A,int n) {
        int i,j,ok=0;
        for(i=0;i<n-1;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(A[i]==A[j]&&A[i]!=0)
                {
                    A[i]=0;
                    A[j]=0;
                }

            }
        }
        return A;
    }
}


