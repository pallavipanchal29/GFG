package linkedlist.easy.LL;

import linkedlist.easy.Node;

//Completed GFG - correct
public class DetectLoopInLL
{
    static Node head = null;

    public static void main(String[] args)
    {
        head = new Node(1);
        head.next = new Node(8);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head;

        System.out.println(detectLoop(head));
    }
    //Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head)
    {
        Node slow = head;
        Node fast = head;

        while (slow != null && fast.next != null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
                return true;
        }
        return false;
    }
}
