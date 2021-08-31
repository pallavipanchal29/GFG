package array.basic;

import java.util.Arrays;

public class ElementsInRange
{
    public static void main(String[] args)
    {
        long[] arr = new long[]{1, 4, 5, 2, 7, 8, 3};
        System.out.println(check_elements(arr,arr.length,2,5));
    }
    static boolean check_elements(long arr[], int n, int A, int B)
    {
        for(int i = A;i<=B;i++)
        {
            int res = Arrays.binarySearch(arr,0,n,i);
//            if(Arrays.binarySearch(arr,0,n,i) < 0)
//                return false;
            int a = 4;
        }
        return true;
    }
}
