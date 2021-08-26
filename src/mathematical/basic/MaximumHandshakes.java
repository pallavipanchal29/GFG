package mathematical.basic;

public class MaximumHandshakes
{
    public static void main(String[] args)
    {
        System.out.println(handShakes(2));
    }
    static long handShakes(long N)
    {
        if(N == 0) return 0;
        return (N-1) + handShakes(N-1);
    }
}
