/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binarysearchtree;

/**
 *
 * @author WALEED TRADERS
 */
public class BSTDemo
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        System.out.print("Pre-order traversal: ");
        tree.preOrder();
        System.out.println();

        System.out.println("Delete 20");
        tree.delete(20);
        System.out.print("Pre-order traversal: ");
        tree.preOrder();
        System.out.println();

        System.out.println("Delete 30");
        tree.delete(30);
        System.out.print("Pre-order traversal: ");
        tree.preOrder();
        System.out.println();

        System.out.println("Delete 50");
        tree.delete(50);
        System.out.print("Pre-order traversal: ");
        tree.preOrder();
        System.out.println();
    }
    
}
class BinarySearchTree {
    class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }

    Node root;

    BinarySearchTree() {
        root = null;
    }

    private Node insert(Node n, int value) {
        if (n == null) {
            return new Node(value);
        }

        if (value < n.data) {
            n.left = insert(n.left, value);
        } else {
            n.right = insert(n.right, value);
        }

        return n;
    }

    public void insert(int value) {
        root = insert(root, value);
    }

    private Node delete(Node n, int value) {
        if (n == null) {
            return n;
        }

        if (value < n.data) {
            n.left = delete(n.left, value);
        } else if (value > n.data) {
            n.right = delete(n.right, value);
        } else {
            if (n.left == null) {
                return n.right;
            } else if (n.right == null) {
                return n.left;
            }

            n.data = findSuccessor(n.right);
            n.right = delete(n.right, n.data);
        }

        return n;
    }

    public void delete(int value) {
        root = delete(root, value);
    }

    public int findSuccessor(Node n) {
        int minValue = n.data;
        while (n.left != null) {
            minValue = n.left.data;
            n = n.left;
        }
        return minValue;
    }

    private void preOrder(Node n) {
        if (n == null) {
            return;
        }
        System.out.print(n.data + " ");
        preOrder(n.left);
        preOrder(n.right);
    }

    public void preOrder() {
        preOrder(root);
    }

     
}

