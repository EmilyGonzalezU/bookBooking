package views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class principalView extends JFrame {
    private JPanel contentPane;
    private JComboBox<String> comboBoxOptions;
    private JComboBox<String> comboBoxOptionsModify;
    private JComboBox<String> comboBoxOptionsDelete;


    public principalView() {
        comboBoxOptions = new JComboBox<>(new String[]{"Add","Add Books", "Add Users", "Add Loan"});
        comboBoxOptionsModify = new JComboBox<>(new String[]{"Modify", "Books modify", "User modify", "Loan modify"});
        comboBoxOptionsDelete = new JComboBox<>(new String[]{"Delete", "Books delete", "User delete"});

        contentPane = new JPanel(new BorderLayout());

        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        topPanel.add(comboBoxOptions);
        topPanel.add(comboBoxOptionsModify);
        topPanel.add(comboBoxOptionsDelete);
        comboBoxOptions.setSelectedIndex(0);
        comboBoxOptionsModify.setSelectedIndex(0);
        comboBoxOptionsDelete.setSelectedIndex(0);
        contentPane.add(topPanel, BorderLayout.NORTH);

        JPanel fixedSizePanel = new JPanel();

        fixedSizePanel.setPreferredSize(new Dimension(1000, 500));
        fixedSizePanel.setBackground(Color.white);
        setResizable(false);
        contentPane.add(fixedSizePanel, BorderLayout.CENTER);

        setContentPane(contentPane);

        pack();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        distributeOptions();


    }

    public static void main(String[] args) {
        principalView dialog = new principalView();
        dialog.setVisible(true);
    }

    //method to distribute options
    private void distributeOptions() {
        comboBoxOptions.addActionListener((ActionEvent e) ->{
            //Index of the list [0, 1, 2, 3, 4. . . ]
            String options = (String) comboBoxOptions.getSelectedItem();

            switch (options){
                case "Add Books":
                    //Needs to be initialized
                    booksAddView booksAddView = new booksAddView();
                    //shows view
                    booksAddView.setVisible(true);
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        });
    }
}
