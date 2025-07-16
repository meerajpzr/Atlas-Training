class BinarySearchTree {
    // Node class represents each node in the tree
    static class Node {
        int data;
        Node left, right;

        // Constructor to create a new node with integer data
        public Node(int item) {
            data = item;
            left = right = null;
        }
    }

    Node root;

    // Constructor for creating an empty BST
    BinarySearchTree() {
        root = null;
    }

    // Insert function to add elements to the BST
    public void insert(int data) {
        root = insertRec(root, data);
    }

    // A recursive function to insert a new node
    private Node insertRec(Node root, int data) {
        // If the tree is empty, create a new node
        if (root == null) {
            root = new Node(data);
            return root;
        }

        // Otherwise, recursively insert the node into the left or right subtree
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }

        // return the (unchanged) node pointer
        return root;
    }

    // Function to print the tree in a structured way (for debugging)
    public void printTree(Node root) {
        if (root != null) {
            // Print the current node
            System.out.print(root.data + " ");

            // Print left child and right child
            if (root.left != null) {
                System.out.print("L:" + root.left.data + " ");
            }
            if (root.right != null) {
                System.out.print("R:" + root.right.data);
            }
            System.out.println();

            // Recursively print left and right subtrees
            printTree(root.left);
            printTree(root.right);
        }
    }

    // Main function to run the Binary Search Tree
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        // Insert nodes to match the desired tree structure
        tree.insert(11);   // Root node
        tree.insert(22);   // Left child of 11
        tree.insert(33);   // Right child of 11
        tree.insert(44);   // Left child of 22
        tree.insert(55);   // Right child of 22
        tree.insert(77);   // Left child of 44
        tree.insert(88);   // Right child of 44
        tree.insert(99);   // Right child of 55
        tree.insert(66);   // Left child of 33
        tree.insert(100);  // Left child of 66
        tree.insert(114);  // Right child of 66

        // Print the tree structure
        System.out.println("Binary Search Tree structure:");
        tree.printTree(tree.root);
    }
}
