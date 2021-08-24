package array.easy;

import java.util.HashMap;
import java.util.Map;

public class MaxDistanceSameElements
{
    static class pair
    {
        int first, second;
        public pair(int first, int second)
        {
            this.first = first;
            this.second = second;
        }
    }
    public static void main(String[] args)
    {
        int[] arr = new int[]{3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2};
        System.out.println(maxDistance(arr,arr.length));
    }
    static int maxDistance(int arr[], int n)
    {
       int max = Integer.MIN_VALUE;
       HashMap<Integer,pair> map = new HashMap<>();

       for(int i = 0;i<n;i++)
       {
           if(map.containsKey(arr[i]))
           {
               pair p = map.get(arr[i]);
               p.second = i;
               map.put(arr[i],new pair(p.first,p.second));
           }
           else
               map.put(arr[i],new pair(i,i));
       }

       for(Map.Entry<Integer,pair> entry : map.entrySet())
       {
           pair val = entry.getValue();
           int dist = val.second - val.first;
           max = Math.max(max,dist);
       }
       return max;
    }
}
