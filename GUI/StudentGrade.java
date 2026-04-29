import javax.swing.*;
import java.awt.*;

class StudentGrade {
    JFrame frame = new JFrame("Student GPA calculator");
    JTextField marks1 = new JTextField(10);
    JTextField marks2 = new JTextField(10);
    JTextField marks3 = new JTextField(10);

    JTextArea area =  new JTextArea(20,20);

    JButton b = new JButton("Evaluvate");

    JLabel result = new JLabel("");

    public StudentGrade(){
        frame.setSize(400,300);
        frame.setLayout(new FlowLayout());
        area.setEditable(false);
        frame.add(new JLabel("Subject 1:"));
        frame.add(marks1);
        frame.add(new JLabel("Subject 2:"));
        frame.add(marks2);
        frame.add(new JLabel("Subject 3:"));
        frame.add(marks3);
        frame.add(area);
        frame.add(b);
        frame.add(result);
        frame.add(new JLabel(""));

        b.addActionListener(e -> {
            try {

                int m1 = Integer.parseInt(marks1.getText());
                int m2 = Integer.parseInt(marks2.getText());
                int m3 = Integer.parseInt(marks3.getText());

                int total_marks = m1 + m2 + m3;

                double avg = total_marks/3.0;

                String grades;

                if (avg >= 75){
                    grades = "A";
                }
                else if (avg >= 60){
                    grades = "B";
                }
                else if (avg >= 40){
                    grades = "C";
                }
                else {
                    grades = "FAIL";
                }

                String output = "Total: " + total_marks +
                        "  \nAvg: " + avg +
                        "  \nGrade: " + grades;

                result.setText(output);
                area.setText(output);
            }
            catch (Exception ex) {
                result.setText("\nInvalid Input, enter only integers");
            }
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

       public static void main(String[] args){
           SwingUtilities.invokeLater(() -> new StudentGrade());
    }

}


