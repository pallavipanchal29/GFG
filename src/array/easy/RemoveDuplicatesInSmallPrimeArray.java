package array.easy;

import java.util.ArrayList;
import java.util.LinkedHashMap;

//Completed GFG - correct
public class RemoveDuplicatesInSmallPrimeArray
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{2,2,3,3,7,5};
        System.out.println(removeDuplicate(arr,arr.length));
    }
    static ArrayList<Integer> removeDuplicate(int arr[], int n)
    {
        ArrayList<Integer> answers = new ArrayList<>();
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        for(int i = 0;i<n;i++)
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        Integer[] array = map.keySet().toArray(new Integer[map.keySet().size()]);
        for(int i = 0;i< array.length;i++)
        {
            answers.add(array[i]);
        }
        return answers;
    }
}
