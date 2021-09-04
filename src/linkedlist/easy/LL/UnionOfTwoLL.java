package linkedlist.easy.LL;

import linkedlist.easy.Node;

import java.util.Iterator;
import java.util.TreeSet;

//Completed GFG - correct
public class UnionOfTwoLL
{
    public static void main(String[] args)
    {
        int[] keys1 = {9,6,4,2,3,8};
        int[] keys2 = {1,2,8,6,2};

        Node head1 = null;
        Node head2 = null;

        for (int i = keys1.length - 1; i >= 0; i--) {
            head1 = new Node(keys1[i], head1);
        }
        for (int i = keys2.length - 1; i >= 0; i--) {
            head2 = new Node(keys2[i], head2);
        }

        Node head3 = findUnion(head1,head2);

        printList(head3);
    }

    public static Node findUnion(Node head1,Node head2)
    {
        Node head3 = null;
        if(head1 == null && head2 == null)
            return null;
        if(head1 == null && head2 != null)
            head3 = head2;
        if(head1 != null && head2 == null)
            head3 = head1;

        TreeSet<Integer> set = new TreeSet<>();
        while (head1 != null)
        {
            set.add(head1.data);
            head1 = head1.next;
        }
        while (head2 != null)
        {
            set.add(head2.data);
            head2 = head2.next;
        }
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext())
        {
            head3 = insertNodeAtEnd(iterator.next(),head3);
        }
        return head3;
    }

    private static Node insertNodeAtEnd(int data,Node head3)
    {
        Node node = new Node(data);
        if(head3 == null)
            head3 = node;
        else
        {
            Node temp = head3;
            while (temp.next != null)
                temp = temp.next;
            temp.next = node;
        }
        return head3;
    }

    public static void printList(Node head)
    {
        Node ptr = head;
        while (ptr != null)
        {
            System.out.print(ptr.data + " —> ");
            ptr = ptr.next;
        }

        System.out.println("null");
    }
}
