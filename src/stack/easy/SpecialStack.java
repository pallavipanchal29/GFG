package stack.easy;

import java.util.Stack;

public class SpecialStack
{
    Stack<Integer> temp = new Stack<>();
    public void push(int a, Stack<Integer> s)
    {
        if(temp.isEmpty())
            temp.push(a);
        else if(a < temp.peek()) {
            temp.push(a);
        }
        s.push(a);
    }
    public int pop(Stack<Integer> s)
    {
        if(s.isEmpty())
            return -1;
        else
            {
                int a = s.peek();
            if(!temp.isEmpty())
            {
                if(temp.peek() == a) {
                    temp.pop();
                }
            }
            s.pop();
            return a;
        }
    }
    public int min(Stack<Integer> s)
    {
        return temp.peek();
    }
    public boolean isFull(Stack<Integer>s, int n)
    {
        return s.size() == n;
    }
    public boolean isEmpty(Stack<Integer>s)
    {
        return s.size() == 0;
    }
}
