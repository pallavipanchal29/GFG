package linkedlist.basic.LL;

//Completed GFG - correct
public class LLStringsPalindrome
{
    static StringNode head;
    public static void main(String[] args)
    {
        head = new StringNode("b");
        head.next = new StringNode("eeee");
        head.next.next = new StringNode("b");
        head.next.next.next = new StringNode("b");
//        head.next.next.next.next = new StringNode("d");
//        head.next.next.next.next.next = new StringNode("c");
//        head.next.next.next.next.next.next = new StringNode("b");
//        head.next.next.next.next.next.next.next = new StringNode("a");

        System.out.println(compute(head));
    }
    public static boolean compute(StringNode node)
    {
        StringBuilder sb = new StringBuilder();
        while (node != null)
        {
            sb.append(node.data);
            node = node.next;
        }
        String str = sb.toString();
        int i = 0;
        int j = str.length()-1;
        while (i < j)
        {
            if(str.charAt(i) != str.charAt(j))
                return false;
            else
            {
                i++;
                j--;
            }
        }
        return true;
    }
}
