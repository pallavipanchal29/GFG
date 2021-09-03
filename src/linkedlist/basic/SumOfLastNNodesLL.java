package linkedlist.basic;

//Completed GFG - correct
public class SumOfLastNNodesLL
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

        System.out.println(sum(head,3));

    }
    public static int sum(Node head, int k)
    {
        int sum = 0;
        int count = 0;

        Node temp = head;
        while (temp != null)
        {
            count++;
            temp = temp.next;
        }
        temp = head;
        for(int i = 0;i<count-k;i++)
        {
            temp = temp.next;
        }
        while (temp != null)
        {
            sum = sum + temp.data;
            temp = temp.next;
        }
        return sum;
    }
}
