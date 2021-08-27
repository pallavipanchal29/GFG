package array.easy;

//Completed GFG - correct
public class MinNumberInSortedRotatedArray
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{3,4,5,1,2};
        System.out.println(minNumber(arr,0,arr.length));
    }
    static int minNumber(int arr[], int low, int high)
    {
        int index = binarySearch(arr,low,high);
        return index;
    }

    private static int binarySearch(int[] arr, int low, int high)
    {
        while(low<=high){
            if(low==high)
                return arr[low];

            int mid= (low+high)/2;
            if(mid<high && arr[mid +1]<arr[mid])
                return arr[mid +1];
            if(mid>low && arr[mid -1]>arr[mid])
                return arr[mid];
            if(arr[high]>arr[mid])
                high=mid-1;
            else
                low = mid+1;
        }
        return arr[0];
    }
}
