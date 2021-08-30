package array.easy;

public class MaxSumSubarrayLessThanEqualToX
{
    public static void main(String[] args)
    {
        long[] arr = new long[]{1, 2, 3, 4, 5};
        System.out.println(findMaxSubarraySum(arr, arr.length, 11));
    }
    static long findMaxSubarraySum(long arr[], int N,int X)
    {
        int i = 0;
        int j = 0;
        long sum = 0;
        long min = Long.MAX_VALUE;

        while (j < N)
        {
            while (sum <= X && j < N)
            {
                sum = sum + arr[j];
                min = Math.min(min,sum);
                j++;
            }

        }
        return min;
    }
}
