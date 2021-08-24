package array.basic;

//Completed GFG - correct
public class GreaterOnRightSide
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{2, 3, 1, 9};
        nextGreatest(arr,arr.length);

        for(int i = 0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
    static void nextGreatest(int arr[], int n)
    {
        int max = arr[n-1];
        for(int i = arr.length-2;i>= 0;i--)
        {
            int temp = max;
            if(arr[i] > max)
                max = arr[i];
            arr[i] = temp;
        }
        arr[n-1] = -1;
    }
}
