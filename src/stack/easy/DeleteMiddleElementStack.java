package stack.easy;

import java.util.Stack;

//Completed GFG - correct
public class DeleteMiddleElementStack
{
    public static void main(String[] args)
    {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        deleteMid(stack,stack.size());

        while (!stack.isEmpty())
            System.out.print(stack.pop()+" ");
    }
    public static void deleteMid(Stack<Integer> s, int sizeOfStack)
    {
        deleteMid(s,sizeOfStack,0);
    }

    private static void deleteMid(Stack<Integer> s, int n, int curr)
    {
        if(s.empty() || curr == n)
            return;
        int x = s.pop();
        deleteMid(s,n,curr+1);

        if(curr != n/2)
            s.push(x);
    }
}
