package array.basic;

import java.util.*;

//Completed GFG - correct
public class KthDistinctElement
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{1, 2, 50, 10, 20, 2};
        System.out.println(KthDistinct(arr,3));
    }
    public static int KthDistinct(int[] nums,int k)
    {
        int elem = -1;
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        for(int i = 0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            if(entry.getValue() == 1)
            {
                if(k > 0)
                {
                    k--;
                    elem = entry.getKey();
                }
            }
        }
        if(k > 0)
            return -1;
        else
            return elem;
    }
}
