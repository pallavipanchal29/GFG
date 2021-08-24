package string.basic;

import java.util.HashMap;
import java.util.Map;

public class CountTheCharacters
{
    public static void main(String[] args)
    {
        String s = "hqghumeaylnlfdxfircvscxggbwkfnqduxwfnfozvs";
        System.out.println(getCount(s,0));
    }
//    static int getCount (String S, int N)
//    {
//        int count = 0;
//        HashMap<Character,Integer> map = new HashMap<>();
//        int i = 0;
//        while (i < S.length())
//        {
//            map.put(S.charAt(i),map.getOrDefault(S.charAt(i),0)+1);
//            if(i+1 < S.length() && S.charAt(i) == S.charAt(i+1))
//            {
//                while (i +1 < S.length() && S.charAt(i) == S.charAt(i+1))
//                    i++;
//            }
//            else
//                i++;
//        }
//
//        for(Map.Entry<Character,Integer> entry : map.entrySet())
//        {
//            if(entry.getValue() == N)
//                count++;
//        }
//        return count;
//    }
    static int getCount (String S, int N)
    {
        int count = 0;
        char[] temp = new char[26];
        for(int i= 0;i<S.length();i++)
            temp[S.charAt(i)-'a']++;

        for(int i = 0;i<temp.length;i++)
        {
            if(temp[i] == N)
                count++;
        }
        return count;
    }
}
