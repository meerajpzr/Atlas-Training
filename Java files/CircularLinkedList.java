public class CircularLinkedList {

    // Node class to represent each element
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head of the Circular Linked List
    Node head = null;

    // Method to add a new node to the list
    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            // If the list is empty, the new node is both head and tail
            head = newNode;
            newNode.next = head; // Point to itself (circular reference)
        } else {
            // Find the last node (node whose next is head)
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }

            // Add new node after the last node and make it circular
            temp.next = newNode;
            newNode.next = head; // Points back to head, making it circular
        }
    }

    // Method to display the contents of the Circular Linked List
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head); // Stop when we loop back to the head

        System.out.println("(back to head)");
    }

    // Main method to test Circular Linked List
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();

        // Adding some elements to the circular linked list
        list.add(10);
        list.add(20);
        list.add(30);

        // Displaying the circular linked list
        System.out.println("Circular Linked List:");
        list.display();
    }
}
