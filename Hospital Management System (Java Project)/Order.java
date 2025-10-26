public class Order {
    private int orderId;
    private String name;
    private double price;
    
    public Order(int orderId, String name, double price) {
        this.orderId = orderId;
        this.name = name;
        this.price = price;
    }
    
     public Order(int orderId, String name) {
        this.orderId = orderId;
        this.name = name;
        this.price = 0;
    }
    public int getOrderId() {
        return orderId;
    }
    
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void print(){
        System.out.println("Item ID:"+getOrderId());
        System.out.println("Item Name: "+getName());
        System.out.println("Price of service: "+getPrice());
    }
}



