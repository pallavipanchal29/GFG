package stack.easy;

import java.util.LinkedList;
import java.util.Queue;

//Completed GFG - correct
public class StackWithTwoQueues
{
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();

    //Function to push an element into stack using two queues.
    void push(int a)
    {
       q1.add(a);
    }

    //Function to pop an element from stack using two queues.
    int pop()
    {
        int elem = 0;
        if(q1.isEmpty())
            return -1;
        else
        {
            while (q1.size() != 1)
                q2.add(q1.poll());
            elem = q1.poll();
            while (!q2.isEmpty())
                q1.add(q2.poll());
        }
        return elem;
    }

}
