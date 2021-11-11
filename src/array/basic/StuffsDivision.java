package array.basic;

//Completed GFG - correct
public class StuffsDivision
{
    public static void main(String[] args)
    {
        long[] A = new long[]{1, 1, 1, 1, 1};
        System.out.println(possible(A,A.length));
    }
    public static boolean possible(long arr[], long n)
    {
        long actualSum = 0;
        long expectedSum = (n * (n + 1))/2;

        for(int i = 0;i<n;i++)
            actualSum = actualSum + arr[i];

        return actualSum == expectedSum;
    }
}
