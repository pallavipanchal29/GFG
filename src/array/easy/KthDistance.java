package array.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class KthDistance
{
    public static void main(String[] args)
    {
        int[] nums = new int[]{1,2,3,1,2,3};
        System.out.println(checkDuplicatesWithinK(nums,nums.length,2));
    }
    static boolean checkDuplicatesWithinK(int[] nums, int n, int k) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                List<Integer> indexes = map.get(nums[i]);
                for(int j = 0;j<indexes.size();j++)
                {
                    if(Math.abs(indexes.get(j)-i) <= k)
                        return true;
                }
                indexes.add(i);
                map.put(nums[i],indexes);
            }
            else
            {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(nums[i],list);
            }
        }
        return false;
    }
}
