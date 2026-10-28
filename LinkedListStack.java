public class LinkedListStack {

    // Node class
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top;
    private int size;

    // Constructor
    public LinkedListStack() {
        top = null;
        size = 0;
    }

    // Add an element to the top
    public void push(int value) {
        Node newNode = new Node(value);

        newNode.next = top;
        top = newNode;
        size++;

        System.out.println(value + " pushed onto the stack.");
    }

    // Remove the top element
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Stack is empty.");
            return -1;
        }

        int value = top.data;
        top = top.next;
        size--;

        return value;
    }

    // View the top element
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }

        return top.data;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Return the number of elements
    public int size() {
        return size;
    }

    // Display all elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }

        Node current = top;

        System.out.println("Stack elements (top to bottom):");

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    // Demonstration
    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

        System.out.println("Top element: " + stack.peek());
        System.out.println("Removed element: " + stack.pop());

        stack.display();

        System.out.println("Stack size: " + stack.size());
    }
}