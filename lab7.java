class lab7 {
public int orderId;
private String customerName;
private double itemPrice;
public lab7(int id, String name, double price) {
orderId = id;
customerName = name;
itemPrice = price;
}
public String getCustomerName() {
return customerName;
}
public double getPrice(double extra) {
return itemPrice + extra;
}
public static double calculateTotal() {
return 200;
}
public void display() {
System.out.println("Order ID: " + orderId);
System.out.println("Customer: " + customerName);
System.out.println("Total Bill: " + calculateTotal());
}
}
public class Main {
    public static void main(String[] args) {
        lab7 order = new lab7(101, "ananya", 2200.0);
        order.display();
        System.out.println("Price with extra: " + order.getPrice(50.0));
    }
}
