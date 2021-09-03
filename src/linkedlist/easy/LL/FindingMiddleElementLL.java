package linkedlist.easy.LL;

import linkedlist.easy.Node;

public class FindingMiddleElementLL
{
    static Node head = null;

    public static void main(String[] args)
    {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        System.out.println(getMiddle(head));
    }
    static int getMiddle(Node head)
    {
        int count = 0;
        if(head == null)
            return -1;

        Node temp = head;
        while (temp != null)
        {
            count++;
            temp = temp.next;
        }

        Node slow = head;
        Node fast = slow;

        while (slow != null && fast.next != null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        if(count % 2 == 0)
            return slow.next.data;
        else
            return slow.data;
    }
}
