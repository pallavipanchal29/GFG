package linkedlist.basic;

public class DeleteAlternateNodes
{
    static Node head = null;
    public static void main(String[] args)
    {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        head = deleteAlternate(head);

        while (head != null)
        {
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
    public static Node deleteAlternate (Node head)
    {
        if(head == null)
            return null;
        if(head.next == null)
            return head;
        Node next = null;
        while (head != null && head.next != null)
        {
            next = head.next;
            head.next = next.next;
        }
        return head;
    }
}
