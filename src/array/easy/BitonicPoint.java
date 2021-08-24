package array.easy;

//Completed GFG - correct
public class BitonicPoint
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{1, 45, 47, 50, 5};
        System.out.println(findMaximum(arr,arr.length));
    }
    static int findMaximum(int[] arr, int n)
    {
        return binarySearch(arr,0,n-1);
    }

    private static int binarySearch(int[] arr, int low, int high)
    {
        while (low <= high)
        {
            int mid = low + (high - low)/2;
            if((mid == 0 || arr[mid] > arr[mid - 1]) && (mid+1 == arr.length || arr[mid+1] < arr[mid]))
                return arr[mid];
            else if(mid == 0 || arr[mid] < arr[mid-1])
                high = mid-1;
            else
                low = mid+1;
        }
        return -1;
    }
}
