package linkedlist.basic.LL;

public class FindNByKNodeLL
{
    static Node head = null;
    public static void main(String[] args)
    {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        System.out.println(nknode(head,6));
    }
    public static int nknode(Node head, int k)
    {
        return 0;
    }
}
