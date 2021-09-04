package linkedlist.easy.LL;

import linkedlist.easy.Node;

public class DeleteMiddleOfLL
{
    public static void main(String[] args)
    {
        int[] keys = {1, 2, 2, 2, 3, 4, 4, 5};
        Node head = null;

        for (int i = keys.length - 1; i >= 0; i--) {
            head = new Node(keys[i], head);
        }

        head = removeDuplicates(head);

        printList(head);
    }
    static Node removeDuplicates(Node head)
    {
        return null;

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
