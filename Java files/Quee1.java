public class Quee1 {
    int queueLength = 3;
    int items[] = new int[queueLength];
    int front = -1;
    int back = -1;

    void enQueue(int itemValue) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else if (front == -1 && back == -1) {
            front = back = 0;
            items[back] = itemValue;
        } else {
            back++;
            items[back] = itemValue;
        }
    }

    void deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Nothing to dequeue");
        } else if (front == back) {
            front = back = -1;
        } else {
            front++;
        }
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.print("Queue elements: ");
            for (int i = front; i <= back; i++) {
                System.out.print(items[i] + " ");
            }
            System.out.println();
        }
    }

    boolean isFull() {
        return back == queueLength - 1;
    }

    boolean isEmpty() {
        return front == -1 && back == -1;
    }

    void peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Nothing to peek.");
        } else {
            System.out.println("Front value is: " + items[front]);
        }
    }

    public static void main(String[] args) {
        Quee1 myQueue = new Quee1();

        myQueue.enQueue(111);
        myQueue.enQueue(222);
        myQueue.enQueue(777);
        myQueue.enQueue(999); // Will show "Queue is full"

        myQueue.display();

        myQueue.peek();

        myQueue.deQueue();
        myQueue.display();

        myQueue.peek();
    }
}
