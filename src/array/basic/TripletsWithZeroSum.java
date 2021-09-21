package array.basic;

import java.util.Arrays;
import java.util.HashSet;

public class TripletsWithZeroSum
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{0, -1, 2, -3, 1};
        System.out.println(findTriplets(arr,arr.length));
    }

    // O(NLogn) complexity O(1) space
    public static boolean findTriplets(int arr[] , int n)
    {
        Arrays.sort(arr);
        for(int i = 0;i<n;i++)
        {
            int j = i+1;
            int k = n-1;
            while (j<k)
            {
                if(arr[i] + arr[j]+arr[k] == 0)
                    return true;
                else if(arr[i] + arr[j]+arr[k] < 0)
                    j++;
                else
                    k--;
            }
        }
        return false;
    }

    // O(nsquare) complexity O(n) space
//    public static boolean findTriplets(int arr[] , int n)
//    {
//        for(int i = 0;i<n;i++)
//        {
//            HashSet<Integer> set = new HashSet();
//            for(int j = i+1;j<n;j++)
//            {
//                int val = -(arr[i] + arr[j]);
//                if(set.contains(val))
//                    return true;
//                else
//                    set.add(arr[j]);
//            }
//        }
//        return false;
//    }
}
