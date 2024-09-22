package views;

import javax.swing.*;
import java.awt.*;

public class booksAddView extends JFrame {
    public booksAddView() {
        setTitle("Add Books");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create a "ugly" button
        JButton uglyButton = new JButton("It works");

        add(uglyButton);

        setVisible(true);
    }

}
