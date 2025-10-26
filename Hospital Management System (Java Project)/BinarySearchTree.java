public class BinarySearchTree {
    private static class Node {
        int data;
        Node left;
        Node right;
        
        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    private Node root;
    
    // Constructor
    public BinarySearchTree() {
        root = null;
    }
    
    // Insert a node
    public void insert(int data) {
        root = insertHelper(root, data);
    }
    
    // Helper function to insert a node recursively
    private Node insertHelper(Node node, int data) {
        if (node == null) {
            node = new Node(data);
        } else if (data < node.data) {
            node.left = insertHelper(node.left, data);
        } else if (data > node.data) {
            node.right = insertHelper(node.right, data);
        }
        return node;
    }
    
    // Pre-order traversal
    public void preorderTraversal() {
        preorderHelper(root);
    }
    
    // Helper function for pre-order traversal
    private void preorderHelper(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorderHelper(node.left);
            preorderHelper(node.right);
        }
    }
    public int height() {
    return heightHelper(root);
}

private int heightHelper(Node node) {
    if (node == null) {
        return 0; // empty tree has height -1
    } else {
        int leftHeight = heightHelper(node.left);
        int rightHeight = heightHelper(node.right);
       // System.out.println(leftHeight);
       // System.out.println(rightHeight);
        return Math.max(leftHeight, rightHeight)+1;
    }
}
public int level(int data) {
    return levelHelper(root, data, 0);
}

private int levelHelper(Node node, int data, int level) {
    if (node == null) {
        return -1; // node not found, return -1
    } else if (data == node.data) {
        return level; // node found, return current level
    } else if (data < node.data) {
        return levelHelper(node.left, data, level + 1);
    } else {
        return levelHelper(node.right, data, level + 1);
    }
}
    
    // Test the binary search tree
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(8);
        bst.insert(3);
        bst.insert(10);
        bst.insert(1);
        bst.insert(6);
        bst.insert(14);
        bst.insert(4);
        bst.insert(7);
        bst.insert(13);
        System.out.println("Pre-order traversal:");
        bst.preorderTraversal();
        System.out.println("------------------------");
        System.out.println("Height: "+bst.height());
        System.out.println("------------------------");
        System.out.println("level: "+bst.level(13));
    }
}