package stack.easy;

import java.util.Stack;

public class MaximumDifference
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{2, 1, 8};
        System.out.println(findMaxDiff(arr,arr.length));
    }
    static int findMaxDiff(int a[], int n)
    {
        int[] LS = new int[n];
        int[] RS = new int[n];
        int max = Integer.MIN_VALUE;

        Stack<Integer> stack = new Stack<>();
        for(int i = 0;i<n;i++)
        {
            if(stack.empty())
            {
                stack.push(a[i]);
                LS[i] = 0;
            }
            else
            {
                if(a[i] < stack.peek())
                    stack.push(a[i]);
            }
        }
        stack.clear();
        for(int i = n-1;i>=0;i--)
        {
            if(stack.isEmpty())
            {
                stack.push(0);
                RS[i] = a[i];
            }
            else
            {
                int elem = 0;
                if (stack.peek() < a[i])
                {
                    elem = stack.peek();
                    stack.push(stack.peek());
                }
                else {
                    elem = a[i];
                    stack.push(a[i]);
                }
                RS[i] = elem;
            }
        }
        for(int i = 0;i<n;i++)
        {
            max = Math.max(Math.abs(LS[i]-RS[i]),max);
        }
        return max;
    }
}
