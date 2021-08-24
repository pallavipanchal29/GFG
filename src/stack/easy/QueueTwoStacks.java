package stack.easy;

import java.util.Stack;

//Completed GFG - correct
public class QueueTwoStacks
{
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<>();

    //Function to push an element in queue by using 2 stacks.
    void Push(int x)
    {
        s1.push(x);
    }

    //Function to pop an element from queue by using 2 stacks.
    int Pop()
    {
        int a = 0;
        if(s1.isEmpty())
            return -1;
        else
        {
            while (!s1.isEmpty())
                s2.push(s1.pop());
            a = s2.pop();
            while (!s2.isEmpty())
                s1.push(s2.pop());
        }
        return a;
    }
}
