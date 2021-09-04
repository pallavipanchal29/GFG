package linkedlist.easy.LL;

public class StringNode
{
    public char data;
    public StringNode next;

    public StringNode(char data)
    {
        this.data = data;
        next = null;
    }
    public StringNode(char data,StringNode next)
    {
        this.data = data;
        this.next = next;
    }
}
