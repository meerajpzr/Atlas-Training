import java.util.*;

class Task01 {

    LinkedList<Entry>[] data = new LinkedList[10]; // Creating a hash table with 10 buckets

    // Method to insert key-value pairs into the hash table
    public void put(String keyval, int value) {
        int index = Math.abs(keyval.hashCode() % data.length);  // Compute hash index

        if (data[index] == null) {
            data[index] = new LinkedList<>();  // If no linked list exists, create one
        }

        // Check if the key already exists and update the value if so
        for (Entry e : data[index]) {
            if (e.keyval.equals(keyval)) {
                e.value = value;  // Update the value if key is found
                return;
            }
        }

        // Add the new entry to the list
        data[index].add(new Entry(keyval, value));
    }

    // Method to retrieve the value for a given key
    public int get(String keyval) {
        int index = Math.abs(keyval.hashCode() % data.length);  // Compute hash index

        if (data[index] != null) {
            for (Entry e : data[index]) {
                if (e.keyval.equals(keyval)) {
                    return e.value;  // Return the value if the key is found
                }
            }
        }
        return -1;  // Return -1 if the key doesn't exist
    }

    // Method to display the contents of the hash table
    public void display() {
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null) {
                System.out.print("Bucket " + i + ": ");
                for (Entry e : data[i]) {
                    System.out.print("[" + e.keyval + "=" + e.value + "] ");
                }
                System.out.println();
            }
        }
    }

    // Entry class representing a key-value pair
    static class Entry {
        String keyval;
        int value;

        Entry(String k, int v) {
            keyval = k;
            value = v;
        }
    }

    public static void main(String[] args) {
        Task01 hashTable = new Task01();

        // Adding some key-value pairs
        hashTable.put("Apple", 10);
        hashTable.put("Banana", 20);
        hashTable.put("Cherry", 30);
        hashTable.put("Date", 40);

        // Displaying the hash table contents
        System.out.println("Hash Table Contents:");
        hashTable.display();

        // Retrieve value for a specific key
        System.out.println("\nValue for 'Banana': " + hashTable.get("Banana"));
        System.out.println("Value for 'Apple': " + hashTable.get("Apple"));
        System.out.println("Value for 'Orange': " + hashTable.get("Orange"));
    }
}
