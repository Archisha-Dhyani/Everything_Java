import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

class Exp105 {
    private ArrayList<String> list = new ArrayList<>();

    void add(String book) {
        if (list.contains(book)) {
            System.out.println("Book already exists");
        } else {
            list.add(book);
            System.out.println("Book added successfully");
        }
    }

    void remove(String book) {
        if (list.contains(book)) {
            list.remove(book);
            System.out.println("Book removed successfully");
        } else {
            System.out.println("Book not found in the wishlist");
        }
    }

    String display() {
        StringBuilder result = new StringBuilder();
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            result.append(itr.next()).append("\n");
        }
        return result.toString();
    }

    boolean contains(String book) {
        return list.contains(book);
    }
}

public class BookstoreGUI extends JFrame {
    private Exp105 wishlist;

    public BookstoreGUI() {
        wishlist = new Exp105();

        setTitle("Bookstore Wishlist");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        createComponents();
    }

    private void createComponents() {
        JPanel panel = new JPanel();
        getContentPane().add(panel);
        placeComponents(panel);

        setVisible(true);
    }

    private void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel label = new JLabel("Bookstore Wishlist");
        label.setBounds(150, 20, 200, 25);
        panel.add(label);

        JButton addButton = new JButton("Add Book");
        addButton.setBounds(50, 80, 120, 25);
        panel.add(addButton);

        JButton removeButton = new JButton("Remove Book");
        removeButton.setBounds(200, 80, 120, 25);
        panel.add(removeButton);

        JButton displayButton = new JButton("Display Wishlist");
        displayButton.setBounds(50, 120, 120, 25);
        panel.add(displayButton);

        JButton containsButton = new JButton("Check if Book Exists");
        containsButton.setBounds(200, 120, 150, 25);
        panel.add(containsButton);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String book = JOptionPane.showInputDialog("Enter the book to be added:");
                wishlist.add(book);
                JOptionPane.showMessageDialog(null, "Book added successfully");
            }
        });

        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String book = JOptionPane.showInputDialog("Enter the book to be removed:");
                wishlist.remove(book);
                JOptionPane.showMessageDialog(null, "Book removed successfully");
            }
        });

        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JTextArea textArea = new JTextArea(wishlist.display());
                JOptionPane.showMessageDialog(null, new JScrollPane(textArea), "Wishlist", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        containsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String book = JOptionPane.showInputDialog("Enter book name:");
                String result = wishlist.contains(book) ? "The wishlist contains " + book : "The wishlist does not contain " + book;
                JOptionPane.showMessageDialog(null, result);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new BookstoreGUI();
        });
    }
}
