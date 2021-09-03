package linkedlist.basic.LL;

//Completed GFG - correct
public class NodeAtGivenIndexLL
{
    static Node head = null;
    public static void main(String[] args)
    {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(657);
        head.next.next.next.next.next = new Node(76);

        System.out.println(getNth(head,5));

    }
    public static int getNth(Node node, int ind)
    {
        Node temp = node;
        int i = 0;

        while (temp != null && i < ind-1)
        {
            temp = temp.next;
            i++;
        }
        if(temp != null)
            return temp.data;
        return -1;
    }
}
