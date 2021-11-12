package string.school;

//Completed GFG - correct
public class PrintReciprocalOfLetters
{
    public static void main(String[] args)
    {
        System.out.println(reciprocalString("Ish"));
    }
    static String reciprocalString(String S)
    {
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<S.length();i++)
        {
            if(Character.isSpaceChar(S.charAt(i)))
                sb.append(" ");
            else if(Character.isLowerCase(S.charAt(i)))
            {
                int index = Math.abs(97 - S.charAt(i));
                char c = (char) (122 - index);
                sb.append(c);
            }
            else if(Character.isUpperCase(S.charAt(i)))
            {
                int index = Math.abs(65 - S.charAt(i));
                char c = (char) (90 - index);
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
