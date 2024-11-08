package labtasktree;

class AVLTree {
    Node root;

    class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }

    public int height(Node n) {
        if (n == null) {
            return -1;
        }
        return Math.max(height(n.left), height(n.right)) + 1;
    }

    public int balanceFactor(Node n) {
        if (n == null) {
            return 0;
        }
        return height(n.left) - height(n.right);
    }

    public Node balance(Node n) {
        if (balanceFactor(n) > 1) {
            if (balanceFactor(n.left) >= 0) {
                n = rotateRight(n);
            } else {
                n.left = rotateLeft(n.left);
                n = rotateRight(n);
            }
        } else if (balanceFactor(n) < -1) {
            if (balanceFactor(n.right) <= 0) {
                n = rotateLeft(n);
            } else {
                n.right = rotateRight(n.right);
                n = rotateLeft(n);
            }
        }
        return n;
    }

    public Node rotateRight(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        x.right = y;
        y.left = T2;

        return x;
    }

    public Node rotateLeft(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        y.left = x;
        x.right = T2;

        return y;
    }

    public Node insert(Node node, int key) {
        if (node == null) {
            return new Node(key);
        }

        if (key < node.data) {
            node.left = insert(node.left, key);
        } else if (key > node.data) {
            node.right = insert(node.right, key);
        } else {
            return node; // Duplicate keys are not allowed
        }

        return balance(node);
    }

    public void insert(int key) {
        root = insert(root, key);
    }

    public Node delete(Node root, int key) {
        if (root == null) {
            return root;
        }

        if (key < root.data) {
            root.left = delete(root.left, key);
        } else if (key > root.data) {
            root.right = delete(root.right, key);
        } else {
            if ((root.left == null) || (root.right == null)) {
                Node temp = null;
                if (temp == root.left) {
                    temp = root.right;
                } else {
                    temp = root.left;
                }

                if (temp == null) {
                    temp = root;
                    root = null;
                } else {
                    root = temp;
                }
            } else {
                Node temp = minValueNode(root.right);
                root.data = temp.data;
                root.right = delete(root.right, temp.data);
            }
        }

        if (root == null) {
            return root;
        }

        return balance(root);
    }

    public void delete(int key) {
        root = delete(root, key);
    }

    public Node minValueNode(Node node) {
        Node current = node;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    public void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public void preOrder() {
        preOrder(root);
    }
}