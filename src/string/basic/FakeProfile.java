package string.basic;

import java.util.HashSet;

public class FakeProfile
{
    public static void main(String[] args)
    {
        System.out.println(solve("jpmztf"));
    }
    public static String solve(String a)
    {
        HashSet<Character> set = new HashSet<>();
        for(int i = 0;i<a.length();i++)
            set.add(a.charAt(i));
        if((set.size() & 1) == 1)
            return "HE";
        else
            return "SHE";
    }
}
