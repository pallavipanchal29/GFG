package array.school;

import java.util.Arrays;

//Completed GFG - correct
public class PrintLeftElement
{
    public static void main(String[] args)
    {
        long[] arr = new long[]{7, 8, 3, 4, 2, 9, 5};
        System.out.println(leftElement(arr,arr.length));
    }
    public static long leftElement(long arr[], long n)
    {
        Arrays.sort(arr);
        return arr[(int) ((n-1)/2)];
    }
}
