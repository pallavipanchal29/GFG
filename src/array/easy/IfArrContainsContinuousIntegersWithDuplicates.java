package array.easy;

import java.util.TreeMap;

//Completed GFG - correct
public class IfArrContainsContinuousIntegersWithDuplicates
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{10, 14, 10, 12, 12, 13, 15};
        System.out.println(areElementsContiguous(arr,arr.length));
    }
    public static boolean areElementsContiguous (int arr[], int n)
    {
        int diff = 0;
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i = 0;i<n;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        var keys = map.keySet();
        int[] array = keys.stream().mapToInt(Number::intValue).toArray();

        for(int i = 1;i< array.length;i++)
        {
            diff = array[i] - array[i-1];
            if(diff != 1)
                return false;
        }
        return true;
    }
}
