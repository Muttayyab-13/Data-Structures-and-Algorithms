
package binarytree;


class BinaryTreeD <T>
{
    class Node
    {
        T data;
        Node left;
        Node right;
    }
    
    Node root;
    
    public void insertRoot(T value)
    {
        if(root == null)
        {
            Node n = new Node();
            n.data = value;
            root = n;
        }
        else
            System.out.println("Root already Present");
    }
    
    public void insertLeft(T value, T key)
    {
        Node t = search(root, key);
        if(t == null)
            System.out.println("Parent not Found");
        else if(t.left != null)
        System.out.println("Node Already Present");
        else
        {
           Node n = new Node();
           n.data = value;
           t.left = n;
        }
    }
    
    public void insertRight(T value, T key)
    {
        Node t = search(root, key);
        if(t == null)
            System.out.println("Parent not Found");
        else if(t.right != null)
        System.out.println("Node Already Present");
        else
        {
           Node n = new Node();
           n.data = value;
           t.right = n;
        }
    }
    
    public Node search(Node n, T key)
    {
        if(n == null)
            return null;
        else
        {
            if(n.data == key)
                return n;
            Node t = search(n.left, key);
            if(t == null)
                t = search(n.right, key);
            return t;
        }
    }
    
    
    
    
    public void preOrder(Node n)
    {
        if(n == null)
            return;
        else
        {
            System.out.print(n.data + " ");
            preOrder(n.left);
            preOrder(n.right);
        }
    }
    
    public void inOrder(Node n)
    {
        if(n == null)
            return;
        else
        {            
            inOrder(n.left);
            System.out.print(n.data + " ");
            inOrder(n.right);
        }
    }
    
    public void postOrder(Node n)
    {
        if(n == null)
            return;
        else
        {            
            postOrder(n.left);
            postOrder(n.right);
            System.out.print(n.data + " ");            
        }
    }
}

public class BinaryTree
{

    public static void main(String[] args) 
    {
        BinaryTreeD<Character> bt = new BinaryTreeD<>();
        bt.insertRoot('A');         //Level 0
        bt.insertLeft('B','A');     //Level 1
        bt.insertRight('C','A');    //Level 1
        bt.insertLeft('D','B');     //Level 2
        bt.insertLeft('E','C');     //Level 2
        bt.insertRight('F','C');    //Level 2
        bt.insertLeft('G','D');     //Level 3
        bt.insertRight('H','D');    //Level 3
        bt.insertLeft('I','E');     //Level 3
        
        bt.preOrder(bt.root);
    }
    
}
