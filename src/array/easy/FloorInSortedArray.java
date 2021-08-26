package array.easy;

//Completed GFG - correct
public class FloorInSortedArray
{
    public static void main(String[] args)
    {
        long[] arr = new long[]{1,2,8,10,11,12,19};
        System.out.println(findFloor(arr,arr.length,5));
    }
    static int findFloor(long arr[], int n, long x)
    {
        int index = binarySearch(arr,0,n-1,x);
        return index;
    }

    private static int binarySearch(long[] arr, int low, int high, long x)
    {
        while (low <= high)
        {
            int mid = low + (high - low) / 2;
            if(arr[mid] == x)
                return mid;
            else if(arr[mid] < x)
            {
                while (arr[mid] < x && mid < arr.length - 1)
                {
                    mid++;
                }
                return mid;
            }
            else
                high = mid - 1;
        }
        return -1;
    }
}
