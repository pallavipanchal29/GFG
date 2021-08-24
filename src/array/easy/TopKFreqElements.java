package array.easy;

import java.util.*;

public class TopKFreqElements
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,1,1,2,2,3};
        int[] answer = topK(arr,arr.length);

        for(int i = 0;i<answer.length;i++)
            System.out.print(answer[i]+" ");
    }
    public static int[] topK(int[] nums, int k)
    {
        int[] answer = new int[k];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Map.Entry<Integer,Integer>> list = new LinkedList<>(map.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2)
            {
                return 0;

            }
        });
        return null;
    }
}
