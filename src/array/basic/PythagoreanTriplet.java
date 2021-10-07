package array.basic;

import java.util.HashSet;

public class PythagoreanTriplet
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{3, 2, 4, 6, 5};
        System.out.println(checkTriplet(arr,arr.length));
    }
    static boolean checkTriplet(int[] arr, int n)
    {
        if(arr == null || arr.length == 0)
            return false;
        HashSet<Integer> hset = new HashSet<>();

        for(int i = 0 ; i < n ; i++)
        {
            hset.add(arr[i]*arr[i]);
            for(int j = 2 ; j < n ; j++ )
            {
                if(i != j)
                {
                    if(hset.contains(Math.abs(arr[i]*arr[i] - arr[j]*arr[j])))
                        return true;
                }
            }
        }
        return false;
    }
}

