package array.basic;

//GFG Completed - correct
public class LongestIncreasingSubarray
{
    public static void main(String[] args)
    {
        long[] arr = new long[]{5, 6, 3, 5, 7, 8, 9, 1, 2};
        System.out.println(lenOfLongIncSubArr(arr,arr.length));
    }
    public static long lenOfLongIncSubArr(long arr[], long n)
    {
        long max = 1, len = 1;

        for (int i=1; i<n; i++)
        {
            if (arr[i] > arr[i-1])
                len++;
            else
            {
                if (max < len)
                    max = len;

                len = 1;
            }
        }

        if (max < len)
            max = len;

        return max;
    }
}
