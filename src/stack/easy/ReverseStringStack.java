package stack.easy;

import java.util.Stack;

//Completed GFG - correct
public class ReverseStringStack
{
    public static void main(String[] args)
    {
        System.out.println(reverse("GeeksforGeeks"));
    }
    public static String reverse(String S)
    {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(int i = 0;i<S.length();i++)
            stack.push(S.charAt(i));

        while (!stack.isEmpty())
        {
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}
