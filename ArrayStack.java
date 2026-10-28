public class ArrayStack {
    private int[] arr;
    private int top;
    private int capacity;

    // Constructor
    public ArrayStack(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        top = -1;
    }

    // Add an element to the stack
    public void push(int value) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow! Stack is full.");
            return;
        }

        arr[++top] = value;
        System.out.println(value + " pushed onto the stack.");
    }

    // Remove the top element
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Stack is empty.");
            return -1;
        }

        return arr[top--];
    }

    // View the top element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }

        return arr[top];
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Display all elements from top to bottom
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }

        System.out.println("Stack elements (top to bottom):");

        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    // Demonstration
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

        System.out.println("Top element: " + stack.peek());
        System.out.println("Removed element: " + stack.pop());

        stack.display();
    }
}