package linkedlist.easy.DLL;

import linkedlist.easy.Node;

//Completed GFG - correct
public class RotateDLL
{
    public static void main(String[] args)
    {
        int[] keys = {1, 2, 3, 4, 5, 6};
        DLLNode head = null;

        for (int i = keys.length - 1; i >= 0; i--) {
            head = new DLLNode(keys[i], head);
        }

        head = rotateP(head,2);
        printList(head);
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
    public static void printList(DLLNode head)
    {
        DLLNode ptr = head;
        while (ptr != null)
        {
            System.out.print(ptr.data + " —> ");
            ptr = ptr.next;
        }
        System.out.println("null");
    }
}
