import java.awt.*;
import java.util.*;
import javax.swing.*;

class Order {
    int token;
    String item;
    String status;

    Order(int t, String i) {
        this.token = t;
        this.item = i;
        status = "Pending";
    }
   //** this is the small change i have done in the code skelition  mam  just to make it look good.
   //  while generating my UI not at all for the logic part mam */
    public String toString() {
        return "Token: " + token +    
               " |Item: " + item +
               " |Status: " + status;
    }
}

class CanteenSystem {

    ArrayList<Order> list = new ArrayList<>();
    int counter = 0;

    String generate(String item) {
        counter++;
        Order o = new Order(counter, item);
        list.add(o);
        return "Token "+counter+" generated for "+item;
    }

    String serve(int token) {
        for (Order o : list) {
            if (o.token == token) {
                o.status = "Served";
                return "Order served for token " + token;
            }
        }
        return "Token not found";
    }

    String showPending() {
        String res = "";
        for (Order o : list) {
            if (o.status.equals("Pending")) {
                res += o + "\n";
            }
        }
        if (res.equals("")) {
            return "No pending orders";
        }
        return res;
    }
}

class UI {

    public UI(CanteenSystem sys) {
        JFrame frame = new JFrame("Canteen System");
        frame.setLayout(new FlowLayout());
        frame.setSize(500, 500);
        JTextField input = new JTextField(15);
        JTextArea display = new JTextArea(10, 30);
        JButton b = new JButton("Generate Token");
        JButton b1 = new JButton("Order Served");
        JButton b2 = new JButton("Display Pending");
       
        b.addActionListener(e -> {

            String item = input.getText();

            display.setText(sys.generate(item));
        });

        b1.addActionListener(e -> {
            try {
                int token = Integer.parseInt(input.getText());

                display.setText(sys.serve(token));
            } catch (Exception ex) {
                display.setText("Enter valid token number");
            }
        });

        b2.addActionListener(e -> {
            display.setText(sys.showPending());
        });

        frame.add(input);
        frame.add(display);
        frame.add(b);
        frame.add(b1);
        frame.add(b2);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

public class Main {

    public static void main(String[] args) {

        CanteenSystem sys = new CanteenSystem();
       

        javax.swing.SwingUtilities.invokeLater(() -> {

            new UI(sys);
        });
    }
}