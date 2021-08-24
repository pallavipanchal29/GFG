package linkedlist.basic;

//Completed GFG - correct
public class LLLengthEvenOdd
{
    static Node head = null;
    public static void main(String[] args)
    {
        head = new Node(9);
        head.next = new Node(4);
        head.next.next = new Node(3);
//        head.next.next.next = new Node(4);
//        head.next.next.next.next = new Node(5);

        System.out.println(isLengthEvenorOdd(head));
    }
    static int isLengthEvenorOdd(Node head1)
    {
        int len = 0;
        while (head1 != null)
        {
            head1 = head1.next;
            len++;
        }
        return (len &1) == 1 ? 1 : 0;
    }
}
