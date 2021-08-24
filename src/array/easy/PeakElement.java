package array.easy;

public class PeakElement
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,13};
        System.out.println(peakElement(arr,arr.length));

    }
    public static  int peakElement(int[] arr,int n)
    {
        int index = binarySearch(arr,0,n-1);
        if(index >= 0 && index < n)
            return 1;
        else
            return 0;
    }
    private static int binarySearch(int[] arr, int low, int high)
    {
        while (low <= high)
        {
            int mid = low + (high - low)/2;
            if((mid == 0 || arr[mid] > arr[mid - 1]) && (mid+1 == arr.length || arr[mid+1] < arr[mid]))
                return mid;
            else if(mid == 0 || arr[mid] < arr[mid-1])
                high = mid-1;
            else
                low = mid+1;
        }
        return -1;
    }
}
