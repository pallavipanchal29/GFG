package array.easy;

public class RearrangeArrayAlternate
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,2,3,4,5,6};
        rearrange(arr,arr.length);

        for(int i = 0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
    public static void rearrange(int arr[], int n)
    {
        int index = 0;
        int i = 0;
        int j = n-1;

        while (i < j)
        {
            arr[index++] = arr[j];
            j--;
            arr[index++] = arr[i];
            i++;
        }
    }
}
