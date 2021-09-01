package string.basic;

//Completed GFG - correct
public class CheckForSubsequence
{
    public static void main(String[] args)
    {
        System.out.println(isSubSequence("gksrek","geeksforgeeks"));
    }
    static boolean isSubSequence(String A, String B)
    {
        int index = 0;
        for(int i = 0;i<B.length();i++)
        {
            if(index < A.length() && B.charAt(i) == A.charAt(index))
                index++;
        }
        return index == A.length();
    }
}
