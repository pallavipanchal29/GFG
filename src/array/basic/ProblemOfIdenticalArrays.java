package array.basic;

import java.util.Arrays;

//Completed GFG - correct
public class ProblemOfIdenticalArrays
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{1 ,2 ,3 ,4,5};
        int[] brr = new int[]{3, 4, 1, 2, 5};
        System.out.println(check(arr,brr,arr.length));
    }
    public static int check (int arr[], int[] brr, int n)
    {
        if(arr.length != brr.length)
            return 0;
        Arrays.sort(arr);
        Arrays.sort(brr);

        for (int i = 0;i<n;i++)
        {
            if(arr[i] != brr[i])
                return 0;
        }
        return 1;
    }
}
