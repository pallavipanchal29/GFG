package string.school;

public class ReverseString
{
    public static void main(String[] args)
    {
        System.out.println(revStrArray("GeeksforGeeks"));
    }
    static String revStr(String S)
    {
        StringBuilder sb = new StringBuilder();
        for(int i = S.length()-1;i>=0;i--)
            sb.append(S.charAt(i));
        return sb.toString();
    }
    static String revStrArray(String S)
    {
        char[] temp = S.toCharArray();
        int i = 0;
        int j = S.length()-1;

        while (i < j)
        {
            char t = temp[i];
            temp[i] = temp[j];
            temp[j] = t;
            i++;
            j--;
        }
        return String.valueOf(temp);
    }
}
