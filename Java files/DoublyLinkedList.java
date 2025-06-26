class DoublyLinkedList {
    // Node class inside DoublyLinkedList
    class Node {
        int data;
        Node prev, next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node head, tail;

    // Add element at the end
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Delete element by value (first occurrence)
    public void delete(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                if (current == head) {
                    head = head.next;
                    if (head != null) head.prev = null;
                } else if (current == tail) {
                    tail = tail.prev;
                    if (tail != null) tail.next = null;
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                System.out.println("Deleted: " + data);
                return;
            }
            current = current.next;
        }
        System.out.println("Element not found: " + data);
    }

    // Traverse and print the list
    public void traverse() {
        Node current = head;
        System.out.print("List: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Main method to test
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        list.traverse(); // Output: 10 20 30 40

        list.delete(20);
        list.traverse(); // Output: 10 30 40

        list.delete(10);
        list.traverse(); // Output: 30 40
    }
}
