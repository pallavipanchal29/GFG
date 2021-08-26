package array.medium;

import java.util.HashMap;

public class NutsAndBoltsProblem
{
    public static void main(String[] args)
    {
        char[] nuts = new char[]{'@', '%', '$', '#', '^'};
        char[] bolts = new char[]{'%', '@', '#', '$','^'};

        matchPairs(nuts,bolts,nuts.length);

        for(int i = 0;i<nuts.length;i++)
            System.out.print(nuts[i]+" ");
        for(int i = 0;i<bolts.length;i++)
            System.out.print(bolts[i]+" ");
    }
    static void matchPairs(char nuts[], char bolts[], int n)
    {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<n;i++)
            map.put(nuts[i],i);

    }
}
