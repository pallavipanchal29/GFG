package array.easy;

public class SearchInsertPositionKSortedArray
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{1 , 3, 5, 6};
        System.out.println(searchInsertK(arr,arr.length,2));
    }
    static int searchInsertK(int Arr[], int N, int k)
    {
        int index = binarySearch(Arr,0,N-1,k);
        return index;
    }

    private static int binarySearch(int[] arr, int low, int high, int k)
    {
        while(low <= high)
        {
            int mid = low + (high - low) / 2;
            if(arr[mid] == k)
                return mid;
            else if(arr[mid] > k)
            {
                high = mid - 1;
            }
            else
                low = mid + 1;
        }
        return high+1;
    }
}
