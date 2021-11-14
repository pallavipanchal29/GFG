package array.basic;

import java.util.HashMap;
import java.util.Map;

//Completed GFG - correct
public class FindUniqueElement
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{6 ,2 ,6,6 ,4, 4, 6, 6, 6, 2 ,2, 8, 4, 2, 4, 4, 8, 4 ,4 ,2 ,4, 8, 8, 8, 2, 4 ,4 ,8, 4, 4, 6};

        System.out.println(findUnique(arr,arr.length,6));
    }
    public static int findUnique(int a[], int n, int k)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<n;i++)
        {
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            if(entry.getValue() % k != 0)
                return entry.getKey();
        }
        return -1;
    }
}
