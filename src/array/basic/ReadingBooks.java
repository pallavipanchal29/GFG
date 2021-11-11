package array.basic;

//Completed GFG - correct
public class ReadingBooks
{
    public static void main(String[] args)
    {
        long[] a = new long[]{3, 4, 5};
        long[] b = new long[]{4, 4, 5};

        System.out.println(maxPoint(a.length,10,a,b));
    }
    static long maxPoint(int N, long K, long A[], long B[])
    {
        Long max  = Long.MIN_VALUE;
        for(int i = 0;i<N;i++)
        {
            long points = 0;
            long minutes = 0;
            int count = 0;
            while (minutes + A[i] <= K)
            {
                minutes = minutes + A[i];
                count++;
            }
            points = count * B[i];
            max = Math.max(points,max);
        }
        return max;
    }
}
