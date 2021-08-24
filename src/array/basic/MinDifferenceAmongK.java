package array.basic;

import java.util.Arrays;

public class MinDifferenceAmongK
{
    public static void main(String[] args)
    {
        long[] arr = new long[]{1,2,3,2};
        System.out.println(minDiff(arr,arr.length,3));
    }
    static long minDiff(long a[] ,int N,int K)
    {
        Arrays.sort(a);
        int j = K-1;
        int i = 0;
        long min = a[N-1];
        while (j < N)
        {
            if(min > (a[j] - a[i]))
                min = a[j]-a[i];
            j++;
            i++;
        }
        return min;
    }
}
