abstract class Employee {
double base;
Employee(double base) {
this.base = base;
}
abstract void calculateSalary();
}
class FullTime extends Employee {
FullTime(double base) {
super(base);
}void calculateSalary() {
System.out.println("FullTime Salary: " + (base + 5000));
}
}
class Intern extends Employee {
Intern(double base) {
super(base);
}void calculateSalary() {
System.out.println("Intern Stipend: " + base);
}
}
public class Employeesalayary {
    public static void main(String[] args){
        Employee e1 = new FullTime(45215.2526);
        e1.calculateSalary();
    }
    
}

