class Person{
    String name;
    int age;
    String id;
    Person(String name, int age, String id){
        this.name = name;
        this.age = age;
        this.id = id;
    }
    void displayperson(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("ID: "+id);
    }
}

class Student extends Person{
    String course;
    int marks;
    Student(String name,int age,String id,String course,int marks){
        super(name,age,id);
        this.course = course;
        this.marks = marks;
    }
    void displaystudent(){
        System.out.println("Student Details:");
        displayperson();
        System.out.println("Course: "+course);
        System.out.println("Marks: "+marks);
        if(marks>=40){ 
            System.out.println("Status: Pass");
        }
        else{
            System.out.println("Status: Fail");

        }
    }
}

class Professor extends Person{
    String depertment;
    double salary;
    Professor(String name,int age,String id,String depertment,double salary){
        super(name,age,id);
        this.depertment = depertment;
        this.salary = salary;
    }

    void displayprofessor(){
        System.out.println("\nProfessor Details:");
        displayperson();
        System.out.println("Depertment: "+depertment);
        System.out.println("Salary: "+salary);
    }

}

public class Main{
    public static void main(String[] args){
        Student s1 = new Student("Rahul",20,"S101","AI",75);
        Professor p1 = new Professor("Dr. Sharma",45,"P101","Computer Science",85000);
        s1.displaystudent();
        p1.displayprofessor();
    }
}
