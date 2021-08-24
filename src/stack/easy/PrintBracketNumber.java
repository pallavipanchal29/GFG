package stack.easy;

import java.util.ArrayList;
import java.util.Stack;

//Completed GFG - correct
public class PrintBracketNumber
{
    public static void main(String[] args)
    {
        ArrayList<Integer> answers = barcketNumbers("(((()(");
        for(int i = 0;i<answers.size();i++)
            System.out.print(answers.get(i)+" ");
    }
    static ArrayList<Integer> barcketNumbers(String S)
    {
        int count = 0;
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> answers = new ArrayList<>();
        for(int i = 0;i<S.length();i++)
        {
            if(S.charAt(i) == '(')
            {
                count++;
                answers.add(count);
                stack.push(count);
            }
            else if(S.charAt(i) == ')')
            {
                answers.add(Integer.valueOf(stack.pop()));
            }
        }
        return answers;
    }
}
