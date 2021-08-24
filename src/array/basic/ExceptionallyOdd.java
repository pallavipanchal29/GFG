package array.basic;

//Completed GFG - correct
public class ExceptionallyOdd
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{1, 2, 3, 2, 3, 1, 3};
        System.out.println(getOddOccurrence(arr,arr.length));
    }
    static int getOddOccurrence(int[] arr, int n)
    {
        int odd = arr[0];
        for(int i = 1;i<n;i++)
        {
            odd = odd ^ arr[i];
        }
        return odd;
    }
}
