package linkedlist.basic.LL;

//Completed GFG - correct
public class IdenticalLL
{
    static Node head1 = null;
    static Node head2 = null;
    public static void main(String[] args)
    {
        head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(5);
        //head1.next.next.next.next.next = new Node(6);

        head2 = new Node(1);
        head2.next = new Node(2);
        head2.next.next = new Node(3);
        head2.next.next.next = new Node(4);
        head2.next.next.next.next = new Node(5);

        System.out.println(isIdentical(head1,head2));
    }
    public static boolean isIdentical (Node head1, Node head2)
    {
        if(head1 == null && head2 == null)
            return true;
        if(head1 == null || head2 == null)
            return false;
        while (head1 != null && head2 != null)
        {
            if(head1.data != head2.data)
                return false;
            head1 = head1.next;
            head2 = head2.next;
        }
        if(head1 != null || head2 != null)
            return false;
        return true;
    }
}
