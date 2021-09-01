package string.basic;

public class RemoveConsecutiveCharacters
{
    public static void main(String[] args)
    {
        System.out.println(removeConsecutiveCharacter("bcdebeaec"));
    }
    public static String removeConsecutiveCharacter(String S)
    {
        StringBuilder sb = new StringBuilder();
        int j = 1;
        sb.append(S.charAt(0));
        while (j < S.length())
        {
           if(S.charAt(j) != S.charAt(j-1))
           {
               sb.append(S.charAt(j));
           }
           j++;
        }
        return sb.toString();
    }
}
