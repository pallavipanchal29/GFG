package stack.easy;

import java.util.Stack;

public class ParanthesisChecker
{
    public static void main(String[] args)
    {
        System.out.println(ispar("()"));
    }
    static boolean ispar(String x)
    {
        Stack<Character> stack = new Stack<>();
        for(int i = 0;i<x.length();i++)
        {
            if(x.charAt(i) == '{' || x.charAt(i) == '[' || x.charAt(i) == '(')
                stack.push(x.charAt(i));
            else
            {
                if(stack.isEmpty()) return false;
                char t = stack.pop();
                switch (x.charAt(i))
                {
                    case '}':
                        if(t != '{')
                            return false;
                        break;
                    case ']':
                        if(t != '[')
                            return false;
                        break;
                    case ')':
                        if(t != '(')
                            return false;
                        break;
                }
            }
        }
        return stack.size() == 0 ? true : false;
    }
}
