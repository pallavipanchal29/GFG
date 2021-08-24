package array.easy;

import java.util.HashMap;
import java.util.Map;

//Completed GFG - correct
public class FirstRepeatingElement
{
    static class pair
    {
        int count, first;
        public pair(int count, int first)
        {
            this.count = count;
            this.first = first;
        }
    }
    public static void main(String[] args)
    {
        int[] arr = new int[] { 1, 5, 3, 4, 3, 5, 6};
        System.out.println(firstRepeated(arr,arr.length));
    }
    public static int firstRepeated(int []arr, int n)
    {
        int first = Integer.MAX_VALUE;

        HashMap<Integer,pair> map = new HashMap<>();
        for(int i = 0;i<n;i++)
        {
            if(map.containsKey(arr[i]))
            {
                pair p = map.get(arr[i]);
                p.count = p.count + 1;
                map.put(arr[i],new pair(p.count,p.first));
            }
            else
                map.put(arr[i],new pair(1,i+1));
        }
        for(Map.Entry<Integer,pair> entry : map.entrySet())
        {
            pair p = entry.getValue();
            if(p.count > 1)
            {
                if(p.first < first)
                {
                    first = p.first;
                }
            }
        }
        return first == Integer.MAX_VALUE ? -1 : first;
    }
}
