package linkedlist;

import linkedlist.basic.Node;

//Completed GFG - correct
public class InsertInMiddleLL
{
    static Node head = null;
    public static void main(String[] args)
    {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(4);
        //head.next.next.next = new Node(50);

       head = insertInMid(head,3);

       while (head != null)
       {
           System.out.print(head.data+" ");
           head = head.next;
       }

    }
    public static Node insertInMid(Node head, int data)
    {
        Node slow = head;
        Node fast = head;

        while (slow != null && fast.next != null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node node = new Node(data);
        Node next = slow.next;
        slow.next = node;
        node.next = next;

        return head;
    }
}
