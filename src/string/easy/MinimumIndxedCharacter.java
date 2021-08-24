package string.easy;

//Completed GFG - correct
public class MinimumIndxedCharacter
{
    public static void main(String[] args)
    {
        System.out.println(printMinIndexChar("udllxuknne","ldkzxtpkzg"));
    }
    public static String printMinIndexChar(String S, String patt)
    {
        int min = Integer.MAX_VALUE;
        String s = "$";
        for(int i = 0;i<S.length();i++)
        {
            if(patt.contains(String.valueOf(S.charAt(i))))
            {
                if(i < min)
                {
                    min = i;
                    s = String.valueOf(S.charAt(i));
                }
            }
        }
        return s;
    }
}
