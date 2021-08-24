package string.basic;

//Completed GFG - correct
public class AnagramStrings
{
    public static void main(String[] args)
    {
        System.out.println(areAnagram("cdbkdub","dsbkcsdn"));
    }
    static int areAnagram(String S1, String S2)
    {
        char[] temp = new char[26];
        for(int i = 0;i<S1.length();i++)
            temp[S1.charAt(i)-'a']++;
        for(int i = 0;i<S2.length();i++)
            temp[S2.charAt(i)-'a']--;

        for(int i = 0;i<temp.length;i++)
        {
            if(temp[i] != 0)
                return 0;
        }
        return 1;
    }
}
