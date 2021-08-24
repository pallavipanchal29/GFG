package stack.basic;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//Completed GFG - correct
public class QueueReversal
{
    public static void main(String[] args)
    {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(4);
        queue.add(3);
        queue.add(1);
        queue.add(10);
        queue.add(2);
        queue.add(6);

        Queue<Integer> answer = rev(queue);

        while (!answer.isEmpty())
        {
            System.out.print(answer.poll()+" ");
        }

    }
    public static Queue<Integer> rev(Queue<Integer> q)
    {
        Stack<Integer> stack = new Stack<>();
        while (!q.isEmpty())
            stack.push(q.poll());
        while (!stack.isEmpty())
            q.add(stack.pop());
        return q;
    }
}
