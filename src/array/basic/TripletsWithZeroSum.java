package array.basic;

import java.util.Arrays;

public class TripletsWithZeroSum
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{1, 2, 3};
        System.out.println(findTriplets(arr,arr.length));
    }
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
}
