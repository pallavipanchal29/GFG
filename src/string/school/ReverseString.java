package string.school;

public class ReverseString
{
    public static void main(String[] args)
    {
        System.out.println(revStr("GeeksforGeeks"));
    }
    static String revStr(String S)
    {
        StringBuilder sb = new StringBuilder();
        for(int i = S.length()-1;i>=0;i--)
            sb.append(S.charAt(i));
        return sb.toString();
    }
}
