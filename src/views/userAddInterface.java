package views;

import javax.swing.*;
import java.awt.*;

public class userAddInterface extends JDialog {
    private JPanel contentPane;
    private JComboBox<String> comboBoxOptions;
    private JComboBox<String> comboBoxOptionsModify;
    private JComboBox<String> comboBoxOptionsDelete;


    public userAddInterface() {
        comboBoxOptions = new JComboBox<>(new String[]{"Add","Add Books", "Add Users", "Add Loan"});
        comboBoxOptionsModify = new JComboBox<>(new String[]{"Modify", "Books modify", "User modify", "Loan modify"});
        comboBoxOptionsDelete = new JComboBox<>(new String[]{"Delete", "Books delete", "User delete"});

        contentPane = new JPanel(new BorderLayout());

        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        topPanel.add(comboBoxOptions);
        topPanel.add(comboBoxOptionsModify);
        topPanel.add(comboBoxOptionsDelete);
        contentPane.add(topPanel, BorderLayout.NORTH);

        JPanel fixedSizePanel = new JPanel();
        fixedSizePanel.setPreferredSize(new Dimension(1000, 1000));
        fixedSizePanel.setBackground(Color.white);
        contentPane.add(fixedSizePanel, BorderLayout.CENTER);

        setContentPane(contentPane);

        setModal(true);
        pack();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);


    }

    public static void main(String[] args) {
        userAddInterface dialog = new userAddInterface();
        dialog.setVisible(true);
    }
}
