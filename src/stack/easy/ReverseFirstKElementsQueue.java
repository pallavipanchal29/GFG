package stack.easy;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//Completed GFG - correct
public class ReverseFirstKElementsQueue
{
    public static void main(String[] args)
    {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        Queue<Integer> answers = modifyQueue(queue,3);

        while (!answers.isEmpty())
            System.out.print(answers.poll()+" ");
    }
    public static Queue<Integer> modifyQueue(Queue<Integer> q, int k)
    {
        Queue<Integer> answer = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        while ( k > 0 && !q.isEmpty())
        {
            stack.push(q.poll());
            k--;
        }
        while (!stack.isEmpty())
        {
            answer.add(stack.pop());
        }
        while (!q.isEmpty())
        {
            answer.add(q.poll());
        }
        return answer;
    }
}
