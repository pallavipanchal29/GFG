package array.basic;

import java.util.Arrays;

//Completed GFG - correct
public class SortInSpecificOrder
{
    public static void main(String[] args)
    {
        long[] arr = new long[]{1, 2, 3, 5, 4, 7, 10};
        sortIt(arr,arr.length);

        for(int i = 0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
    public static void sortIt(long arr[], long n)
    {
        for(int i = 0;i<n;i++)
        {
            if((arr[i] & 1) == 1)
                arr[i] = arr[i] * -1;
        }
        Arrays.sort(arr);
        for(int i = 0;i<n;i++)
        {
            if(arr[i] < 0)
                arr[i] = arr[i] * -1;
        }
    }
}
