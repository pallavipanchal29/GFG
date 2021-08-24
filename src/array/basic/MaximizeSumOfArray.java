package array.basic;

import java.util.Arrays;

public class MaximizeSumOfArray
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{5, 3, 2, 4, 1};
        System.out.println(Maximize(arr,arr.length));
    }
    static int Maximize(int arr[], int n)
    {
        Arrays.sort(arr);
        int mod = (int)1e9+7;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum = (sum + (long)arr[i] * i) % mod;
        }
        return (int) (sum);
    }
}
