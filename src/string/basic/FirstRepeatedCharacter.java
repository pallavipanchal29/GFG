package string.basic;

import java.util.HashMap;

//Completed GFG - correct
public class FirstRepeatedCharacter
{
    static class Pair
    {
        int index;
        int count;

        public Pair(int i,int c)
        {
            index = i;
            count = c;
        }
    }
    public static void main(String[] args)
    {
        System.out.println(firstRepChar("crg"));
    }
    static String firstRepChar(String s)
    {
        char first = ' ';
        HashMap<Character,Pair> map = new HashMap<>();
        for(int i = 0;i<s.length();i++)
        {
            Pair pair = map.get(s.charAt(i));
            if(pair == null)
            {
                map.put(s.charAt(i),new Pair(i,1));
            }
            else
                {
                    int index = map.get(s.charAt(i)).index;
                    int count = pair.count+1;
                    if(count > 1)
                        return String.valueOf(s.charAt(i));
                    map.put(s.charAt(i), new Pair(index,pair.count+1));
            }
        }
        return first == ' ' ? String.valueOf(-1) : String.valueOf(first);
    }
}
