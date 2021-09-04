package linkedlist.easy.LL;

import linkedlist.easy.Node;

public class DeleteNNodesAfterMNodes
{
    public static void main(String[] args)
    {
        int[] keys = {9,1,3,5,9,4,1,0,1};
        Node head = null;

        for (int i = keys.length - 1; i >= 0; i--) {
            head = new Node(keys[i], head);
        }

        head = linkdelete(head,2,1);
        printList(head);
    }
    static Node linkdelete(Node head, int M, int N)
    {
        Node curr = head, t;
        int count;

        // The main loop that traverses
        // through the whole list
        while (curr!=null)
        {
            // Skip M nodes
            for (count = 1; count < M && curr != null; count++)
                curr = curr.next;

            // If we reached end of list, then return
            if (curr == null)
                return head;

            // Start from next node and delete N nodes
            t = curr.next;
            for (count = 1; count <= N && t != null; count++)
            {
                Node temp = t;
                t = t.next;
            }

            // Link the previous list with remaining nodes
            curr.next = t;

            // Set current pointer for next iteration
            curr = t;
        }
        return head;

    }
    public static void printList(Node head)
    {
        Node ptr = head;
        while (ptr != null)
        {
            System.out.print(ptr.data + " —> ");
            ptr = ptr.next;
        }

        System.out.println("null");
    }
}
