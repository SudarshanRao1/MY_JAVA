import javax . swing .*;
public class Ex3_Alignment {
    public static void main( String [] args) {
        JFrame frame = new JFrame (" Exercise 3");
        frame . setLayout (null);

        JLabel label = new JLabel (" Aligned Text");
        label . setBounds (50 , 50, 300 , 40);
        label . setHorizontalAlignment ( JLabel . CENTER );
        frame .add( label );
        frame . setSize (300 , 200);
        frame . setVisible (true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
