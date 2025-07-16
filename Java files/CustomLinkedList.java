public class CustomLinkedList {

    // Node class (inner class)
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head of the list
    Node head = null;

    // Method to add elements to the list
    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode; // First node
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next; // Go to last node
            }
            temp.next = newNode; // Add at the end
        }
    }

    // Method to traverse and print the list
    public void traverse() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Main method
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("Traversing the Linked List:");
        list.traverse();
    }
}
