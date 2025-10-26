public class OrderTree {
    private OrderTreeNode root;
    public OrderTree() {
        this.root = null;
    }
    
    public void insert(int orderId, String name, double price) {
        Order newOrder = new Order(orderId, name, price);
        OrderTreeNode newNode = new OrderTreeNode(newOrder);
        if (root == null) {
            root = newNode;
            return;
        }
        OrderTreeNode currentNode = root;
        while (true) {
            if (orderId == currentNode.getOrderId()) {
                currentNode.setName(name);
                currentNode.setPrice(price);
                return;
            } else if (orderId < currentNode.getOrderId()) {
                if (currentNode.getLeftChild() == null) {
                    currentNode.setLeftChild(newNode);
                    return;
                } else {
                    currentNode = currentNode.getLeftChild();
                }
            } else {
                if (currentNode.getRightChild() == null) {
                    currentNode.setRightChild(newNode);
                    return;
                } else {
                    currentNode = currentNode.getRightChild();
                }
            }
        }
    }
    public OrderTreeNode search(int orderId) {
        OrderTreeNode currentNode = root;   
        while (currentNode != null) {
            if (orderId == currentNode.getOrderId()) {
                return currentNode;
            } else if (orderId < currentNode.getOrderId()) {
                currentNode = currentNode.getLeftChild();
            } else {
                currentNode = currentNode.getRightChild();
            }
        }
        return null;
    }
    private void getSuccessor(OrderTreeNode node) {
        OrderTreeNode parentOfSuccessor = node;
        OrderTreeNode successor = node;
        OrderTreeNode current = node;

}
public void display(){
    display(root);
}
public void display(OrderTreeNode node) {
    if (node != null) {
        display(node.getLeftChild());
        System.out.println("Order ID: " + node.getOrderId() + ", Name: " + node.getName() + ", Price: " + node.getPrice());
        display(node.getRightChild());
    }
    
}

}