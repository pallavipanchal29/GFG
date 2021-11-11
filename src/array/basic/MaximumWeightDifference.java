package array.basic;

import java.util.Arrays;

//Completed GFG - correct
public class MaximumWeightDifference
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{1, 1, 1, 1, 1, 1, 1, 1};
        System.out.println(solve(arr,arr.length,3));
    }
    static long solve(int[] arr, int n, int k)
    {
        Arrays.sort(arr);

        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0;i<k;i++)
            sum1 = sum1 + arr[i];

        for(int i = k;i<n;i++)
            sum2 = sum2 + arr[i];

        return sum2 - sum1;
    }
}
