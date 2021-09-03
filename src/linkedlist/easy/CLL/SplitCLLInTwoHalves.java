package linkedlist.easy.CLL;

import linkedlist.basic.LL.Node;

//GFG submission issue
public class SplitCLLInTwoHalves
{
    static Node head = null;
    static Node head1 = null;
    static Node head2 = null;

    public static void main(String[] args)
    {
        head = new Node(2);
        head.next = new Node(6);
        head.next.next = new Node(1);
        //head.next.next.next = new Node(5);

        splitList(head);

        while (head1 != null)
        {
            System.out.print(head1.data+" ");
            head1 = head1.next;
        }
        System.out.println();
        while (head2 != null)
        {
            System.out.print(head2.data+" ");
            head2 = head2.next;
        }

    }
    // Function  to split a circular LinkedList
    static void splitList(Node list)
    {
        Node slow = list;
        Node fast = list;
        head1 = slow;
        while (slow != null && fast.next != null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        head2 = slow.next;
        slow.next = null;
    }
}
