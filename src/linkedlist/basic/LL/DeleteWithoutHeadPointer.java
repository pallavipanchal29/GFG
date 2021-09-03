package linkedlist.basic.LL;

//completed GFG - correct
public class DeleteWithoutHeadPointer
{
    static Node head = null;
    public static void main(String[] args)
    {
        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(4);
        head.next.next.next = new Node(30);
        //head.next.next.next.next = new Node(5);

        //deleteNode(20);

        printList(head);
    }

    private static void printList(Node head)
    {
        while (head != null)
        {
            System.out.print(head.data+" ");
            head = head.next;
        }
    }

    static void deleteNode(Node del)
    {
        if(del.next == null)
            return;
        else
        {
            del.data = del.next.data;
            del.next = del.next.next;
        }
    }
}
