import javax.swing.*;
import java.awt.*;
public class FoodOrderApp extends JFrame {
    // Checkboxes for items
    private JCheckBox pizza, burger, juice;
    // Output area
    private JTextArea output;
    public FoodOrderApp() {
        setTitle("Food Ordering App");
        setSize(350, 300);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// Create checkboxes with prices
        pizza = new JCheckBox("Pizza - ₹100");
        burger = new JCheckBox("Burger - ₹80");
        juice = new JCheckBox("Juice - ₹50");
// Button
        JButton billButton = new JButton("Calculate Bill");
// Output area
        output = new JTextArea(8, 25);
        output.setEditable(false);
// Add components
        add(new JLabel("Select Items:"));
        add(pizza);
        add(burger);
        add(juice);
        add(billButton);
        add(new JScrollPane(output));
// Event handling
        billButton.addActionListener(e -> calculateBill());
        setVisible(true);
    }
    // Method to calculate total and display result
    private void calculateBill() {
        int total = 0;
        StringBuilder bill = new StringBuilder("Selected Items:\n");
        if (pizza.isSelected()) {
            total += 100;
            bill.append("Pizza - ₹100\n");
        }
        if (burger.isSelected()) {
            total += 80;
            bill.append("Burger - ₹80\n");
        }
        if (juice.isSelected()) {total += 50;
            bill.append("Juice - ₹50\n");
        }
        bill.append("\nTotal: ₹").append(total);
// Display in text area
        output.setText(bill.toString());
    }
    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> new FoodOrderApp());
    }
}
