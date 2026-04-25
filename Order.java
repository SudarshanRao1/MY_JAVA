class Order {

public int orderId;
private String customerName;
private double itemPrice;

public Order(int id, String name, double price) {
orderId = id;
name = customerName;
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
