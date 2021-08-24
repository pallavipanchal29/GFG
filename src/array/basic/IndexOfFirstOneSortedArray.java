package array.basic;

//Completed GFG - correct
public class IndexOfFirstOneSortedArray
{
    public static void main(String[] args)
    {
        long[] arr = new long[]{0, 0, 0, 0};
        System.out.println(firstIndex(arr,arr.length));
    }
    public static long firstIndex(long arr[], long n)
    {
        return binarySearch(arr,0,n-1);
    }

    private static long binarySearch(long[] arr, int low, long high)
    {
        while (low <= high)
        {
            int mid = (int) (low + (high-low)/2);
            if(arr[ mid] == 0)
            {
                low = mid+1;
            }
            else if(arr[mid] == 1 && (mid ==0 || arr[mid-1] == 0))
                return mid;
            else
                high = mid - 1;
        }
        return -1;
    }
}
