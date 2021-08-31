package array.easy;

//Completed GFG - correct
public class SearchInRotatedArray
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{3, 5, 1, 2};
        System.out.println(search(arr,0,arr.length-1,1));
    }
    static int search(int A[], int l, int h, int key)
    {
        while (l <= h)
        {
            int mid = l + (h - l)/2;
            if(A[mid] == key)
                return mid;
            if(A[l] < A[mid])
            {
                if(key >= A[l] && key <  A[mid])
                {
                    h = mid - 1;
                }
                else
                    l = mid + 1;
            }
            else
            {
                if(key > A[mid] && key <= A[h])
                {
                    l = mid + 1;
                }
                else
                {
                    h = mid - 1;
                }
            }
        }
        return -1;
    }
}
