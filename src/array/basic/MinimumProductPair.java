package array.basic;

//Completed GFG - correct
public class MinimumProductPair
{
    public static void main(String[] args)
    {
        long[] A = new long[]{198, 76, 544, 123, 154, 675};
        System.out.println(printMinimumProduct(A,A.length));
    }
    public static long printMinimumProduct(long arr[], long n)
    {
        long first = Long.MAX_VALUE;
        long second = Long.MAX_VALUE;

        for(int i = 0;i<n;i++)
        {
            if(arr[i] < first)
            {
                second = first;
                first = arr[i];
            }
            else if(arr[i] != first && arr[i] > first && arr[i] < second)
            {
                second = arr[i];
            }
        }
        return (first * second * 1L);
    }
}
