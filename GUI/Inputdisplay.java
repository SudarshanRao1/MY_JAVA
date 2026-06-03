import javax.swing.*;
import java.awt.*;

public class Inputdisplay {
    public static void main(String[] args){
        JFrame frame = new JFrame("Input Example");
        frame.setLayout(new FlowLayout());
        JTextField input = new JTextField(10);
        JButton button = new JButton("Show");
        JLabel label = new JLabel();
        button.addActionListener(e -> {
            label.setText("You entered: " + input.getText());
        });
        frame.add(input);
        frame.add(button);
        frame.add(label);
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
