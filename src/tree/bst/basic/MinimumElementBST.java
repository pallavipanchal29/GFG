package tree.bst.basic;

import tree.bst.Node;

//Completed GFG - correct
public class MinimumElementBST
{
    static Node root = null;
    public static void main(String[] args)
    {
        int[] arr = new int[]{9,10,11};
        for(int i = 0;i<arr.length;i++)
        {
            root = insert(root,arr[i]);
        }
        System.out.print(minValue(root));
    }
    static int minValue(Node node)
    {
        if(node == null)
            return -1;
        else if(node.left == null)
            return node.data;
        else
        {
            while (node.left != null)
            {
                node = node.left;
            }
            return node.data;
        }
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
