package string.basic;

//Completed GFG  - correct
public class SubstringsWithSimilarFirstAndLast
{
    public static void main(String[] args)
    {
        System.out.println(countSubstringWithEqualEnds("abcab"));
    }

    //O(nsquare) Complexity
//    static int countSubstringWithEqualEnds(String s)
//    {
//        int result = 0;
//        int n = s.length();
//
//        for (int i = 0; i < n; i++)
//            for (int j = i; j < n; j++)
//                if (s.charAt(i) == s.charAt(j))
//                    result++;
//
//        return result;
//    }

    //O(n) time complexity
    static int countSubstringWithEqualEnds(String s)
    {
        int result = 0;
        int n = s.length();

        int[] count = new int[26];
        // calculating frequency of each character
        for (int i=0; i<n; i++) {
            count[s.charAt(i)-'a']++;
        }
        // Computing result using the frequency table
        for (int i=0; i<26; i++) {
            // using the formula that we built
            result += (count[i]*(count[i]+1)/2);
        }
        // returning the result
        return result;
    }

}
