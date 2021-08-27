package array.easy;

import java.util.Arrays;

//Completed GFG - correct
public class MaxPossibleSumProducts
{
    public static void main(String[] args)
    {
        long[] arr = new long[]{1, 2};
        long[] brr = new long[]{4, 4};
        System.out.println(MaxSum(arr,brr,arr.length));
    }
    static long MaxSum(long []A, long []B, int N)
    {
        long sum = 0L;
        Arrays.sort(A);
        Arrays.sort(B);

        int i = 0;
        int j = 0;

        while (i < N && j < N)
        {
            sum = sum + A[i] * B[j];
            i++;
            j++;
        }
        return sum;
    }
}
