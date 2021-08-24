package string.school;

//Completed GFG - correct
public class CountTypeOfChars
{
    public static void main(String[] args)
    {
        int[] answers = count("*GeEkS4GeEkS*");
        for(int i = 0;i<answers.length;i++)
            System.out.println(answers[i]);
    }
    static int[] count (String s)
    {
        int upper = 0;
        int lower = 0;
        int digits = 0;
        int special = 0;

        for(int i = 0;i<s.length();i++)
        {
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
                lower++;
            else if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
                upper++;
            else if(Character.isDigit(s.charAt(i)))
                digits++;
            else
                special++;
        }
        return new int[]{upper,lower,digits,special};
    }
}
