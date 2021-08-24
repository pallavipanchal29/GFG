package array.basic;

public class FightingtTheDarkness
{
    public static void main(String[] args)
    {
        long[] arr = new long[]{1,1,2};
        System.out.println(maxDays(arr,arr.length));
    }
    static long maxDays(long arr[], int n)
    {
        long max = Integer.MIN_VALUE;

        for(int i = 0;i<n;i++)
        {
            max = Math.max(max,arr[i]);
        }
        return max;
    }
}
