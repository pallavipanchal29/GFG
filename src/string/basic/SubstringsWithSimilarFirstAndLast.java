package string.basic;

//Completed GFG  - correct
public class SubstringsWithSimilarFirstAndLast
{
    public static void main(String[] args)
    {
        System.out.println(countSubstringWithEqualEnds("abcab"));
    }
    static int countSubstringWithEqualEnds(String s)
    {
        int result = 0;
        int n = s.length();

        for (int i = 0; i < n; i++)
            for (int j = i; j < n; j++)
                if (s.charAt(i) == s.charAt(j))
                    result++;

        return result;
    }
}
