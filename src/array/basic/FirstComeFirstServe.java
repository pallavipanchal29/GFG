package array.basic;

//Completed GFG - correct
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstComeFirstServe
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
        int[] arr = new int[]{7, 9, 5, 6, 1, 10, 10 ,6 ,2, 3};
        System.out.println(firstElement(arr,arr.length,3));
    }
    static int firstElement(int arr[], int n, int k)
    {
        int first = Integer.MAX_VALUE;
        int elem = -1;
        LinkedHashMap<Integer, Pair> map = new LinkedHashMap<>();
        for(int i = 0;i<n;i++)
        {
            int count = 0;
            var pair = map.get(arr[i]);
            if(pair == null)
            {
                count = 1;
                map.put(arr[i],new Pair(i,count));
            }
            else {
                count = pair.count + 1;
                int index = pair.index;
                map.put(arr[i],new Pair(index,count));
            }
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
