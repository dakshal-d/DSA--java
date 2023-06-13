package Queue;

import java.util.Scanner;

class Node {
    int ticketNumber;
    Node next;
    
    public Node(int ticketNumber) {
        this.ticketNumber = ticketNumber;
        this.next = null;
    }
}

class Queue {
    Node front, rear;
    int size;

    public Queue() {
        this.front = this.rear = null;
        this.size = 0;
    }
    
    public void enqueue(int ticketNumber) {
        Node newNode = new Node(ticketNumber);
        
        if (this.rear == null) {
            this.front = this.rear = newNode;
        } else {
            this.rear.next = newNode;
            this.rear = newNode;
        }
        System.out.println(ticketNumber);
        this.size++;
    }
    
    public int dequeue() {
        if (this.front == null) {
            throw new RuntimeException("Queue is empty");
        }
        
        int ticketNumber = this.front.ticketNumber;
        this.front = this.front.next;
        
        if (this.front == null) {
            this.rear = null;
        }
        
        this.size--;
        
        return ticketNumber;
    }
    
    public int peek() {
        if (this.front == null) {
            throw new RuntimeException("Queue is empty");
        }
        
        return this.front.ticketNumber;
    }
    
    public boolean isEmpty() {
        return this.front == null;
    }
    
    public int size() {
        return this.size;
    }
}

public class QueueusingLL{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue queue = new Queue();
        
        while (true) {
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    int ticketNumber = scanner.nextInt();
                    queue.enqueue(ticketNumber);
                    break;
                    
                case 2:
                    try {
                        int dequeuedTicketNumber = queue.dequeue();
                        System.out.println(dequeuedTicketNumber);
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                    
                case 3:
                    try {
                        int peekedTicketNumber = queue.peek();
                        System.out.println(peekedTicketNumber);
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                    
                case 4:
                    System.out.println(queue.size());
                    break;
                    
                case 5:
                    System.out.println(queue.isEmpty());
                    break;
                    
                case 6:
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}