package linkedlist.easy.LL;

//Completed GFG - correct
public class CompareTwoLL
{
    //a b a b a
    //a b a a
    static StringNode head1 = null;
    static StringNode head2 = null;

    public static void main(String[] args)
    {
        head1 = new StringNode('a');
        head1.next = new StringNode('a');
        head1.next.next = new StringNode('a');
        head1.next.next.next = new StringNode('b');
        head1.next.next.next.next = new StringNode('a');

        head2 = new StringNode('a');
        head2.next = new StringNode('a');
        head2.next.next = new StringNode('a');
        head2.next.next.next = new StringNode('b');
        head2.next.next.next.next = new StringNode('a');

        System.out.println(compare(head1,head2));
    }
    static int compare(StringNode node1, StringNode node2)
    {
        while (node1 != null && node2 != null)
        {
            if(node1.data > node2.data)
                return 1;
            else if(node1.data < node2.data)
                return -1;
            node1 = node1.next;
            node2 = node2.next;

        }
        if(node1 != null)
            return 1;
        if(node2 != null)
            return -1;
        return 0;
    }
}
