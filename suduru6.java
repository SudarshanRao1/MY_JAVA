class student {
    int rollnumber;
    String name;

    student(int rollnumber, String name) {
        this.rollnumber = rollnumber;
        this.name = name;
    }

    void displayStudent() {
        System.out.println("Roll Number: " + rollnumber);
        System.out.println("Name: " + name);
    }
}

class hosteller extends student {
    String hostelname;
    int roomnumber;

    hosteller(int rollnumber, String name, String hostelname, int roomnumber) {
        super(rollnumber, name);   // Correct parent call
        this.hostelname = hostelname;
        this.roomnumber = roomnumber;
    }

    void displayHosteller() {
        displayStudent();
        System.out.println("Hostel Name: " + hostelname);
        System.out.println("Room Number: " + roomnumber);
    }
}

public class suduru6 {
    public static void main(String[] args) {
        hosteller h1 = new hosteller(101, "Rahul", "A-Block", 204);
        h1.displayHosteller();
    }
}

