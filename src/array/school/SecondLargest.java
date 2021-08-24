package array.school;

//Completed GFG - correct
public class SecondLargest
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{12, 35, 1, 10, 34, 1};
        System.out.println(print2largest(arr,arr.length));
    }
    static int print2largest(int arr[], int n)
    {
        int first  = -1;
        int second = -1;

        for(int i = 0;i<n;i++)
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
