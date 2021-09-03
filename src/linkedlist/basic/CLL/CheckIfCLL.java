package linkedlist.basic.CLL;

import linkedlist.basic.LL.Node;

//Completed GFG - correct
public class CheckIfCLL
{
    static Node head = null;
    public static void main(String[] args)
    {
        head = new Node(5);
        head.next = new Node(9);
        head.next.next = new Node(6);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.next = head;

        System.out.println(isCircular(head));

    }
    static boolean isCircular(Node head)
    {
        Node temp = head;

        while (temp != null)
        {
            if(temp.next == head)
                return true;
            temp = temp.next;
        }
        return false;
    }
}
