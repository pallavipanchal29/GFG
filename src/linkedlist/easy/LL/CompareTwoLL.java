package linkedlist.easy.LL;

//Completed GFG - correct
public class CompareTwoLL
{
    //a b a b a
    //a b a a
    public static void main(String[] args)
    {
        Character[] keys1 = {'a','b','a','b','a'};
        Character[] keys2 = {'a','b','a','a'};
        StringNode head1 = null;
        StringNode head2 = null;

        for (int i = keys1.length - 1; i >= 0; i--) {
            head1 = new StringNode(keys1[i], head1);
        }
        for (int i = keys2.length - 1; i >= 0; i--) {
            head2 = new StringNode(keys2[i], head2);
        }

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
