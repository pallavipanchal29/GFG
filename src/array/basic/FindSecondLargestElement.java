package array.basic;

//Completed GFG - correct
public class FindSecondLargestElement
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{2, 4, 5, 6, 7};
        System.out.println(print2largest(arr,arr.length));
    }
    public static int print2largest(int arr[],int N)
    {
        int first  = -1;
        int second = -1;

        for(int i = 0;i<N;i++)
        {
            if(arr[i] > first)
            {
                second = first;
                first = arr[i];
            }
            else if(arr[i] < first & arr[i] > second)
                second = arr[i];
        }
        return second;
    }
}
