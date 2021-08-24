package array.basic;

//Completed GFG - correct
public class BinarySearch
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{1 ,2 ,3 ,4,5};
        System.out.println(binarysearch(arr,arr.length,4));
    }
    static int binarysearch(int arr[], int n, int k)
    {
        int low = 0;
        int high = n-1;
        while (low <= high)
        {
            int mid = low + (high - low)/2;
            if(arr[mid] == k)
                return mid;
            else if(arr[mid] > k)
                high = mid - 1;
            else
                low = mid+1;
        }
        return -1;
    }
}
