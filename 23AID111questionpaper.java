class Shape{
    void calulate(){}
}

class Circle extends Shape{
    double radius;

    public Circle(double r) {
        this.radius = r;
    }

    @Override

    void calulate(){
        double a = 3.14*radius*radius;

        System.out.println("the area of the circle: " +a);
    }
    
}

class Cylinder extends Shape{
    double height;
    double radius;

    public Cylinder(double h , double r) {
        this.height = h;
        this.radius = r;
    }

    @Override

    void calulate(){
        double a = 3.14*radius*radius*height;

        System.out.println("the volume of the Cylinder is: "+a);
    }

}

public class Question8{
    public static void main(String[] args) {
        Shape s1 = new Circle(5);
        Shape s2 = new Cylinder(10, 5);

        s1.calulate();
        s2.calulate();
    }
}
