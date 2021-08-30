package linkedlist.easy;

public class DeleteMiddleOfLL {
    static Node head = null;

    public static void main(String[] args)
    {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println(deleteMid(head));
    }
    static Node deleteMid(Node head)
    {
        return null;

    }
}
