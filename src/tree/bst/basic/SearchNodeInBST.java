package tree.bst.basic;

import tree.bst.Node;

import java.util.LinkedList;
import java.util.Queue;

//Completed GFG - correct
public class SearchNodeInBST
{
    static Node root = null;
    public static void main(String[] args)
    {
        int[] arr = new int[]{2,81,42,87,45,66,90};
        for(int i = 0;i<arr.length;i++)
        {
            root = insert(root,arr[i]);
        }
        System.out.print(searchIterative(root,87));
    }

    static boolean search(Node root, int x)
    {
        if(root==null)
            return false;
        if(root.data==x)
            return true;
        if(root.data > x)
            return search(root.left,x);
        if(root.data < x)
            return search(root.right,x);
        return false;
    }
    static boolean searchIterative(Node root, int x)
    {
        if(root==null)
            return false;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty())
        {
            Node temp = queue.peek();
            queue.poll();
            if(temp.data == x)
                return true;
            else
            {
                if(temp.left != null)
                    queue.add(temp.left);
                if(temp.right != null)
                    queue.add(temp.right);
            }
        }
        return false;
    }
    private static Node insert(Node root, int key)
    {
        root = insertRec(root,key);
        return root;
    }

    private static Node insertRec(Node root, int key)
    {
        Node node = new Node(key);
        if(root == null)
        {
            root = node;
            return root;
        }
        else if(key < root.data)
        {
            root.left = insertRec(root.left,key);
        }
        else if(key > root.data)
        {
            root.right = insertRec(root.right,key);
        }
        return root;
    }
}
