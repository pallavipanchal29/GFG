package stack.easy;

//Completed GFG - correct
public class MaxSumSubarrays
{
    public static void main(String[] args)
    {
        long[] arr = new long[]{4, 3, 1, 5, 6};
        System.out.println(pairWithMaxSum(arr,arr.length));

    }
    public static long pairWithMaxSum(long arr[], long N)
    {
        long res = 0;

        for(int i = 0; i < N-1; i++)
        {
            res = Math.max(res, arr[i] + arr[i+1]);
        }
        return res;
    }
}
