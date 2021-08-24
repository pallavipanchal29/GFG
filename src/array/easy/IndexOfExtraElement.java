package array.easy;

//Completed GFG - correct
public class IndexOfExtraElement
{
    public static void main(String[] args)
    {
        int[] arr1 = new int[]{2,4,6,8,9,10,12};
        int[] arr2 = new int[]{2,4,6,8,10,12};
        System.out.println(findExtra(arr1,arr2,arr1.length));
    }
    public static int findExtra(int a[], int b[], int n)
    {
        int index = binarySearch(a,b,0,n-1,n);
        return index;
    }

    private static int binarySearch(int[] a, int[] b, int low, int high,int length)
    {
        while (low <= high)
        {
            int mid = low + (high - low)/2;
            //Handling case where second array length less than first array - corner case
            if(mid >= b.length)
                return mid;

            //if both index elements are same searching for extra element in second half
            if(a[mid] == b[mid])
                low = mid+1;

            //Already passed extra element , so finding it from beginning
            else if(b[mid] > a[mid])
            {
                while (low < length)
                {
                    //Corner case - extra element is at end of first array
                    if(low >= b.length)
                        return low;
                    while(a[low] == b[low])
                        low++;
                    return low;
                }
            }
        }
        return -1;
    }
}
