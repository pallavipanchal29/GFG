package linkedlist.easy.DLL;

public class DLLNode
{
    public int data;
    public DLLNode next;
    public DLLNode prev;

    public DLLNode(int data)
    {
        this.data = data;
        next = null;
        prev = null;
    }
    public DLLNode(int data,DLLNode next)
    {
        this.data = data;
        this.next = next;
        prev = null;
    }
}