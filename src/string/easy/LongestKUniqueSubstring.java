package string.easy;

import java.util.HashMap;

public class LongestKUniqueSubstring {
    public static void main(String[] args) {
        System.out.println(longestkSubstr("aabacbebebe", 3));
    }

    public static int longestkSubstr(String s, int k) {
        int lo = 0;
        int hi = 0;
        HashMap<Character, Integer> hm = new HashMap<>();
        int max = -1;
        while (hi < s.length())
        {
            char ch = ' ';
            ch = s.charAt(hi);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
            if (hm.size() < k)
            {
                hi++;
            } else if (hm.size() == k)
            {
                max = Math.max(max, hi - lo + 1);
                hi++;
            }
            else if (hm.size() >= k)
            {
                while (hm.size() > k)
                {
                    char lch = s.charAt(lo);
                    hm.put(lch, hm.get(lch) - 1);
                    if (hm.get(lch) == 0)
                    {
                        hm.remove(lch);
                    }
                    lo++;
                }
                hi++;
            }
        }
        return max;
    }
}
