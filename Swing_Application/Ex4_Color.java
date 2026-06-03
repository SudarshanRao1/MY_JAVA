import javax.swing.*;
import java.awt.*;

public class Ex4_Color {
    public static void main(String[] args){
        JFrame frame = new JFrame (" Exercise 4");
        frame . setLayout (null);
        JLabel label = new JLabel (" Color Demo");
        label . setBounds (50 , 50, 150 , 40);
        label . setForeground ( Color .RED);
        label . setBackground ( Color . PINK);
// Toggle this line
        label . setOpaque (true);
        frame .add( label );
        frame . setSize (300 , 200);
        frame . setVisible (true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
