public class OrderTreeNode {
    private Order order;
    private OrderTreeNode leftChild;
    private OrderTreeNode rightChild;
    public OrderTreeNode(Order order) {
        this.order = order;
        this.leftChild = null;
        this.rightChild = null;
    }
    
    public int getOrderId() {
        return order.getOrderId();
    }
    
    public String getName() {
        return order.getName();
    }
    
    public void setName(String name) {
        order.setName(name);
    }
    
    public double getPrice() {
        return order.getPrice();
    }
    
    public void setPrice(double price) {
        order.setPrice(price);
    }
    
    public OrderTreeNode getLeftChild() {
        return leftChild;
    }
    
    public void setLeftChild(OrderTreeNode leftChild) {
        this.leftChild = leftChild;
    }
    
    public OrderTreeNode getRightChild() {
        return rightChild;
    }
    
    public void setRightChild(OrderTreeNode rightChild) {
        this.rightChild = rightChild;
    }
}