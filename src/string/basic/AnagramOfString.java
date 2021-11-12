package string.basic;

//Completed GFG - correct
public class AnagramOfString
{
    public static void main(String[] args)
    {
        System.out.println(remAnagrams("cddgk","gcd"));
    }
    public static int remAnagrams(String s,String s1)
    {
        int del = 0;
        char[] temp1 = new char[26];
        for(int i = 0;i<s.length();i++)
            temp1[s.charAt(i)-'a']++;

        char[] temp2 = new char[26];
        for(int i = 0;i<s1.length();i++)
            temp2[s1.charAt(i)-'a']++;

        for(int i=0;i<temp1.length;i++)
        {
            if(temp1[i]>temp2[i])
                del+=temp1[i]-temp2[i];
            else if(temp2[i]>temp1[i])
                del+=temp2[i]-temp1[i];
        }
        return del;
    }
}
