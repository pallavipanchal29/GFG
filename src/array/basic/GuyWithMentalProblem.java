package array.basic;

//Completed GFG - correct
public class GuyWithMentalProblem
{
    public static void main(String[] args)
    {
        long[] a = new long[]{2, 1, 2};
        long[] b = new long[]{3, 2, 1};
        System.out.println(minTime(a,b,a.length));
    }
    public static long minTime(long a[], long b[], long n)
    {
        long firstSum = 0L;
        long secondSum = 0L;
        for(int i = 0;i<n;i++)
        {
            if(i % 2 == 0)
            {
                firstSum = firstSum + a[i];
                secondSum = secondSum + b[i];
            }
            else
            {
                firstSum = firstSum + b[i];
                secondSum = secondSum + a[i];
            }
        }
        return Math.min(firstSum,secondSum);
    }
}
