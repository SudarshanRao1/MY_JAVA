import java.util.*;
import javax.swing.*;

class Book{
    String title;
    boolean issued;

    Book(String title){
        this.title = title;
        this.issued = false; 
    }

    void issueBook(){
        issued = true;
    }

    void returnBook(){
        issued = false;
    }

    boolean isIssued(){
        return issued;
    }

    String getTitle(){
        return title;
    }

}

class LibrarySystem{
    ArrayList<Book> booklist = new ArrayList<>();

    void addBook(Book b){
        booklist.add(b);
    }

    String issuedBook(String title){
        for (Book b : booklist){
            if(b.getTitle().equals(title)){
                if (b.isIssued()){
                    return title + " book is already issued";
                }
                b.issueBook();
                return title + " is issued";
            }

        }

        return " Book not found";
    }

    String returnedBook(String title){
        for (Book b : booklist){
            if (b.getTitle().equals(title)){
                if (!b.isIssued()){
                    return title + " is not returned/issued to you";
                }

                b.returnBook();
                return title+"is returned";
            }
        }

        return " book not found";
    }

    String showIssuedBooks(){
        String results = "";
        for (Book b : booklist){
            if (b.isIssued()){
                results += b.getTitle() + "\n"; 
            }
        }

        if (results.equals("")){
                return " no books were issued";
        }

        return results;
    }

}

class UI {
    public UI(LibrarySystem sys){
        JFrame frame = new JFrame("library Book managment System");
        frame.setLayout(new java.awt.FlowLayout());

        JTextField input = new JTextField(20);

        JTextArea display = new JTextArea(10,30);

        JButton b = new JButton("Show Issued Books");
        JButton b1 = new JButton("issue Book");
        JButton b2 = new JButton("return book");

        b.addActionListener(e->{
            display.setText(sys.showIssuedBooks());
        });

        b1.addActionListener(e->{
            display.setText(sys.issuedBook(input.getText()));
        });

        b2.addActionListener(e->{
            display.setText(sys.returnedBook(input.getText()));
        });

        frame.add(b);
        frame.add(b1);
        frame.add(b2);
        frame.add(display);
        frame.add(input);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(500,500);
    }
}

public class MainApp {
    public static void main(String[] args) {
        LibrarySystem sys = new LibrarySystem();
        sys.addBook(new Book("psycology of money"));
        sys.addBook(new Book("pooja mam"));
        sys.addBook(new Book("sudarshan"));
        
        new UI(sys);
    }
}
