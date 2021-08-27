package array.basic;

//Completed GFG - correct
public class FindElementAppearsExactlyOnceSortedArray
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{1, 1, 2, 2, 3, 3, 4, 50, 50, 65, 65};
        System.out.println(findOnce(arr,arr.length));
    }
    static int findOnce(int arr[], int n)
    {
        int start = 0, end = n-1;

        while(start < end){
            int mid = start + (end - start) / 2;

            if((mid % 2 == 0) && arr[mid] == arr[mid + 1] || (mid % 2 != 0) && arr[mid] == arr[mid - 1])
                start = mid + 1;
            else
                end = mid;
        }
        return arr[start];
    }

}
