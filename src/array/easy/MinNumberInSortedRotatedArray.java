package array.easy;

public class MinNumberInSortedRotatedArray
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{2,3,4,5,6,7,8,9,10,1};
        System.out.println(minNumber(arr,0,arr.length));
    }
    static int minNumber(int arr[], int low, int high)
    {
        int index = binarySearch(arr,low,high);
        return index;
    }

    private static int binarySearch(int[] arr, int low, int high)
    {
        while (low <= high)
        {
            int mid = low + (high - low) / 2;

        }
        return -1;
    }
}
