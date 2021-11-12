package string.basic;

//Completed GFG - correct
public class CheckIfDivisibleBy11
{
    public static void main(String[] args)
    {
        System.out.println(divisibleBy11("12"));
    }

    static int divisibleBy11 (String S)
    {
        int sumOdd = 0;
        int sumeven = 0;

        for(int i = 0;i<S.length();i++)
        {
            if(i % 2 == 0)
                sumeven = sumeven + Integer.parseInt(String.valueOf(S.charAt(i)));
            else
                sumOdd = sumOdd + Integer.parseInt(String.valueOf(S.charAt(i)));
        }
        int diff = Math.abs(sumeven - sumOdd);
        return diff % 11 == 0 ? 1 : 0;
    }
}
