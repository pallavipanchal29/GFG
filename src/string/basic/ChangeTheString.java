package string.basic;

//Completed GFG - correct
public class ChangeTheString
{
    public static void main(String[] args)
    {
        System.out.println(modify("Abcd"));
    }
    static String modify(String s)
    {
        if(s.charAt(0) >= 'a' && s.charAt(0) <= 'z')
            s = s.toLowerCase();
        else
            s = s.toUpperCase();
        return s;
    }
}
