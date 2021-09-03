package linkedlist.easy.DLL;

//Completed GFG - correct
public class RotateDLL
{
    static DLLNode head = null;
    public static void main(String[] args)
    {
        head = new DLLNode(1);
        head.next = new DLLNode(2);
        head.next.next = new DLLNode(3);
        head.next.next.next = new DLLNode(4);
        head.next.next.next.next = new DLLNode(5);
        head.next.next.next.next.next = new DLLNode(6);

        head = rotateP(head,2);

        while (head != null)
        {
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
    static DLLNode rotateP (DLLNode head, int p)
    {
        DLLNode end = head;
        while (end.next != null)
        {
            end = end.next;
        }
        for(int i = 0;i<p;i++)
        {
            //make next of next node head
            DLLNode curr = head.next;
            //point end pointer to head pointer
            end.next = head;
            //make head. prev pointer to end
            head.prev = end;
            head.next = null;
            //point end pointer to newly appended  head
            end = head;
            //make curr pointer as head
            head = curr;
        }
        return head;
    }
}
