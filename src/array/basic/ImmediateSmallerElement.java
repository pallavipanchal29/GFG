package array.basic;

//Completed GFG - correct
public class ImmediateSmallerElement
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{895, 704, 812, 323};
        immediateSmaller(arr,arr.length);

        for(int i = 0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
    static void immediateSmaller(int arr[], int n)
    {
        for(int i = 0;i<n-1;i++)
        {
            if(arr[i] > arr[i+1])
                arr[i] = arr[i+1];
            else
                arr[i] = -1;
        }
        arr[n-1] = -1;
    }
}
