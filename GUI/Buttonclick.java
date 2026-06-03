import javax.swing.*;
import java.awt.*;

public class Buttonclick {
    public static void main(String[] args){
        JFrame frame = new JFrame("Button Example");
        frame.setLayout(new FlowLayout());
        JButton button = new JButton("Click Me");
        JButton button1 = new JButton("click me to exit this");
        button.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "Button Clicked");
        });
        button1.addActionListener(e -> {
            System.exit(0);
        });
        frame.add(button);
        frame.add(button1);
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

