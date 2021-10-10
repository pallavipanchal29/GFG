package array.basic;

import java.util.Arrays;

//Completed GFG - correct
public class MinimizeSumOfAlternateProduct
{
    public static void main(String[] args)
    {
        long[] arr = new long[]{9, 2, 8 ,4 ,5, 7, 6, 0};
        System.out.println(altProduct(arr,arr.length));
    }
    public static long altProduct(long arr[], long n)
    {
        Arrays.sort(arr);
        long sum = 0L;
        int i = 0;
        int j = (int) (n-1);

        while (i < j)
        {
            sum = sum + (arr[i] * arr[j]);
            i++;
            j--;
        }
        return sum;
    }
}
