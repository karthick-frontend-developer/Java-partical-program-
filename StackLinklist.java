import java.util.*;
class StackLinkedlist {
    private static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }
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
        if (top == null) System.out.println("Stack is empty");
        else {
            for (Node curr = top; curr != null; curr = curr.next)
                System.out.print(curr.data + " ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackLinkedlist stack = new StackLinkedlist();
        while (true) {
            System.out.println("1.PUSH 2.POP 3.DISPLAY 4.EXIT\nEnter choice:");
            switch (sc.nextInt()) {
                case 1 -> { System.out.println("Enter value:"); stack.push(sc.nextInt()); }
                case 2 -> stack.pop();
                case 3 -> stack.display();
                case 4 -> { sc.close(); return; }
                default -> System.out.println("Invalid choice, try again");
            }
        }
    }
}
