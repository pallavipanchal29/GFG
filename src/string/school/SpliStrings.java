package string.school;

import java.util.ArrayList;
import java.util.List;

//Completed GFG - correct
public class SpliStrings
{
    public static void main(String[] args)
    {
        System.out.println(splitString("12345!!!"));
    }
    static List<String> splitString(String S)
    {
        List<String> answers = new ArrayList<>();
        StringBuilder letters = new StringBuilder();
        StringBuilder digits = new StringBuilder();
        StringBuilder alpha = new StringBuilder();

        for(int i = 0;i<S.length();i++)
        {
            if(Character.isLetter(S.charAt(i)))
                letters.append(S.charAt(i));
            else if(Character.isDigit(S.charAt(i)))
                digits.append(S.charAt(i));
            else
                alpha.append(S.charAt(i));
        }
        answers.add(letters.length() == 0 ? "-1" : letters.toString());
        answers.add(digits.length() == 0 ?"-1":digits.toString());
        answers.add(alpha.length() == 0 ? "-1":alpha.toString());
        return answers;
    }
}
