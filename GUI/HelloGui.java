import javax.swing.*;

public class HelloGui {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello ");
        JLabel label = new JLabel("Hello ra  Sudarshan!");
        frame.add(label);
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
