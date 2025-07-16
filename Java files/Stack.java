class Stack {
    private int maxSize;
    private int top;
    private int[] stack;

    // Constructor to initialize stack
    public Stack(int size) {
        maxSize = size;
        stack = new int[maxSize];
        top = -1;  // Stack is empty initially
    }

    // Push an element onto the stack
    public void push(int value) {
        if (top < maxSize - 1) {
            stack[++top] = value;
            System.out.println("Pushed " + value + " to the stack.");
        } else {
            System.out.println("Stack Overflow! Cannot push " + value);
        }
    }

    // Pop an element from the stack
    public int pop() {
        if (top >= 0) {
            int poppedValue = stack[top--];
            System.out.println("Popped " + poppedValue + " from the stack.");
            return poppedValue;
        } else {
            System.out.println("Stack Underflow! Stack is empty.");
            return -1;
        }
    }

    // Peek at the top element of the stack
    public int peek() {
        if (top >= 0) {
            return stack[top];
        } else {
            System.out.println("Stack is empty.");
            return -1;
        }
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Get the current size of the stack
    public int size() {
        return top + 1;
    }
}

public class Stack {
    public static void main(String[] args) {
        Stack stack = new Stack(5);  // Create a stack of size 5

        // Pushing elements to the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        // Trying to push beyond capacity
        stack.push(60);

        // Peeking the top element
        System.out.println("Top element: " + stack.peek());

        // Popping elements from the stack
        stack.pop();
        stack.pop();

        // Checking the current size of the stack
        System.out.println("Current stack size: " + stack.size());

        // Checking if stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
