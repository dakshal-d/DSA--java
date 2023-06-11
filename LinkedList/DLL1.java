package LinkedList;

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
    DLL(){
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

    public void traverse(){
        Node node= head;
        while(node!=null){
            System.out.println(node.data);
            node=node.next;
        }

    }



}
public class DLL1{
    public static void main(String[] args) {
        DLL d= new DLL();
        Scanner sc= new Scanner(System.in);
        
        while(true){
            int n=sc.nextInt();
            if(n==1){
                int a=sc.nextInt();
                d.insertfirst(a);
            }
            else if(n==2){
                int a=sc.nextInt();
                d.insertlast(a);
            }
            else if(n==3){
                d.traverse();
            }

        }
    }
}
