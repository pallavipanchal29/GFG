package linkedlist.easy.LL;

import linkedlist.easy.Node;

//Completed GFG - correct
public class NthNodeFromEndLL
{
    public static void main(String[] args)
    {
        int[] keys = {1, 2, 3, 4, 5, 6, 7, 8,9};
        Node head = null;

        for (int i = keys.length - 1; i >= 0; i--) {
            head = new Node(keys[i], head);
        }

        System.out.println(getNthFromLast(head,2));
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
