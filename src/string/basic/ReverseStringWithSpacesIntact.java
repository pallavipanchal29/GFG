package string.basic;

//Completed GFG - correct
public class ReverseStringWithSpacesIntact
{
    public static void main(String[] args)
    {
        System.out.println(reverseWithSpacesIntact(" ynf"));
    }
    static String reverseWithSpacesIntact(String S)
    {
        char[] temp = S.toCharArray();
        int i = 0;
        int j = S.length()-1;

        while (i<j)
        {
            if(Character.isSpaceChar(S.charAt(i)))
                i++;
            else if(Character.isSpaceChar(S.charAt(j)))
                j--;
            else {
                char t = temp[i];
                temp[i] = temp[j];
                temp[j] = t;
                i++;
                j--;
            }
        }
        return String.valueOf(temp);
    }
}
