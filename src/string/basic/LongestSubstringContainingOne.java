package string.basic;

//Completed GFG - correct
public class LongestSubstringContainingOne
{
    public static void main(String[] args)
    {
        System.out.println(count("11101110"));
    }

    public static int count(String s)
    {
        int maxLen = 0;
        int len = 0;

        for(int i = 0;i<s.length();i++)
        {
            if(s.charAt(i) == '1')
            {
                len = 1;
                for(int j = i+1;j<s.length() && s.charAt(j) == '1';j++)
                {
                    len++;
                }
                maxLen = Math.max(len,maxLen);
            }
        }
        return maxLen;
    }
}
