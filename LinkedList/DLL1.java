package LinkedList;

// You are using Java
import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DLL {
    Node head;
    Node tail;

    DLL() {
        head = null;
        tail = null;
    }

    public void insertFront(int data) {
        Node node = new Node(data);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
            head = node;
        }
        if (head == null) {
        head = node;
        tail = node;
        }
        
        System.out.println("Node with data " + node.data + " inserted at the front");
    }

    public void insertEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        System.out.println("Node with data " + data + " inserted at the end.");
    }

    public void insertPos(int data, int position) {
        if (position <= 0) {
            System.out.println("Invalid position.");
            return;
        }
        Node newNode = new Node(data);
        if (position == 1) {
            insertFront(data);
        } else {
            Node curr = head;
            int count = 1;
            while (count < position - 1 && curr != null) {
                curr = curr.next;
                count++;
            }
            if (curr == null) {
                System.out.println("Invalid position.");
                return;
            }
            newNode.prev = curr;
            newNode.next = curr.next;
            if (curr.next != null) {
                curr.next.prev = newNode;
            } else {
                tail = newNode;
            }
            curr.next = newNode;
        }

        System.out.println("Node with data " + data + " inserted at position " + position + ".");
    }

    public void traverse() {
        Node node = head;
        System.out.print("Doubly Linked List: ");
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
}

public class DLL1 {
    public static void main(String[] args) {
        DLL d = new DLL();
        Scanner sc = new Scanner(System.in);
        while (true) {
            int x = sc.nextInt();
            if (x == 1) {
                int q = sc.nextInt();
                d.insertFront(q);
            } else if (x == 2) {
                int q = sc.nextInt();
                d.insertEnd(q);
            } else if (x == 3) {
                int q = sc.nextInt();
                int n = sc.nextInt();
                d.insertPos(q, n);
            } else if (x == 4) {
                d.traverse();
            } else if (x == 5) {
                break;
            } else {

                System.out.println("Invalid choice. Please try again.");
            }

        }
    }
}