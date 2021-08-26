package array.basic;

public class SearchingElementSortedArray
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,2,3,4,6};
        System.out.println(searchInSorted(arr,arr.length,6));
    }
    static int searchInSorted(int arr[], int N, int K)
    {
        return binarysearch(arr,N,K);
    }
    static int binarysearch(int arr[], int n, int k)
    {
        int low = 0;
        int high = n-1;
        while (low <= high)
        {
            int mid = low + (high - low)/2;
            if(arr[mid] == k)
                return 1;
            else if(arr[mid] > k)
                high = mid - 1;
            else
                low = mid+1;
        }
        return -1;
    }
}
