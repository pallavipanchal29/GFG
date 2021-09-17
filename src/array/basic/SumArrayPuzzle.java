package array.basic;

//Completed GFG - correct
public class SumArrayPuzzle
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{3, 6 ,4, 8, 9};
        SumArray(arr,arr.length);
    }
    public static void SumArray(int arr[], int n)
    {
        int sum = 0;
        for(int i = 0;i<n;i++)
            sum = sum + arr[i];

        for(int i = 0;i<n;i++)
        {
            arr[i] = sum - arr[i];
        }

        for(int i = 0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
}
