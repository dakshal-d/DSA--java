import java.util.Scanner;

class Node {
    int key;
    Node left;
    Node right;
    int height;

    Node(int key) {
        this.key = key;
        this.left = null;
        this.right = null;
        this.height = 1;
    }
}

public class avl {
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static int height(Node N) {
        if (N == null)
            return 0;
        return N.height;
    }

    public static Node newNode(int key) {
        Node node = new Node(key);
        node.left = null;
        node.right = null;
        node.height = 1;
        return node;
    }

    public static Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;
        x.right = y;
        y.left = T2;
        y.height = max(height(y.left), height(y.right)) + 1;
        x.height = max(height(x.left), height(x.right)) + 1;
        return x;
    }

    public static Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;
        y.left = x;
        x.right = T2;
        x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;
        return y;
    }

    public static int getBalance(Node N) {
        if (N == null)
            return 0;
        return height(N.left) - height(N.right);
    }

    public static Node insert(Node node, int key) {
        if (node == null)
            return newNode(key);

        if (key < node.key)
            node.left = insert(node.left, key);
        else if (key > node.key)
            node.right = insert(node.right, key);
        else
            return node;

        node.height = 1 + max(height(node.left), height(node.right));
        int balance = getBalance(node);

        if (balance > 1 && key < node.left.key)
            return rightRotate(node);

        if (balance < -1 && key > node.right.key)
            return leftRotate(node);

        if (balance > 1 && key > node.left.key) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        if (balance < -1 && key < node.right.key) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    public static Node minValueNode(Node node) {
        Node current = node;
        while (current.left != null)
            current = current.left;
        return current;
    }

    public static Node deleteNode(Node root, int key) {
        if (root == null)
            return root;

        if (key < root.key)
            root.left = deleteNode(root.left, key);
        else if (key > root.key)
            root.right = deleteNode(root.right, key);
        else {
            if ((root.left == null) || (root.right == null)) {
                Node temp = root.left != null ? root.left : root.right;
                if (temp == null) {
                    temp = root;
                    root = null;
                } else
                    root = temp;
            } else {
                Node temp = minValueNode(root.right);
                root.key = temp.key;
                root.right = deleteNode(root.right, temp.key);
            }
        }

        if (root == null)
            return root;

        root.height = 1 + max(height(root.left), height(root.right));
        int balance = getBalance(root);

        if (balance > 1 && getBalance(root.left) >= 0)
            return rightRotate(root);

        if (balance > 1 && getBalance(root.left) < 0) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        if (balance < -1 && getBalance(root.right) <= 0)
            return leftRotate(root);

        if (balance < -1 && getBalance(root.right) > 0) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;
    }

    public static void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.key + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public static void main(String[] args) {
        Node root = null;

        Scanner scanner = new Scanner(System.in);

        //System.out.print("Enter the number of nodes: ");
        int n = scanner.nextInt();

        //System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            int element = scanner.nextInt();
            root = insert(root, element);
        }

       // System.out.print("Enter the element to delete: ");
        int del = scanner.nextInt();

        System.out.println("Preorder of AVL tree");
        preOrder(root);

        root = deleteNode(root, del);

        System.out.println("\nPreorder after deletion of the element");
        preOrder(root);

        scanner.close();
    }
}


// import java.util.Scanner;

// enum NodeColor {
//     RED,
//     BLACK
// }

// class RBNode {
//     int data;
//     NodeColor color;
//     RBNode[] link;

//     RBNode(int data) {
//         this.data = data;
//         this.color = NodeColor.RED;
//         this.link = new RBNode[2];
//     }
// }

// public class Main {
//     private static RBNode root;

//     private static RBNode createNode(int data) {
//         RBNode newNode = new RBNode(data);
//         newNode.color = NodeColor.RED;
//         newNode.link[0] = null;
//         newNode.link[1] = null;
//         return newNode;
//     }

//     private static void insertion(int data) {
//         RBNode[] stack = new RBNode[98];
//         int[] dir = new int[98];
//         int ht = 0, index =0;
//         RBNode ptr = root;

//         if (root == null) {
//             root = createNode(data);
//             return;
//         }

//         stack[ht] = root;
//         dir[ht++] = 0;

//         while (ptr != null) {
//             if (ptr.data == data) {
//                 System.out.println("Duplicates element " + data + " Not Allowed");
//                 return;
//             }

//             index = (data - ptr.data) > 0 ? 1 : 0;
//             stack[ht] = ptr;
//             ptr = ptr.link[index];
//             dir[ht++] = index;
//         }

