package array.easy;

//Completed GFG - correct
public class NeedSomeChange
{
    public static void main(String[] args)
    {
        //3 4 5 2 1
        int[] arr = new int[]{1 ,2, 3, 4, 5};
        swapElements(arr,arr.length);

        for(int i = 0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
    public static void swapElements(int[] arr, int n)
    {
        int i = 0;
        int j = i+2;

        while (j < n)
        {
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++;
            j = i+2;
        }
    }
}
