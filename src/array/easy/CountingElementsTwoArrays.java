package array.easy;

import java.util.ArrayList;
import java.util.Arrays;

//Completed GFG - correct
public class CountingElementsTwoArrays
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,2,3,4,7,9};
        int[] brr = new int[]{0,1,2,1,1,4};
        System.out.println(countEleLessThanOrEqual(arr,brr,arr.length, brr.length));
    }
    public static ArrayList<Integer> countEleLessThanOrEqual(int arr1[], int arr2[], int m, int n)
    {
        ArrayList<Integer> answers = new ArrayList<>();
        Arrays.sort(arr2);

        for(int i = 0;i<m;i++)
        {
            int index  = binarySearch(arr2,0,n-1,arr1[i]);
            if(index != -1)
                answers.add(index+1);
            else
                answers.add(0);
        }
        return answers;
    }

    private static int binarySearch(int[] arr2, int low, int high, int key)
    {
        while (low <= high)
        {
            int mid = low + (high - low) /2;
            if(arr2[mid] <= key)
                low = mid +1;
            else
                high = mid - 1;
        }
        return high;
    }
}
