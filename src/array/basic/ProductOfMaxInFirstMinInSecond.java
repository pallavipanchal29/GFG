package array.basic;

public class ProductOfMaxInFirstMinInSecond
{
    public static void main(String[] args)
    {
        int[] arr1 = new int[]{5, 7, 9, 3, 6, 2};
        int[] arr2 = new int[]{1, 2, 6, -1, 0, 9};
        System.out.println(find_multiplication(arr1,arr2, arr1.length, arr2.length));
    }
    public static long find_multiplication (int arr[], int brr[], int n, int m)
    {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0;i<n;i++)
        {
            max = Math.max(max,arr[i]);
        }
        for(int i = 0;i<m;i++)
        {
            min = Math.min(min,brr[i]);
        }
        return max * min;
    }
}
