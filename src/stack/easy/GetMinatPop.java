package stack.easy;

import java.time.temporal.Temporal;
import java.util.Stack;

public class GetMinatPop
{
    static Stack<Integer> temp = new Stack<>();
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,2,3,4,5};
        Stack<Integer> stack = _push(arr,arr.length);
        _getMinAtPop(stack);
    }
    public static Stack<Integer> _push(int arr[],int n)
    {
        Stack<Integer> stack = new Stack<>();
        for(int i = n-1;i>=0;i--)
        {
            stack.push(arr[i]);
            if(temp.isEmpty())
            {
                temp.push(arr[i]);
            }
            else
            {
                if(arr[i] < temp.peek())
                {
                    temp.pop();
                    temp.push(arr[i]);
                }
            }
            min = Math.min(min,arr[i]);
        }
        return stack;
    }

    //Function to print minimum value in stack each time while popping.
    static void _getMinAtPop(Stack<Integer>s)
    {
        while (!s.isEmpty())
        {
            int top = s.peek();
            if(top == temp.peek())
            {
                System.out.print(temp.pop()+" ");
                s.pop();
            }
            else
            {
                s.pop();
                System.out.print(temp.peek()+" ");
            }
        }
    }
}
