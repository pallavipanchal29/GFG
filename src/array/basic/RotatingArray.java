package array.basic;

//Completed GFG - correct
public class RotatingArray
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7 };
        leftRotate(arr,arr.length,2);

        for(int i = 0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
    static void leftRotate(int[] arr, int n, int d)
    {
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }

    private static void reverse(int[] arr, int left,int right)
    {
        while (left <= right)
        {
            int t = arr[left];
            arr[left] = arr[right];
            arr[right] = t;
            left++;
            right--;
        }
    }
}
