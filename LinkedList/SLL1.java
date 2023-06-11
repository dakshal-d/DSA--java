package LinkedList;

import java.util.Scanner;

class Node {
    int v;
    Node next;

    Node(int v) {
        this.v = v;
        this.next = null;
    }
}

class SLL {
    Node head;
    Node tail;

    SLL() {
        head = null;
    }

    void insert(int v) {
        Node node = new Node(v);
        if (head == null) {
            head = node;
            tail = head;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    void delete(int v) {
        Node cn = head;
        if (cn == null) {
            System.out.println("The list is empty");
            return;
        }
        if (cn.v == v) {
            head = head.next;
            return;
        }
        Node pn = cn;
        while (cn != null) {
            if (cn.v == v) {
                pn.next = cn.next;
                return;
            }
            pn = cn;
            cn = cn.next;
        }
        System.out.println("Element not found in the list");
    }

    void display() {
        Node cn = head;
        if (cn == null) {
            System.out.println("The list is empty");
            return;
        }
        while (cn.next != null) {
            System.out.print(cn.v + " ");
            cn = cn.next;
        }
        System.out.println(cn.v);
    }

    void search(int v) {
        int index = 0;
        Node cn = head;
        if (cn == null) {
            System.out.println("The list is empty");
            return;
        }
        while (cn != null) {
            if (cn.v == v) {
                System.out.println("Element found at index " + index);
                return;
            }
            cn = cn.next;
            index++;
        }
        System.out.println("Element " + v + " not found");
    }

    void update(int i, int v) {
        Node cn = head;
        if (cn == null) {
            System.out.println("The list is empty.");
            return;
        }

        if (i < 0) {
            return;
        }
        int index = 0;

        while (cn != null) {
            if (i == index) {
                cn.v = v;
                return;
            }
            cn = cn.next;
            index++;
        }
        System.out.println("Index out of bounds");
    }
}

public class SLL1{
    public static void main(String[] args) {
        SLL s = new SLL();
        Scanner sc = new Scanner(System.in);
        while (true) {
            int x = sc.nextInt();
            if (x == 1) {
                int v = sc.nextInt();
                s.insert(v);
            } else if (x == 2) {
                int v = sc.nextInt();
                s.delete(v);
            } else if (x == 3) {
                int i = sc.nextInt();
                int v = sc.nextInt();
                s.update(i, v);
            } else if (x == 4) {
                int v = sc.nextInt();
                s.search(v);
            } else if (x == 5) {
                s.display();
            } else if (x == 6) {
                break;
            } else {
                System.out.println("Invid choice");
            }
        }
        sc.close();
    }
}
