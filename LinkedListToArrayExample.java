public class LinkedListToArrayExample {

    // Node class to represent each element of the list
    static class Node {
        int data;   // Stores the data for each node
        Node next;  // Points to the next node in the list

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // LinkedList class to manage the nodes
    static class LinkedList {
        Node head;   // Head of the list
        int size;    // Size of the list

        // Add element to the end of the list
        public void add(int value) {
            Node newNode = new Node(value);
            if (head == null) {
                head = newNode;  // If the list is empty, set head to new node
            } else {
                Node current = head;
                // Traverse to the last node
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;  // Link the new node
            }
            size++;  // Increment the size of the list
        }

        // Convert the linked list to an array
        public int[] toArray() {
            int[] array = new int[size];  // Create an array of the same size as the list
            Node current = head;
            int index = 0;
            // Traverse the linked list and copy each element to the array
            while (current != null) {
                array[index++] = current.data;
                current = current.next;
            }
            return array;  // Return the array
        }

        // Display the linked list
        public void display() {
            if (head == null) {
                System.out.println("The list is empty.");
                return;
            }
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("NULL");
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();  // Create a new linked list

        // Add some elements to the linked list
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // Display the linked list
        System.out.print("Linked List: ");
        list.display();  // Output: 10 -> 20 -> 30 -> 40 -> 50 -> NULL

        // Convert the linked list to an array
        int[] array = list.toArray();

        // Display the array
        System.out.print("Converted Array: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();  // Output: Converted Array: 10 20 30 40 50
    }
}
