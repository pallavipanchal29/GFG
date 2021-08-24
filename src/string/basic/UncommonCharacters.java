package string.basic;

//Completed GFG - correct
public class UncommonCharacters
{
    public static void main(String[] args)
    {
        System.out.println(UncommonChars("geeks","geeks"));
    }
    static String UncommonChars(String A, String B)
    {
        StringBuilder sb = new StringBuilder();
        char[] temp1 = new char[26];
        char[] temp2 = new char[26];
        for(int i = 0;i<A.length();i++)
        {
            temp1[A.charAt(i)-'a']++;
        }
        for(int i = 0;i<B.length();i++)
        {
            temp2[B.charAt(i)-'a']++;
        }
        for(int i = 0;i<temp1.length;i++)
        {
            if(temp1[i]==0 && temp2[i] == 0)
                continue;
            if(temp1[i] == 0|| temp2[i] == 0)
                sb.append((char)(i+'a'));
        }
        return sb.length() == 0 ? "-1" : sb.toString();
    }
}
