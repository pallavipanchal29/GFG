package array.basic;

public class MinNumForSumEven
{
    public static void main(String[] args)
    {
        long[] arr = new long[]{1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(minNum(arr,arr.length));
    }
    static long minNum(long A[], int N)
    {
        long sum = 0L;
        for(int i = 0;i<N;i++)
        {
            sum = sum + A[i];
        }
        if((sum & 1) == 1)
            return 1;
        else
            return 2;
    }
}
