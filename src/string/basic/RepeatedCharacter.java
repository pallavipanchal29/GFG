package string.basic;

import java.util.LinkedHashMap;
import java.util.Map;

public class RepeatedCharacter
{
    public static void main(String[] args)
    {
        char res = firstRep("abcde");
        if(res == '#')
            System.out.println(-1);
        else
            System.out.println(res);
    }
    static char firstRep(String S)
    {
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        for(int i = 0;i<S.length();i++)
        {
            map.put(S.charAt(i),map.getOrDefault(S.charAt(i),0)+1);
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet())
        {
            if(entry.getValue() > 1)
                return entry.getKey();
        }
        return '#';
    }
}
