package array.school;

//Completed GFG - correct
public class CountOfSmallerElements
{
    public static void main(String[] args)
    {
        long[] arr = new long[]{1, 2, 4, 5, 8, 10};
        System.out.println(countOfElements(arr,arr.length,9));
    }
    public static long countOfElements(long arr[], long n, long x)
    {
        long count = 0L;
        for(int i = 0;i<n;i++)
        {
            if (arr[i]<=x)
                count++;
        }
        return count;
    }
}
