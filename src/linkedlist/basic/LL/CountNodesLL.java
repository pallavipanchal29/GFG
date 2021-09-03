package linkedlist.basic.LL;

public class CountNodesLL
{
    static Node head = null;
    public static void main(String[] args)
    {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println(getCount(head));
    }
    public static int getCount(Node head)
    {
        int count = 0;
        while (head != null)
        {
            head = head.next;
            count++;
        }
        return count;
    }
}
