package linkedlist.easy.LL;

import linkedlist.easy.Node;

//Completed GFG - correct
public class InsertInSortedList
{
    public static void main(String[] args)
    {
        int[] keys = {25,36,47,58,69,80};
        Node head = null;

        for (int i = keys.length - 1; i >= 0; i--) {
            head = new Node(keys[i], head);
        }

        head = sortedInsert(head,69);
        printList(head);

    }
    static Node sortedInsert(Node head1, int key)
    {
        Node node = new Node(key);
        if(head1 == null) {
            head1 = node;
            return head1;
        }

        Node curr = head1;
        if(curr.data >= key)
        {
            node.next = curr;
            head1 = node;
            return head1;
        }

        Node prev = curr;
        while (curr != null && curr.data < key)
        {
            prev = curr;
            curr = curr.next;
        }

        node.next = prev.next;
        prev.next = node;

        return head1;
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
