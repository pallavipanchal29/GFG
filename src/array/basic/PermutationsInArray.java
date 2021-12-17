package array.basic;

import java.util.Arrays;

//Completed GFG - correct
public class PermutationsInArray
{
    public static void main(String[] args)
    {
        long[] a = {2, 1, 3};
        long[] b = {7, 8, 9};

        System.out.println(isPossible(a,b,a.length,10));
    }
    public static boolean isPossible(long a[], long b[], long n, long k)
    {
        Arrays.sort(a);
        Arrays.sort(b);

        for(int i = 0,j=b.length-1;i<j;i++,j--)
        {
            long t = a[i];
            a[i] = b[i];
            b[i] = t;
        }

        int i = 0;
        int j = (int) (n-1);

        while (i < j)
        {
            if(a[i] + b[j] < k)
                return  false;
            else
            {
                i++;
                j--;
            }
        }
        return  true;
    }
}
