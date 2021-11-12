package string.basic;

//Completed GFG - correct
public class SumOfSubsequencesOfNumber
{
    public static void main(String[] args)
    {
        System.out.println(subsequenceSum("123"));
    }

    static int subsequenceSum(String s)
    {
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            sum+=(s.charAt(i)-'0');
        }
        return (int) (sum * Math.pow(2,s.length()-1));
    }
}
