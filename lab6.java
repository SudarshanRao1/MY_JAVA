class lab6 {
int empId;
String name;
lab6() {
System.out.println("Employee default constructor");
}
}
class Manager extends lab6 {
String department;
Manager(int id, String n, String dept) {

department = dept;
System.out.println("Manager constructor executed");
}
public static void main(String[] args) {
Manager m1 = new Manager(101, "Asha", "Finance");
Manager m2 = new Manager(102, "Rohit", "IT");
}

}
