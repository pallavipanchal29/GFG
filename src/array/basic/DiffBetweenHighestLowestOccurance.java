package array.basic;

import java.util.HashMap;
import java.util.Map;

//Completed GFG - correct
public class DiffBetweenHighestLowestOccurance
{
    public static void main(String[] args)
    {
        long[] arr = new long[]{1, 1, 1, 3, 3, 3};
        System.out.println(findDiff(arr,arr.length));

    }
    public static long findDiff(long arr[], long n)
    {
        int lowest = Integer.MAX_VALUE;
        int highest = Integer.MIN_VALUE;

        HashMap<Long,Integer> map = new HashMap<>();
        for(int i = 0;i<n;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Long,Integer> entry : map.entrySet())
        {
            if(entry.getValue() < lowest)
            {
                lowest = Math.min(lowest, entry.getValue());
            }
            if(entry.getValue() > highest)
            {
                highest = Math.max(highest, entry.getValue());
            }
        }
        return highest - lowest;
    }
}
