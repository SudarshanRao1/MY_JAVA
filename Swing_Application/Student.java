import java.util.*;
import javax.swing.*;
import java.awt.*;


class Studenta {
    String name;

    Studenta(String n) {
        name = n;
    }

    String getname(){
        return name;
    }
}

class StudentAdding{
    ArrayList<Studenta> students = new ArrayList<>();

    void addstudent(Studenta s){
        students.add(s);
    }

    String getAllStudents(){
        String result = "";
        for (Studenta s : students) {
            result += s.getname() + "\n";
        }
        return result;
    }
}


public class Student extends JFrame {
    StudentAdding sa;
    JTextField nameField;
    JTextArea displayArea;
    JLabel label;

    Student() {
        //JFrame frame = new JFrame("Student List");
        setTitle("Student List");
        setLayout(null);
        //setLayout(new GridLayout());
        setSize(400, 300);
        //label.setBounds(50, 50, 150, 20);
        sa = new StudentAdding();
        label = new JLabel("list of our students");
        JButton b = new JButton("ADD");
        displayArea = new JTextArea();
        nameField = new JTextField();

        b.addActionListener(e -> {
            String name = nameField.getText();
            sa.addstudent(new Studenta(name));
            nameField.setText("");
            displayArea.setText(sa.getAllStudents());
        });

        label.setBounds(20, 10, 200, 30);
        add(label);
        b.setBounds(240, 50, 100, 30);
        add(b);
        displayArea.setBounds(20, 100, 320, 180);
        add(displayArea);
        nameField.setBounds(20, 50, 200, 30);
        add(nameField);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }

    public static void main(String[] args){
        new Student();
    }

}
