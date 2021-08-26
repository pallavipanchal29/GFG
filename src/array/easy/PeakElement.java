package array.easy;

//Completed GFG - correct
public class PeakElement
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,13};
        System.out.println(peakElement(arr,arr.length));

    }
    public static  int peakElement(int[] arr,int n)
    {
        return findPeakUtil(arr, 0, n - 1, n);
    }
    static int findPeakUtil(
            int arr[], int low, int high, int n)
    {
        int mid = low + (high - low) / 2;
//        while (low <= high) {
//            int mid = low + (high - low) / 2;
//
//            if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == n - 1 || arr[mid + 1] <= arr[mid]))
//                return mid;
//            else if (mid > 0 &&  arr[mid - 1] > arr[mid])
//                high = mid - 1;
//            else
//                low = mid + 1;
//        }
//        return 0;

        if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == n - 1 || arr[mid + 1] <= arr[mid]))
            return mid;

        else if (mid > 0 && arr[mid - 1] > arr[mid])
            return findPeakUtil(arr, low, (mid - 1), n);

        else
            return findPeakUtil(
                    arr, (mid + 1), high, n);

    }
}
