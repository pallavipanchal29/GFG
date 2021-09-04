package linkedlist.easy.CLL;

import linkedlist.easy.Node;

//Completed GFG - correct
public class SortedInsertForCLL
{
    static Node head = null;
    public static void main(String[] args)
    {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(4);
        head.next.next.next = head;

        sortedInsert(head,3);
        printList(head);
    }
    public static Node sortedInsert(Node head, int data)
    {
        Node current = head;
        Node new_node = new Node(data);

        //if LL is empty
        if (current == null)
        {
            new_node.next = new_node;
            head = new_node;

        }
        else if (current.data >= new_node.data)
        {
            /* If value is smaller than head's value then
             we need to change next of last node */
            while (current.next != head)
                current = current.next;

            current.next = new_node;
            new_node.next = head;
            head = new_node;
        }
        else
        {
            /* Locate the node before the point of insertion */
            while (current.next != head && current.next.data < new_node.data)
                current = current.next;

            new_node.next = current.next;
            current.next = new_node;
        }
        return head;
    }
    public static void printList(Node head)
    {
        if (head != null)
        {
            Node temp = head;
            do
            {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }  while (temp != head);
        }

        System.out.println("null");
    }
}
