import javax.swing.*;
import java.awt.*;

public class Todoapp{
    public static void main(String[] args){
        JFrame frame = new JFrame("To-Do List");
        frame.setLayout(new FlowLayout());
        JTextField input = new JTextField(10);
        JButton add = new JButton("Add");
        JButton remove = new JButton("Remove");
        DefaultListModel<String> model = new DefaultListModel<>();
        JList<String> list = new JList<>(model);
        add.addActionListener(e -> {
            if (!input.getText().isEmpty()) {
                model.addElement(input.getText());
                input.setText("");
            }
        });
        remove.addActionListener(e -> {
            int index = list.getSelectedIndex();
            if (index != -1) {
                model.remove(index);
            }
        });
        frame.add(input);
        frame.add(add);
        frame.add(remove);
        frame.add(new JScrollPane(list));
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
