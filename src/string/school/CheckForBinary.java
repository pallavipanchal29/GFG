package string.school;

//completed GFG - correct
public class CheckForBinary
{
    public static void main(String[] args)
    {
        System.out.println(isBinary("101"));
    }
    static boolean isBinary(String str)
    {
        for(int i = 0;i<str.length();i++)
        {
            if(Integer.parseInt(String.valueOf(str.charAt(i))) < 0 || Integer.parseInt(String.valueOf(str.charAt(i))) > 1)
                return false;
        }
        return true;
    }
}
