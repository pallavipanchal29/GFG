package array.school;

//Completed GFG - correct
public class SumOfSeries
{
    public static void main(String[] args)
    {
        int N = 46341;
        System.out.println(seriesSum(N));
    }
    static long seriesSum(int n)
    {
        Long sum = (long)((n * (n+1))/2);
        return sum;
    }
}
