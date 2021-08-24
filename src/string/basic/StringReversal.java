package string.basic;

import java.util.LinkedHashMap;
import java.util.Map;

//Completed GFG -correct
public class StringReversal
{
    public static void main(String[] args)
    {
        System.out.println(reverseString("I AM AWESOME"));
    }
    public static String reverseString(String s)
    {
        StringBuilder sb  = new StringBuilder();
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        for(int i = s.length()-1;i>=0;i--)
        {
            if(Character.isLetter(s.charAt(i)))
                map.put(s.charAt(i),i);
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet())
        {
            sb.append(entry.getKey());
        }
        return sb.toString();
    }
}
