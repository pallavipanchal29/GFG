package array.basic;

//Completed GFG - correct
public class FindElementAppearsOnceSortedArray
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{1, 1, 2, 3, 3, 4,4, 50, 50, 65, 65};
        System.out.println(findOnce(arr,arr.length));
    }
    static int findOnce(int arr[], int n)
    {
        int low = 0;
        int high = n-1;

        if(low == high)
            return arr[low];
        while (low <= high)
        {
            int mid = low + (high - low)/2;
            if((mid == 0 || arr[mid-1] != arr[mid]) && ((mid == n-1) || arr[mid] !=  arr[mid+1]))
                return arr[mid];
            if(mid % 2 == 0)
            {
                if(mid == n-1 || (arr[mid+1] == arr[mid]))
                    low = mid +1;
                else
                    high = mid - 1;
            }
            if(mid % 2 != 0)
            {
                if(mid == n-1 || (arr[mid+1] == arr[mid]))
                    high = mid - 1;
                else
                    low = mid + 1;
            }
        }
        return -1;
    }
}
