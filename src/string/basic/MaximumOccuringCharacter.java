package string.basic;

import java.util.*;

//Completed GFG - correct
public class MaximumOccuringCharacter
{
    public static void main(String[] args)
    {
        System.out.println(getMaxOccuringChar("output"));
    }
//    public static char getMaxOccuringChar(String line)
//    {
//        char c = (char) Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
//        HashMap<Character,Integer> map = new HashMap<>();
//        for(int i = 0;i<line.length();i++)
//        {
//            map.put(line.charAt(i),map.getOrDefault(line.charAt(i),0)+1);
//        }
//        for(Map.Entry<Character,Integer> entry : map.entrySet())
//        {
//           if(entry.getValue() > max)
//           {
//               max = entry.getValue();
//               c = entry.getKey();
//           }
//           else if (entry.getValue() == max && entry.getKey() < c)
//               c = entry.getKey();
//        }
//        return c;
//    }

    public static char getMaxOccuringChar(String line)
    {
        char c = (char) Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        char[] temp = new char[26];
        for(int i = 0;i<line.length();i++)
            temp[line.charAt(i) - 'a']++;

        for(int i = 0;i<temp.length;i++)
        {
            if(temp[i] > max)
            {
                max = temp[i];
                c = (char)(i + 'a');
            }
        }
        return c;
    }
}
