package string.school;

//completed GFG - correct
public class JavaStrings
{
    public static void main(String[] args)
    {
        System.out.println(conRevstr("Geeks","forGeeks"));
    }
    static String conRevstr(String S1, String S2)
    {
        StringBuilder sb = new StringBuilder();
        S1 = S1.concat(S2);
        char[] temp = S1.toCharArray();
        for(int i = temp.length - 1;i>=0;i--)
            sb.append(temp[i]);
        return sb.toString();
    }
}