//         stack[ht - 1].link[index] = createNode(data);

//         while (ht >= 3 && stack[ht - 1].color == NodeColor.RED) {
//             if (dir[ht - 2] == 0) {
//                 RBNode yPtr = stack[ht - 2].link[1];
//                 if (yPtr != null && yPtr.color == NodeColor.RED) {
//                     stack[ht - 2].color = NodeColor.RED;
//                     stack[ht - 1].color = yPtr.color = NodeColor.BLACK;
//                     ht -= 2;
//                 } else {
//                     if (dir[ht - 1] == 0) {
//                         yPtr = stack[ht - 1];
//                     } else {
//                         RBNode xPtr = stack[ht - 1];
//                         yPtr = xPtr.link[1];
//                         xPtr.link[1] = yPtr.link[0];
//                         yPtr.link[0] = xPtr;
//                         stack[ht - 2].link[0] = yPtr;
//                     }
//                     RBNode xPtr = stack[ht - 2];
//                     xPtr.color = NodeColor.RED;
//                     yPtr.color = NodeColor.BLACK;
//                     xPtr.link[0] = yPtr.link[1];
//                     yPtr.link[1] = xPtr;

//                     if (xPtr == root) {
//                         root = yPtr;
//                     } else {
//                         stack[ht - 3].link[dir[ht - 3]] = yPtr;
//                     }
//                     break;
//                 }
//             } else {
//                 RBNode yPtr = stack[ht - 2].link[0];
//                 if (yPtr != null && yPtr.color == NodeColor.RED) {
//                     stack[ht - 2].color = NodeColor.RED;
//                     stack[ht - 1].color = yPtr.color = NodeColor.BLACK;
//                     ht -= 2;
//                 } else {
//                     if (dir[ht - 1] == 1) {
//                         yPtr = stack[ht - 1];
//                     } else {
//                         RBNode xPtr = stack[ht - 1];
//                         yPtr = xPtr.link[0];
//                         xPtr.link[0] = yPtr.link[1];
//                         yPtr.link[1] = xPtr;
//                         stack[ht - 2].link[1] = yPtr;
//                     }
//                     RBNode xPtr = stack[ht - 2];
//                     xPtr.color = NodeColor.RED;
//                     yPtr.color = NodeColor.BLACK;
//                     xPtr.link[1] = yPtr.link[0];
//                     yPtr.link[0] = xPtr;

//                     if (xPtr == root) {
//                         root = yPtr;
//                     } else {
//                         stack[ht - 3].link[dir[ht - 3]] = yPtr;
//                     }
//                     break;
//                 }
//             }
//         }

//         root.color = NodeColor.BLACK;
//     }

//     private static RBNode minValueNode(RBNode node) {
//         RBNode current = node;
//         while (current.link[0] != null) {
//             current = current.link[0];
//         }
//         return current;
//     }

//     private static RBNode deleteNode(RBNode root, int data) {
//         if (root == null) {
//             return null;
//         }

//         if (data < root.data) {
//             root.link[0] = deleteNode(root.link[0], data);
//         } else if (data > root.data) {
//             root.link[1] = deleteNode(root.link[1], data);
//         } else {
//             if (root.link[0] == null || root.link[1] == null) {
//                 RBNode temp = root.link[0] != null ? root.link[0] : root.link[1];
//                 if (temp == null) {
//                     return null;
//                 } else {
//                     return temp;
//                 }
//             } else {
//                 RBNode temp = minValueNode(root.link[1]);
//                 root.data = temp.data;
//                 root.link[1] = deleteNode(root.link[1], temp.data);
//             }
//         }
//         return root;
//     }

//     private static void inorderTraversal(RBNode node) {
//         if (node != null) {
//             inorderTraversal(node.link[0]);
//             System.out.print(node.data + " ");
//             inorderTraversal(node.link[1]);
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int choice, data;
//         while (true) {
        
//             choice = sc.nextInt();
//             switch (choice) {
//                 case 1:
//                 //System.out.print("Enter the element to insert: ");
//                     data = sc.nextInt();
//                     insertion(data);
//                     break;
//                 case 2:
//                    // System.out.print("Enter the element to delete: ");
//                     data = sc.nextInt();
//                     root = deleteNode(root, data);
//                     break;
//                 case 3:
//                     System.out.print("Inorder Traversal: ");
//                     inorderTraversal(root);
//                     System.out.println();
//                     break;
//                 case 4:
//                     sc.close();
//                     return;
//                 default:
//                     System.out.println("Invalid choice");
//             }
//         }
//     }
// }
