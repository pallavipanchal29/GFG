package array.easy;

import java.util.HashSet;

public class CountPairsWithGivenSum
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{1, 1, 1, 1};
        System.out.println(getPairsCount(arr,arr.length,2));
    }
    static int getPairsCount(int[] arr, int n, int k)
    {
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<n;i++)
        {
            int val = Math.abs(k - arr[i]);
            if(set.contains(val))
                count++;
            else
                set.add(arr[i]);
        }
        return count;
    }
}
