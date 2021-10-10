package array.basic;

import java.util.TreeMap;

//Completed GFG - correct
public class TotalDistanceTravelledInArray
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{6, 5, 1, 2, 4, 3};
        System.out.println(distance(arr,arr.length));
    }
    static long distance(int[] arr, int n)
    {
        long dist = 0L;
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i = 0;i<n;i++)
        {
            map.put(arr[i],i);
        }

        Integer[] values = map.values().toArray(new Integer[]{0});
        for(int i = 1;i< values.length;i++)
        {
            dist = dist + Math.abs(values[i] - values[i-1]);
        }
        return dist;
    }
}
