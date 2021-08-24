package string.basic;

import java.util.HashSet;

//Completed GFG - correct
public class AnagramPalindrome
{
    public static void main(String[] args)
    {
        System.out.println(isPossible("geeksforgeeks"));
    }
    static int isPossible (String S)
    {
        HashSet<Character> set = new HashSet<>();
        for(int i = 0;i<S.length();i++)
        {
            if(set.contains(S.charAt(i)))
                set.remove(S.charAt(i));
            else
                set.add(S.charAt(i));
        }
        return ((set.size() == 0) ||(set.size() == 1)) ? 1 : 0;
    }
}
