package array.easy;

import java.util.*;

public class FindDuplicatesInArray
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{14, 7, 14, 6, 1, 11, 3, 16, 16, 8, 7, 4 ,11 ,15, 17, 6, 1, 13};
        System.out.println(duplicates(arr,arr.length));
    }
    public static ArrayList<Integer> duplicates(int arr[], int n)
    {
        ArrayList<Integer> answer = new ArrayList<>();
        TreeMap<Integer,Integer> map = new TreeMap<>();

        for(int i = 0;i<n;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            if(entry.getValue() > 1)
                answer.add(entry.getKey());
        }
        if(answer.size() == 0)
            answer.add(-1);
        return answer;
    }
}
