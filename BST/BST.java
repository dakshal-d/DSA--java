import java.util.*;

class Node {
    int data;
    Node left, right;

    public Node(int value) {
        data = value;
        left = right = null;
    }
}

class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(int value) {
        root = insertRec(root, value);
    }

    private Node insertRec(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }

        if (value < root.data)
            root.left = insertRec(root.left, value);
        else if (value > root.data)
            root.right = insertRec(root.right, value);

        return root;
    }

    public void deleteKey(int value) {
        root = deleteRec(root, value);
    }

    private Node deleteRec(Node root, int value) {
        if (root == null)
            return root;

        if (value < root.data)
            root.left = deleteRec(root.left, value);
        else if (value > root.data)
            root.right = deleteRec(root.right, value);
        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            root.data = minValue(root.right);

            root.right = deleteRec(root.right, root.data);
        }

        return root;
    }

    private int minValue(Node root) {
        int minValue = root.data;
        while (root.left != null) {
            minValue = root.left.data;
            root = root.left;
        }
        return minValue;
    }

    public void inOrderTraversal() {
        inOrderTraversalRec(root);
        System.out.println();
    }

    private void inOrderTraversalRec(Node root) {
        if (root != null) {
            inOrderTraversalRec(root.left);
            System.out.print(root.data + " ");
            inOrderTraversalRec(root.right);
        }
    }
}

public class BST {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numNodes = scanner.nextInt();
        BinarySearchTree bst = new BinarySearchTree();

        for (int i = 0; i < numNodes; i++) {
            int value = scanner.nextInt();
            bst.insert(value);
        }

        int keyToDelete = scanner.nextInt();

        System.out.println("Before deletion of key value: ");
        bst.inOrderTraversal();
       bst.deleteKey(keyToDelete);

        System.out.println("After deleting key value: ");
        bst.inOrderTraversal();
    }
}