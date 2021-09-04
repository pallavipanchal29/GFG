package linkedlist.easy.LL;

import linkedlist.easy.Node;

import java.util.LinkedHashMap;
import java.util.Map;

//Completed GFG - correct
public class IntersectionOfTwoLL
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

        Node head3 = findIntersection(head1,head2);

        printList(head3);
    }
    public static Node findIntersection(Node head1, Node head2)
    {
        Node head = null;
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        while (head1 != null)
        {
            map.put(head1.data,map.getOrDefault(head1.data,0)+1);
            head1 = head1.next;
        }
        while (head2 != null)
        {
            map.put(head2.data,map.getOrDefault(head2.data,0)+1);
            head2 = head2.next;
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            if(entry.getValue() > 1)
            {
                head = insertNodeAtEnd(entry.getKey(),head);
            }
        }
        return head;
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
