
class Employee{
    private String empid;
    private String name;
    
    String getname(){
        return name;
    }

    String getempid(){
        return empid;
    }

    void setname(String n){
        this.name = n;
    }

    void setempid(String e){
        this.empid = e;
    }

    Employee(String name , String empid){
        this.name = name;
        this.empid = empid;
    }

    void salarycalculate(int bonus , int base){

        System.out.println("Developer -> Basic Salary = "+base+ " Bonus = "+base);
        int a =  base+bonus;
        System.out.println( "name: "+name +" Empid: " +empid + " Developer Salary = " + a);
        return;
    }

    void salarycalculate(int base){
        System.out.println("Tester -> Basic Salary = "+base);
        int a = base;
        System.out.println("name: "+name +" Empid: " +empid + " Tester Salary = " + a);
        return;
    }
    
}

public class Question7{
    public static void main(String[] args) {
        Employee e1 = new Employee("Sudarshan" , "12abc");
        Employee e2 = new Employee("Snehitha"  , "12def");

        e1.salarycalculate(50000, 5000);
        e2.salarycalculate(4000);
    }
}

