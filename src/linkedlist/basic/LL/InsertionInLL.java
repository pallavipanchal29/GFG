package linkedlist.basic.LL;

//Completed GFG - correct
public class InsertionInLL
{
    static Node head = null;
    public static void main(String[] args)
    {
        head = new Node(5);
        head.next = new Node(9);
        head.next.next = new Node(6);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.next = new Node(10);

        while (head != null)
        {
            System.out.print(head.data+" ");
            head = head.next;
        }

    }
    Node insertAtBeginning(Node head, int x)
    {
        Node node = new Node(x);
        if(head == null)
            head = node;
        else
            {
            node.next = head;
            head = node;
        }
        return head;
    }

    //Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x)
    {
        Node node = new Node(x);
        if(head == null)
            head = node;
        else
        {
            Node temp = head;
            while (temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = node;
        }
        return head;
    }
}
