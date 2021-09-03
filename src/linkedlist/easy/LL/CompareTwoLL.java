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
        head1 = new StringNode("a");
        head1.next = new StringNode("a");
        head1.next.next = new StringNode("a");
        head1.next.next.next = new StringNode("b");
        head1.next.next.next.next = new StringNode("a");

        head2 = new StringNode("a");
        head2.next = new StringNode("a");
        head2.next.next = new StringNode("a");
        head2.next.next.next = new StringNode("b");
        head2.next.next.next.next = new StringNode("a");

        System.out.println(compare(head1,head2));
    }
    static int compare(StringNode node1, StringNode node2)
    {
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();

        if(node1 == null && node2 == null)
            return 1;
        if(node1 == null || node2 == null)
            return 0;

        while (node1 != null)
        {
            str1.append(node1.data);
            node1 = node1.next;
        }
        while (node2 != null)
        {
            str2.append(node2.data);
            node2 = node2.next;
        }

        return str1.toString().compareTo(str2.toString());
    }
}
