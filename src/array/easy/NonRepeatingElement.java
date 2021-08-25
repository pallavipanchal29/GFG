package array.easy;

import java.util.LinkedHashMap;
import java.util.Map;

//Completed GFG - correct
public class NonRepeatingElement
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{-1, 2, -1, 3, 2};
        System.out.println(firstNonRepeating(arr,arr.length));
    }
    public static int firstNonRepeating(int arr[], int n)
    {
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        for(int i = 0;i<n;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for (Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            if(entry.getValue() == 1)
                return entry.getKey();
        }
        return 0;
    }
}
