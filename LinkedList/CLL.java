
import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    private Node head;

    public CircularLinkedList() {
        this.head = null;
    }

    // Insert at the beginning
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            Node curr = head;
            while (curr.next != head) {
                curr = curr.next;
            }
            curr.next = newNode;
            newNode.next = head;
            head = newNode;
        }
        System.out.println("Node with data " + data + " inserted.");
    }

    // Delete the node at the beginning
    public void beginDelete() {
        if (head == null) {
            System.out.println("Circular Linked List is empty.");
            return;
        }

        if (head.next == head) {
            head = null;
        } else {
            Node curr = head;
            while (curr.next != head) {
                curr = curr.next;
            }
            curr.next = head.next;
            head = head.next;
        }

        System.out.println("Node at the beginning deleted.");
    }

    // Delete the node at the end
    public void lastDelete() {
        if (head == null) {
            System.out.println("Circular Linked List is empty.");
            return;
        }

        if (head.next == head) {
            head = null;
        } else {
            Node curr = head;
            Node prev = null;
            while (curr.next != head) {
                prev = curr;
                curr = curr.next;
            }
            prev.next = head;
        }

        System.out.println("Node at the end deleted.");
    }

    // Delete a node with a specific data value
    public void randomDelete(int data) {
        if (head == null) {
            System.out.println("Circular Linked List is empty.");
            return;
        }

        if (head.data == data) {
            beginDelete();
            return;
        }

        Node curr = head;
        Node prev = null;
        boolean found = false;
        do {
            if (curr.data == data) {
                found = true;
                break;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);

        if (!found) {
            System.out.println("Node with data " + data + " not found.");
            return;
        }

        prev.next = curr.next;
        System.out.println("Node with data " + data + " deleted.");
    }

    // Search for a node with a specific data value
    public void search(int data) {
        if (head == null) {
            System.out.println("Circular Linked List is empty.");
            return;
        }

        Node curr = head;
        boolean found = false;
        int position = 1;
        do {
            if (curr.data == data) {
                found = true;
                break;
            }
            curr = curr.next;
            position++;
        } while (curr != head);

        if (found) {
            System.out.println("Node with data " + data + " found at position " + position + ".");
        } else {
            System.out.println("Node with data " + data + " not found.");
        }
    }

    // Display the circular linked list
    public void display() {
        if (head == null) {
                        System.out.println("Circular Linked List is empty.");
            return;
        }

        System.out.print("Circular Linked List: ");
        Node curr = head;
        do {
            System.out.print(curr.data + " ");
            curr = curr.next;
        } while (curr != head);
        System.out.println();
    }
}

public class CLL{
    public static void main(String[] args) {
        CircularLinkedList circularLinkedList = new CircularLinkedList();
        Scanner scanner = new Scanner(System.in);
        int choice, data;

        while (true) {
         
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
               //    Enter the data to be inserted
                    data = scanner.nextInt();
                    circularLinkedList.insert(data);
                    break;
                case 2:
                    circularLinkedList.beginDelete();
                    break;
                case 3:
                    circularLinkedList.lastDelete();
                    break;
                case 4:
                //    Enter the data to be deleted
                    data = scanner.nextInt();
                    circularLinkedList.randomDelete(data);
                    break;
                case 5:
               //     Enter the data to be searched
                    data = scanner.nextInt();
                    circularLinkedList.search(data);
                    break;
                case 6:
                    circularLinkedList.display();
                    break;
                case 7:
               
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

