package linkedlist.basic.DLL;

//Completed GFG - correct
public class DeleteNodeDLL
{
    static DLLNode head = null;
    public static void main(String[] args)
    {
        head = new DLLNode(1);
        head.next = new DLLNode(5);
        head.next.next = new DLLNode(2);
        head.next.next.next = new DLLNode(9);

        head = deleteNode(head,1);

        while (head != null)
        {
            System.out.print(head.data+" ");
            head = head.next;
        }

    }
    static DLLNode deleteNode(DLLNode head,int pos)
    {
        if(pos == 1)
            head = head.next;

        DLLNode temp = head;
        DLLNode prev = head;

        int i = 1;

        while (temp != null && i < pos)
        {
            prev = temp;
            temp = temp.next;
            i++;
        }

        DLLNode next = temp.next;
        prev.next = next;
        if(next != null)
            next.prev = prev;

        return head;
    }
}
