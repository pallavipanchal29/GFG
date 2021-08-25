package string.easy;

//Completed GFG - correct
public class CheckIfStringsKAnagrams
{
    public static void main(String[] args)
    {
        System.out.println(areKAnagrams("qdqnmjujbvd","zdybxcalzux",6));
    }
    static boolean areKAnagrams(String s1, String s2, int k)
    {
        if(s1.length() != s2.length()) return false;
        char[] count1 = new char[26];
        for(int i = 0; i < s1.length(); i++)
        {
            count1[s1.charAt(i) - 'a']++;
        }

        char[] count2 = new char[26];
        for(int i = 0; i < s2.length(); i++)
        {
            count2[s2.charAt(i) - 'a']++;
        }

        int misMatched = 0;
        for(int i = 0; i < 26; i++)
        {
            if(count1[i] > count2[i])
            {
                misMatched += Math.abs(count1[i] - count2[i]);
            }
        }

        return misMatched <= k;
    }
}
