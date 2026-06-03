import java.util.ArrayList;
import javax.swing.*;

class Student {
    String name;
    boolean present;

    Student(String n){
        this.name = n;
        this.present = false;
    }

    void markPresent() {
        present = true;
    }

    void markAbsent() {
        present = false;
    }

    boolean isPresent() {
        return present;
    }

    String getName() {
        return name;
    }
}

class Attandanceadder {
    ArrayList<Student> st = new ArrayList<>();

    void addstudent(Student s){
        st.add(s);
    }

    void markPresent(String name){
        for(Student s : st){
            if (s.getName().equals(name)){
                s.markPresent();
                return;
            }
        }
    }

    void markAbsent(String name){
        for(Student s : st){
            if (s.getName().equals(name)){
                s.markAbsent();
                return;
            }
        }
    }

    String getPresentStudents(){
        String result = "";
        for(Student s : st){
            if(s.isPresent()){
                result += s.getName() + "\n";
            }
        }
        return result;
    }
}

public class Attandance {

    Attandanceadder as;

    public Attandance() {

        as = new Attandanceadder();

        JFrame frame = new JFrame("Attendance");
        frame.setLayout(null);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea jt = new JTextArea();

        JButton addBtn = new JButton("Add");
        JButton presentBtn = new JButton("Present");
        JButton absentBtn = new JButton("Absent");

        JTextField names = new JTextField();


        addBtn.addActionListener(e -> {
            String name = names.getText();
            as.addstudent(new Student(name));
            jt.setText("Added: " + name);
            names.setText("");
        });

        presentBtn.addActionListener(e -> {
            String name = names.getText();
            as.markPresent(name);
            jt.setText(as.getPresentStudents());
        });

        absentBtn.addActionListener(e -> {
            String name = names.getText();
            as.markAbsent(name);
            jt.setText(as.getPresentStudents());
        });


        frame.add(addBtn);
        frame.add(presentBtn);
        frame.add(absentBtn);
        frame.add(jt);
        frame.add(names);


        names.setBounds(50, 30, 200, 30);

        addBtn.setBounds(50, 70, 100, 30);
        presentBtn.setBounds(50, 110, 100, 30);
        absentBtn.setBounds(160, 110, 100, 30);

        jt.setBounds(50, 160, 250, 150);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Attandance();
    }
}

