package linkedlist.easy.LL;

import linkedlist.easy.Node;

import java.util.LinkedHashSet;

//Completed GFG - correct
public class RemoveDuplicatesFromUnsortedLL
{
    public static void main(String[] args)
    {
        int[] keys = {2,2,2,4};
        Node head = null;

        for (int i = keys.length - 1; i >= 0; i--) {
            head = new Node(keys[i], head);
        }

        head = removeDuplicates(head);

        printList(head);
    }
    public static Node removeDuplicates(Node head)
    {
        Node curr = head;
        Node prev = null;

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        while(curr != null)
        {
            if(set.contains(curr.data))
            {
                prev.next = curr.next;
                curr = curr.next;
            }

            else
                {
               set.add(curr.data);
                prev = curr;
                curr = curr.next;
            }
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
