package array.basic;

//Completed GFG - correct
public class SmallestAndSecondSmallest
{
    public static void main(String[] args)
    {
        long[] arr = new long[]{2 ,4, 3, 5, 6};
        long[] ans = minAnd2ndMin(arr,arr.length);
        System.out.print(ans[0]+" "+ans[1]);
    }
    public static long[] minAnd2ndMin(long a[], long n)
    {
        long smallest = Long.MAX_VALUE;
        long secondSmallest  = Long.MAX_VALUE;

        for(int i = 0;i<n;i++)
        {
            if(a[i] < smallest)
            {
                secondSmallest = smallest;
                smallest = a[i];
            }
            else if(a[i] > smallest && a[i] < secondSmallest)
                secondSmallest = a[i];
        }
        if(smallest != Long.MAX_VALUE && secondSmallest != Long.MAX_VALUE)
            return new long[]{smallest,secondSmallest};
        else return new long[] { -1,-1};
    }
}
