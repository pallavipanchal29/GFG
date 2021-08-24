package string.basic;

import java.util.HashSet;
import java.util.Iterator;

public class RemoveCommonCharsConcatenate
{
    public static void main(String[] args)
    {
        System.out.println(concatenatedString("aacdb","gafd"));
    }
    public static String concatenatedString(String s1,String s2)
    {
        StringBuilder sb = new StringBuilder();
        HashSet<Character> set1 = new HashSet<>();
        for(int i = 0;i<s1.length();i++)
            set1.add(s1.charAt(i));

        HashSet<Character> set2 = new HashSet<>();
        for(int i = 0;i<s2.length();i++)
            set2.add(s2.charAt(i));

        set1.retainAll(set2);
        Iterator<Character> it1 = set1.iterator();
        while (it1.hasNext())
            sb.append(it1.next());

        return sb.length() != 0 ? sb.toString(): "-1";
    }
}
