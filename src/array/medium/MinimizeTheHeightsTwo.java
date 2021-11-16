package array.medium;

import java.util.Arrays;

//Completed GFG - correct
public class MinimizeTheHeightsTwo
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{3, 9, 12, 16, 20};
        System.out.println(getMinDiff(arr,arr.length,3));
    }
    static int getMinDiff(int[] arr, int n, int k)
    {
        Arrays.sort(arr);
        int minEle, maxEle;
        int result = arr[n-1] - arr[0];

        for(int i =1; i<=n-1; i++)
        {
            if(arr[i]>=k)
            {
                maxEle = Math.max(arr[i-1] + k, arr[n-1]-k);
                minEle = Math.min(arr[0]+k, arr[i]-k);

                result = Math.min(result, maxEle-minEle);
            }
        }
        return result;
    }
}
