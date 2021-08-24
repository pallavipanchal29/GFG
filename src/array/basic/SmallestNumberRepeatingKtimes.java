package array.basic;

import java.util.HashMap;
import java.util.Map;

//Completed CFG - correct
public class SmallestNumberRepeatingKtimes
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{2, 2 ,1 ,3, 1};
        System.out.println(findDuplicate(arr,arr.length,2));
    }
    static int findDuplicate(int arr[], int N,int K)
    {
        int smallest = Integer.MAX_VALUE;
        HashMap<Integer,Integer> map = new HashMap();
        for(int i = 0;i<N;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            if(entry.getValue() == K)
            {
                smallest = Math.min(smallest,entry.getKey());
            }
        }
        return smallest;
    }
}
