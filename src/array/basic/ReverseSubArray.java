package array.basic;

//Completed GFG - correct
public class ReverseSubArray
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{1, 6, 7, 4};
        reverseSubArray(arr,arr.length,1,4);

        for(int i = 0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
    static void reverseSubArray(int arr[], int n, int l, int r)
    {
        if(r < l)
            return;
        while (l < r)
        {
            int t = arr[l-1];
            arr[l-1] = arr[r-1];
            arr[r-1] = t;
            l++;
            r--;
        }
    }
}
