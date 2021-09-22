package array.basic;

//Completed GFG - correct
public class NumberOfOccurance
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{1, 2, 2, 2, 2, 2, 3};
        System.out.println(count(arr,arr.length,1));
    }
    static int count(int[] arr, int n, int x)
    {
        return binarySearch(arr,0,n-1,x);
    }

    private static int binarySearch(int[] arr, int low, int high, int x)
    {
        while (low <= high)
        {
            int mid = low + (high - low)/2;
            if(arr[mid] > x)
                high = mid - 1;
            else if(arr[mid] < x)
                low = mid + 1;
            else if(arr[mid] == x)
            {
               int first = findFirstOccurance(arr,mid,x);
               int last = findLastOccurance(arr,mid+1,x);
               return last - first + 1;
            }
        }
        return 0;
    }

    private static int findFirstOccurance(int[] arr,int midIndex, int x)
    {
        for(int i = 0;i<midIndex;i++)
        {
            if(arr[i] == x)
                return i;
        }
        return 0;
    }

    private static int findLastOccurance(int[] arr,int midIndex, int x)
    {
        for(int i = arr.length-1;i>= midIndex;i--)
        {
            if(arr[i] == x)
                return i;
        }
        return 0;
    }
}
