package string.easy;

public class MinimumIndexOfCharacter
{
    public static void main(String[] args)
    {
        System.out.println(printMinIndexChar("adcffaet","onkl"));
    }
    public static int printMinIndexChar(String S, String patt)
    {
        int out = S.length();
        for (char c : patt.toCharArray()) {
            int i = S.indexOf(c);
            if (i >= 0) out = Math.min(out, i);
        }
        return out == S.length() ? -1 : out;
    }
}
