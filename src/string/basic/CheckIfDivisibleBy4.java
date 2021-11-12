package string.basic;

//Completed GFG - correct
public class CheckIfDivisibleBy4
{
    public static void main(String[] args)
    {
        System.out.println(divisibleBy4("94"));
    }

    static int divisibleBy4 (String N)
    {
        if(N.length() < 2) return 0;
        String temp = N.substring(N.length()-2);
        return (Integer.parseInt(temp) % 4) == 0 ? 1 : 0;
    }
}
