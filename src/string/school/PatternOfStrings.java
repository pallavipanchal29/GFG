package string.school;

import java.util.ArrayList;

//Completed GFG - correct
public class PatternOfStrings
{
    public static void main(String[] args)
    {
        System.out.println(pattern("GeeK"));
    }

    static ArrayList<String> pattern(String S)
    {
        ArrayList<String> answers = new ArrayList<>();
        for(int i = S.length();i>0;i--)
        {
            StringBuilder sb = new StringBuilder();
            for(int j = 0;j<i;j++)
            {
                sb.append(S.charAt(j));
            }
            answers.add(sb.toString());
        }
        return answers;
    }
}
