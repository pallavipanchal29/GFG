package string.easy;

import java.util.HashMap;

//Completed GFG - correct
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
            //put character in hashmap
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
            //if number if unique characters is less than k continue traversing by incrementing second pointer
            if (hm.size() < k)
            {
                hi++;
            }
            //if no of unique chars become equal to k note max length and increment second pointer
            else if (hm.size() == k)
            {
                max = Math.max(max, hi - lo + 1);
                hi++;
            }
            //if no. of unique characters becomes greater than k, remove some chars from left,
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
