package array.easy;

//Completed GFG - correct
public class CountTheZeroes
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{0, 0, 0, 0, 0};
        System.out.println(countZeroes(arr,arr.length));
    }
    static int countZeroes(int[] arr, int n)
    {
       int index = binarySearch(arr,0,n-1);
       return n-index;
    }

    private static int binarySearch(int[] arr, int low, int high)
    {
        while (low <= high)
        {
            int mid = low + (high - low)/2;
            if(arr[mid] == 0  && (mid == 0 || arr[mid-1] == 1))
                return mid;
            else if(arr[mid] == 0 && (mid == 0|| arr[mid-1] == 0))
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    //Approach Two
    static int countZeroesIntact(int[] arr, int n)
    {
        int index = -1;
        int low = 0;
        int high = n-1;

        while (low <= high)
        {
            int mid = low + (high - low)/2;
            if(arr[mid] == 0 && (mid == 0 || arr[mid - 1] == 1)) {
                index = mid;
                break;
            }
            else if(arr[mid] == 1)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return index == -1 ? -1 : (n-index);
    }
}
