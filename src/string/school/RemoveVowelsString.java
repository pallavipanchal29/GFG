package string.school;

//Completed GFG - correct
public class RemoveVowelsString
{
    public static void main(String[] args)
    {
        System.out.println(removeVowels("welcome to geeksforgeeks"));
    }
    static String removeVowels(String S)
    {
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<S.length();i++)
        {
            if(!isVowel(S.charAt(i)))
                sb.append(S.charAt(i));
        }
        return sb.toString();
    }
    private static boolean isVowel(char c)
    {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }
}
