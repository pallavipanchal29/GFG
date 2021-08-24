package stack.easy;

import java.util.Stack;

//Completed GFG - correct
public class EvaluationOfPostfixExpression
{
    public static void main(String[] args)
    {
        System.out.println(evaluatePostFix("123+*8-"));
    }
    public static int evaluatePostFix(String S)
    {
        Stack<String> stack = new Stack<>();
        for(int i = 0;i<S.length();i++)
        {
            char t = S.charAt(i);
            if(Character.isDigit(t))
                stack.push(String.valueOf(t));
            else
            {
                int a = Integer.parseInt(String.valueOf(stack.pop()));
                int b = Integer.parseInt(String.valueOf(stack.pop()));
                switch (t)
                {
                    case  '+':
                        stack.push(String.valueOf(b+a));
                        break;
                    case  '-':
                        stack.push(String.valueOf(b-a));
                        break;
                    case  '*':
                        stack.push(String.valueOf(b*a));
                        break;
                    case  '/':
                        stack.push(String.valueOf(b/a));
                        break;
                }
            }
        }
        return Integer.parseInt(stack.pop());
    }
}
