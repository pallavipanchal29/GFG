package linkedlist.easy.LL;

import linkedlist.easy.Node;

//Completed GFG - correct
public class NthNodeFromEndLL
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
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);
        head.next.next.next.next.next.next.next.next = new Node(9);

        System.out.println(getNthFromLast(head,4));
    }
    static int getNthFromLast(Node head, int n)
    {
        Node temp = head;
        int count = 0;

        while (temp != null)
        {
            temp = temp.next;
            count++;
        }
        if(n > count)
            return -1;

        Node slow = head;
        Node fast = head;

        for(int i = 0;i<n;i++)
        {
            fast = fast.next;
        }
        while (slow != null && fast != null)
        {
            slow = slow.next;
            fast = fast.next;
        }
        return slow.data;
    }
}
