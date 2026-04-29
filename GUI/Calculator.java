import javax.swing.*;
import java.awt.*;

class Calculator {
    public static void main(String[] args){
        JFrame frame = new JFrame("Calculator");
        frame.setLayout(new FlowLayout());
        JTextField num1 = new JTextField(5);
        JTextField num2 = new JTextField(5);
        JButton add = new JButton("Add");
        JLabel result = new JLabel("Result:");
        add.addActionListener(e -> {
            try {
                int a = Integer.parseInt(num1.getText());
                int b = Integer.parseInt(num2.getText());
                result.setText("Result: " + (a + b));
            } catch (Exception ex) {
                result.setText("Invalid Input");
            }
        });
        frame.add(num1);
        frame.add(num2);
        frame.add(add);
        frame.add(result);
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
