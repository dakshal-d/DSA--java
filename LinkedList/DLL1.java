package LinkedList;
import java.util.Scanner;

public class DLL1 {
    public static void main(String[] args) {
        DLL d = new DLL();
        Scanner sc = new Scanner(System.in);

        while (true) {
            int x = sc.nextInt();
            if (x == 1) {
                int a = sc.nextInt();
                d.insertfirst(a);
            } else if (x == 2) {
                int a = sc.nextInt();
                d.insertlast(a);
            } else if (x == 3) {
                d.traverse();
            }
            else if (x == 4) {
                int a = sc.nextInt();
                int n = sc.nextInt();
                d.insertAtPosition(a, n);
            }

        }
    }
}

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
    }

    public void insertfirst(int data) {
        Node node = new Node(data);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void insertlast(int data) {
        Node node = new Node(data);
        Node last = head;

        node.next = null;

        if (head == null) {
            node.prev = null;
            head = node;
            return;
        }

        while (last.next != null) {
            last = last.next;
        }

        last.next = node;
        node.prev = last;
    }

    public void traverse() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }

    }

    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        if (position == 1) {
            insertfirst(data);
            return;
        }
        Node current = head;
        int count = 1;
        while (count < position - 1 && current.next != null) {
            current = current.next;
            count++;
        }

        if (current.next == null) {
            current.next = newNode;
            newNode.prev = current;
        } else {
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }



}}

