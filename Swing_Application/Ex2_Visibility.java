import javax . swing .*;
public class Ex2_Visibility {
    public static void main( String [] args) {
        JFrame frame = new JFrame (" Exercise 2");
        frame . setLayout (null);
        JLabel label = new JLabel (" Hello World ");

        label . setBounds (50 , 50, 150, 20);
        frame .add( label );
        frame . setSize (300 , 200);
        frame . setVisible (true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
