package string.school;

//Completed GFG - correct
public class DeleteAlternateCharacters
{
    public static void main(String[] args)
    {
        System.out.println(delAlternate("GeeksforGeeks"));
    }
    static String delAlternate(String S)
    {
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<S.length();i = i+2)
            sb.append(S.charAt(i));
        return sb.toString();
    }
}
