package string.easy;

import java.util.Iterator;
import java.util.LinkedHashSet;

//Completed GFG - correct
public class RemoveDuplicatesFromString
{
    public static void main(String[] args)
    {
        System.out.println(removeDuplicates("geeksforgeeks"));
    }
    static String removeDuplicates(String str)
    {
        StringBuilder sb = new StringBuilder();
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for(int i = 0;i<str.length();i++)
        {
            set.add(str.charAt(i));
        }
        Iterator<Character> it1 = set.iterator();
        while (it1.hasNext())
        {
            sb.append(it1.next());
        }
        return sb.toString();
    }
}
