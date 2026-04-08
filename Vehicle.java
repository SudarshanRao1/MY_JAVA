abstract class Vehicle {
double distance;
Vehicle(double distance) {
this.distance = distance;
}
abstract void fare();
}
class Car extends Vehicle {
Car(double d) {
super(d);
}void fare() {
System.out.println("Car Fare: " + distance * 15);
}
}
class Bike extends Vehicle {
Bike(double d) {
super(d);
}
void fare() {
System.out.println("Bike Fare: " + distance * 8);
}
}
class Main {
    public static void main(String[] args) {
        Vehicle s1 = new Bike(10);
        s1.fare();
    }
}
