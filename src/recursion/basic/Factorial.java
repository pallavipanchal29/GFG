package recursion.basic;

//Completed GFG - correct
public class Factorial
{
    public static void main(String[] args)
    {
        System.out.println(factorial(5));
    }
    static long factorial(int N)
    {
        if(N == 0 || N == 1)
            return 1;
        return N * factorial(N-1);
    }
}
