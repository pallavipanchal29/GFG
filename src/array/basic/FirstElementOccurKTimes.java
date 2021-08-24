package array.basic;

import java.util.LinkedHashMap;
import java.util.Map;

//Completed GFG - correct
public class FirstElementOccurKTimes
{
    static class Pair
    {
        int index;
        int count;

        public Pair(int i,int c)
        {
            index = i;
            count = c;
        }
    }
    public static void main(String[] args)
    {
        int[] A = new int[]{1 ,3, 3 ,1, 1, 2,1};
        System.out.println(firstElementKTime(A,A.length,1));
    }
    public static int firstElementKTime(int[] a, int n, int k) 
    {
        int first = Integer.MAX_VALUE;
        int elem = 0;
        LinkedHashMap<Integer,Pair> map = new LinkedHashMap<>();
        for(int i = 0;i<n;i++)
        {
            int count = 0;
            var pair = map.get(a[i]);
            if(pair == null)
            {
                count = 1;
            }
            else
                count = pair.count + 1;
            if(count == k)
                return a[i];
            map.put(a[i],new Pair(i,count));
        }

        for(Map.Entry<Integer,Pair> entry : map.entrySet())
        {
            Pair pair = entry.getValue();
            if(pair.count == k)
            {
                if(pair.index < first)
                {
                    first = pair.index;
                    elem = entry.getKey();
                }
            }
        }
        return elem;
    }
}
