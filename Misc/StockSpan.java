// package Misc;

import java.util.Arrays;

class StockSpan {
	static void calculateSpan(int price[], int n, int S[])
	{
		S[0] = 1;
		for (int i = 1; i < n; i++) {
			S[i] = 1;

			// Traverse left while the next element on left
			// is smaller than price[i]
			for (int j = i - 1;
				(j >= 0) && (price[i] >= price[j]); j--)
				S[i]++;
		}
	}
	static void printArray(int arr[])
	{
		System.out.print(Arrays.toString(arr));
	}

	public static void main(String[] args)
	{
		int price[] = { 10, 4, 5, 90, 120, 80 };
		int n = price.length;
		int S[] = new int[n];
		calculateSpan(price, n, S);
		printArray(S);
	}
}

// import java.util.Scanner;

// class Node {
//     int data;
//     Node left;
//     Node right;

//     Node(int input) {
//         data = input;
//         left = null;
//         right = null;
//     }
// }

// class BST {
//     Node root;

//     BST() {
//         root = null;
//     }

//     void create(int input) {
//         Node new_node = new Node(input);
//         if (root == null)
//             root = new_node;
//         else {
//             Node temp = root;
//             while (true) {
//                 if (temp.data == new_node.data)
//                     break;
//                 if (input < temp.data && temp.left == null) {
//                     temp.left = new_node;
//                     break;
//                 } else if (input > temp.data && temp.right == null) {
//                     temp.right = new_node;
//                     break;
//                 } else if (input < temp.data && temp.left != null)
//                     temp = temp.left;
//                 else if (input > temp.data && temp.right != null)
//                     temp = temp.right;
//             }
//         }
//     }

//     void postorder(Node temp) {
//         if (temp == null)
//             return;
//         else {
//             postorder(temp.left);
//             postorder(temp.right);
//             System.out.print(temp.data + " ");
//         }
//     }

//     public static void main(String[] args) {
//         BST tree = new BST();
//         Scanner scanner = new Scanner(System.in);
//         while (true) {
//             int input = scanner.nextInt();
//             if (input < 1)
//                 break;
//             tree.create(input);
//         }
//         tree.postorder(tree.root);
//         scanner.close();
//     }
// }


// import java.util.*;

// class Node {
//     int data;
//     Node left, right;

//     public Node(int data) {
//         this.data = data;
//         this.left = null;
//         this.right = null;
//     }
// }

// class BinaryTree {
//     Node root;

//     public Node newNode(int data) {
//         Node node = new Node(data);
//         return node;
//     }

//     public void insert(Node root, int data) {
//         Node temp;
//         Queue<Node> q = new LinkedList<>();
//         q.add(root);
//         while (!q.isEmpty()) {
//             temp = q.poll();
//             if (temp.left == null) {
//                 temp.left = newNode(data);
//                 break;
//             } else {
//                 q.add(temp.left);
//             }
//             if (temp.right == null) {
//                 temp.right = newNode(data);
//                 break;
//             } else {
//                 q.add(temp.right);
//             }
//         }
//     }

//     public void storeInorderTraversal(Node root, List<Integer> arr) {
//         if (root == null)
//             return;
//         storeInorderTraversal(root.left, arr);
//         arr.add(root.data);
//         storeInorderTraversal(root.right, arr);
//     }

//     public void replaceNodeWithSum(Node root, List<Integer> arr, int[] i) {
//         if (root == null)
//             return;
//         replaceNodeWithSum(root.left, arr, i);
//         root.data = arr.get(i[0] - 1) + arr.get(i[0] + 1);
//         i[0]++;
//         replaceNodeWithSum(root.right, arr, i);
//     }

//     public void replaceNodeWithSumUtil(Node root) {
//         if (root == null)
//             return;

//         List<Integer> arr = new ArrayList<>();
//         arr.add(0);
//         storeInorderTraversal(root, arr);
//         arr.add(0);
//         int[] i = {1};
//         replaceNodeWithSum(root, arr, i);
//     }

//     public void preorderTraversal(Node root) {
//         if (root == null)
//             return;
//         System.out.print(root.data + " ");
//         preorderTraversal(root.left);
//         preorderTraversal(root.right);
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         BinaryTree binaryTree = new BinaryTree();
//         Scanner scanner = new Scanner(System.in);

//         Node root = null;
//         int n, r;
//         n = scanner.nextInt();
//         r = scanner.nextInt();
//         root = binaryTree.newNode(r);

//         for (int i = 1; i < n; i++) {
//             r = scanner.nextInt();
//             binaryTree.insert(root, r);
//         }

//         System.out.println("Before tree modification:");
//         binaryTree.preorderTraversal(root);

//         binaryTree.replaceNodeWithSumUtil(root);

//         System.out.println("\nAfter tree modification:");
//         binaryTree.preorderTraversal(root);
//     }
// }

