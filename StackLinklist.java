import java.util.*;
class Node {
    int data;
    Node next;
    Node(int data) { this.data = data; }
}
class StackLinkedList {
    private Node top;
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }
    public void pop() {
        if (top == null) System.out.println("Stack is empty");
        else {
            System.out.println("Popped element: " + top.data);
            top = top.next;
        }
    }
    public void display() {
        for (Node cur = top; cur != null; cur = cur.next)
            System.out.print(cur.data + " ");
        System.out.println(top == null ? "Stack is empty" : "");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackLinkedList stack = new StackLinkedList();  
        while (true) {
            System.out.println("1.PUSH 2.POP 3.DISPLAY 4.EXIT");
            System.out.println("Enter your choice:");
            switch (sc.nextInt()) {
                case 1 -> stack.push(sc.nextInt());
                case 2 -> stack.pop();
                case 3 -> stack.display();
                case 4 -> { sc.close(); return; }
                default -> System.out.println("Invalid choice, try again");
            }
        }
    }
}
