package array.easy;

import java.util.TreeMap;

public class MaximumAverageSubarray
{
    public static void main(String[] args)
    {
        int[] arr = new int[] {1, 12, -5, -6, 50, 3};
        System.out.println(findMaxAverage(arr,arr.length,4));
    }
    static int findMaxAverage(int[] arr, int n, int k)
    {
        TreeMap<Integer,Integer> map = new TreeMap<>();
        int avg = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int i = 0;
        int j = 0;

        while (j < n)
        {
            sum = sum + arr[j];
            if(j - i + 1 < k)
            {
                j++;
            }
            else
            {
                avg = sum / k;
                max = Math.max(max,avg);
                map.put(max,i);
                sum = sum - arr[i];
                i++;
                j++;
            }
        }
        return map.lastEntry().getValue();
    }
}
