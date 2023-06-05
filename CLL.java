import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    Node head;

    CircularLinkedList() {
        this.head = null;
    }

    // Method to insert a node at the end of the circular linked list
    void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head;
        }
    }

    // Method to delete the nth node from the circular linked list
    void deleteNode(int position) {
        if (head == null) {
            System.out.println("List is empty. Cannot delete a node.");
            return;
        }

        Node current = head;
        Node previous = null;
        int count = 1;

        // Traverse to the node at the given position
        while (count < position) {
            previous = current;
            current = current.next;
            count++;
            if (current == head) {
                System.out.println("Invalid position. Node does not exist at position " + position + ".");
                return;
            }
        }

        // If the head node needs to be deleted
        if (current == head && current.next == head) {
            head = null;
        } else if (current == head) { // If the head node is not to be deleted
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            head = head.next;
            temp.next = head;
        } else { // Node other than head needs to be deleted
            previous.next = current.next;
        }
    }

    // Method to display the circular linked list
    void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;
        System.out.print("Circular Linked List: ");
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }
}

public class CLL {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int data = scanner.nextInt();
            list.insert(data);
        }
        int position = scanner.nextInt();
        list.deleteNode(position);

        list.display();

        scanner.close();
    }
}
