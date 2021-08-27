package string.easy;

//Completed GFG - correct
public class KPangrams
{
    public static void main(String[] args)
    {
        System.out.println(kPangram("hello world atlas we meet yet again",11));
    }
    static boolean kPangram(String str, int k)
    {
        str = str.replaceAll("\\s", "");
        int count = 0;
        if(str.length() < 26)
            return false;
        char[] temp = new char[26];
        for(int i = 0;i<str.length();i++)
        {
            temp[str.charAt(i)-'a']++;
        }
        for(int i = 0;i<temp.length;i++)
        {
            if(temp[i] == 0)
                count++;
        }
        if(count > k )
            return false;
        else
            return true;
    }
}
