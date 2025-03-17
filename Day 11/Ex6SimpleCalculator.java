import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ex6SimpleCalculator {
    public static void main(String[] args) {
        // Create JFrame
        JFrame f = new JFrame("Simple Calculator");
        f.setLayout(new FlowLayout());
        f.setSize(300, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create Labels
        JLabel l1 = new JLabel("Enter First Number:");
        JLabel l2 = new JLabel("Enter Second Number:");
        JLabel l3 = new JLabel("");

        // Create TextFields
        JTextField tf1 = new JTextField(10);
        JTextField tf2 = new JTextField(10);

        // Create Buttons
        JButton b1 = new JButton("ADD");
        JButton b2 = new JButton("SUBTRACT");
        JButton b3 = new JButton("RESET");

        // Add ActionListener for ADD button
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(tf1.getText());
                    int num2 = Integer.parseInt(tf2.getText());
                    int sum = num1 + num2;
                    l3.setText("Result: " + sum);
                } catch (NumberFormatException ex) {
                    l3.setText("Invalid input!");
                }
            }
        });

        // Add ActionListener for SUBTRACT button
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(tf1.getText());
                    int num2 = Integer.parseInt(tf2.getText());
                    int diff = num1 - num2;
                    l3.setText("Result: " + diff);
                } catch (NumberFormatException ex) {
                    l3.setText("Invalid input!");
                }
            }
        });

        // Add ActionListener for RESET button
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf1.setText("");
                tf2.setText("");
                l3.setText("");
            }
        });

        // Add components to frame
        f.add(l1);
        f.add(tf1);
        f.add(l2);
        f.add(tf2);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(l3);

        // Set frame visibility
        f.setVisible(true);
    }
}