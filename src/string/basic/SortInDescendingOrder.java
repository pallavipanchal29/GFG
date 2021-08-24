package string.basic;

//Completed GFG - correct
public class SortInDescendingOrder
{
    public static void main(String[] args)
    {
        System.out.println(ReverseSort("geeks"));
    }
    static String ReverseSort(String str)
    {
        StringBuilder sb = new StringBuilder();
        char[] temp = new char[26];
        for(int i = 0;i<str.length();i++)
            temp[str.charAt(i)-'a']++;

        for(int i = temp.length-1;i>=0;i--)
        {
            if(temp[i] == 1)
                sb.append((char)(i+'a'));
            else
            {
                int c = temp[i];
                while (c>0)
                {
                    sb.append((char) (i+'a'));
                    c--;
                }
            }
        }
        return sb.toString();
    }
}
