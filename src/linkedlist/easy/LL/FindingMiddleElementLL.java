package linkedlist.easy.LL;

import linkedlist.easy.Node;

public class FindingMiddleElementLL
{
    public static void main(String[] args)
    {
        int[] keys = {1, 2, 3, 4, 5, 6};
        Node head = null;

        for (int i = keys.length - 1; i >= 0; i--) {
            head = new Node(keys[i], head);
        }

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
