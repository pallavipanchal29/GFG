package string.basic;

import java.util.HashSet;

//Completed GFG - correct
public class CheckIfStringIsogram
{
    public static void main(String[] args)
    {
        System.out.println(isIsogram("machine"));
    }
    static boolean isIsogram(String data)
    {
        HashSet<Character> set = new HashSet<>();
        for(int i = 0;i<data.length();i++)
        {
            if(set.contains(data.charAt(i)))
                return false;
            else
                set.add(data.charAt(i));
        }
        return true;
    }
}
