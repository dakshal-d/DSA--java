import java.util.Scanner;

class Node {
    int val;
    Node next;

    Node(int v) {
        val = v;
        next = null;
    }
}

class SLL {
    Node head;
    Node rear;

    SLL() {
        head = null;
        rear = null;
    }

    void insert(int v) {
        Node nn = new Node(v);
        if (head == null) {
            head = nn;
            rear = head;
        } else {
            rear.next = nn;
            rear = nn;
        }
    }

    void delete(int v) {
        Node cn = head;
        if (cn == null) {
            System.out.println("The list is empty");
            return;
        }
        if (cn.val == v) {
            head = head.next;
            return;
        }
        Node pn = cn;
        while (cn != null) {
            if (cn.val == v) {
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
            System.out.print(cn.val + " ");
            cn = cn.next;
        }
        System.out.println(cn.val);
    }

    void search(int v) {
        int index = 0;
        Node cn = head;
        if (cn == null) {
            System.out.println("The list is empty");
            return;
        }
        while (cn != null) {
            if (cn.val == v) {
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
                cn.val = v;
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
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int x = scanner.nextInt();
            if (x == 1) {
                int v = scanner.nextInt();
                s.insert(v);
            } else if (x == 2) {
                int v = scanner.nextInt();
                s.delete(v);
            } else if (x == 3) {
                int i = scanner.nextInt();
                int v = scanner.nextInt();
                s.update(i, v);
            } else if (x == 4) {
                int v = scanner.nextInt();
                s.search(v);
            } else if (x == 5) {
                s.display();
            } else if (x == 6) {
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }
        scanner.close();
    }
}
