package linkedlist.basic;

//Completed GFG - correct
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

        deleteAlternate(head);

        while (head != null)
        {
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
    public static void deleteAlternate (Node head)
    {
        if(head == null || head.next == null)
            return;
        Node temp = head;
        while (temp != null && temp.next != null) {
            temp.next = temp.next.next;
            temp = temp.next;
        }
    }
}
