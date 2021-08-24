package stack.easy;

import java.util.Locale;
import java.util.Stack;

public class EasyString
{
    public static void main(String[] args)
    {
        System.out.println(transform("a"));
    }
    static String transform(String S)
    {
        S = S.toLowerCase(Locale.ROOT);
        char t = ' ';
        char t1 = ' ';
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for(int i = 0;i<S.length();i++)
        {
            if(stack.isEmpty())
            {
                t = S.charAt(i);
                count++;
            }
            else
            {
                t = stack.peek();
                if(t == S.charAt(i))
                    count++;
                else
                {
                    count = 1;
                }
                sb.append(String.valueOf(count).concat(String.valueOf(t)));
            }
            stack.push(S.charAt(i));
        }
        return sb.toString();
    }
}
