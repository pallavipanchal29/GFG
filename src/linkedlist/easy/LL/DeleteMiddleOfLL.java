package linkedlist.easy.LL;

import linkedlist.easy.Node;

//Completed GFG - correct
public class DeleteMiddleOfLL
{
    public static void main(String[] args)
    {
        int[] keys = {2, 4, 6, 7, 5,1};
        Node head = null;

        for (int i = keys.length - 1; i >= 0; i--) {
            head = new Node(keys[i], head);
        }

        head = deleteMid(head);

        printList(head);
    }

    static Node deleteMid(Node head)
    {
        if(head == null)
            return null;
        int count = 0;
        Node temp = head;
        while (temp != null)
        {
            count++;
            temp = temp.next;
        }

        Node slow = head;
        Node fast = head;
        Node prev = head;
        while (slow != null && fast.next != null && fast.next.next != null)
        {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        Node del = null;
        if(count % 2 == 0)
        {
            prev = slow;
            del = slow.next;
        }
        else
            del = slow;

        prev.next = del.next;
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
