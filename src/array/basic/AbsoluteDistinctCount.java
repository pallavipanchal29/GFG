package array.basic;

import java.util.HashSet;

//Completed GFG - correct
public class AbsoluteDistinctCount
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{-1, -1, -1, -1, 0, 1, 1, 1, 1};
        System.out.println(distinctCount(arr,arr.length));
    }
    static int distinctCount(int[] arr, int n)
    {
        for(int i = 0;i<n;i++)
        {
            if(arr[i] < 0)
                arr[i] = arr[i] * -1;
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<n;i++)
            set.add(arr[i]);

        return set.size();
    }
}
