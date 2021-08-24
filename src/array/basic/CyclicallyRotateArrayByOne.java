package array.basic;

//Completed GFG - correct
public class CyclicallyRotateArrayByOne
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        rotate(arr,arr.length);

        for(int i = 0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
    public static void rotate(int arr[], int n)
    {
        int temp = arr[n-1];
        for(int i = n-1;i>0;i--)
        {
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
    }
}
