package javaapplication2;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Convertor {

    public static void Ar_oper( JTextArea result, JComboBox<String> list_items, JTextField text1, JTextField text2) {
        double x, y, sum = 0;

        try {
            // Try to parse numbers from the text fields
            x = Double.parseDouble(text1.getText());
            y = Double.parseDouble(text2.getText());
        } catch (Exception e) {
            // If parsing fails, show error and stop execution
            result.setText("Enter valid numeric values");
            result.setBackground(Color.RED);
            result.setFont(new Font("Serif", Font.BOLD, 20));
            result.setForeground(Color.WHITE);
            return;

        }
        String selectedItem = (String) list_items.getSelectedItem();

        // Perform the operation
        switch (selectedItem) {
            case "+":
                sum = x + y;
                break;
            case "-":
                sum = x - y;
                break;
            case "*":
                sum = x * y;
                break;
            case "/":
                if (y == 0) {
                    result.setText("Y is 0. Division by 0 = Infinity!");
                    result.setBackground(Color.RED);
                    result.setFont(new Font("Serif", Font.BOLD, 20));
                    result.setForeground(Color.WHITE);

                }
                sum = x / y;
                break;
            default:
                result.setText("Select an operation");
                result.setBackground(Color.RED);
                result.setFont(new Font("Serif", Font.BOLD, 20));
                result.setForeground(Color.WHITE);

        }

        String displayValue;
        if (sum == Math.floor(sum)) {
            displayValue = String.valueOf((int) sum); // Display without decimal part
        } else {
            displayValue = String.valueOf(sum);
        }

        // Display result
        result.setText(displayValue);
        result.setBackground(new Color(0, 255, 0)); // Green background for success
        result.setFont(new Font("Serif", Font.BOLD, 20));
        result.setForeground(Color.BLACK);

    }

    public static void Ar_B( JTextArea result, JComboBox<String> list_items, JTextField text1, JTextField text2) {
        int x, y, sum = 0;

        try {
            x = Integer.parseInt(text1.getText(), 2);
            y = Integer.parseInt(text2.getText(), 2);

        } catch (Exception e) {
            result.setText("ENETR A BINARY NUMBER");
            result.setBackground(new Color(255, 0, 0));
            result.setFont(new Font("Serif", Font.BOLD, 20));
            result.setForeground(Color.WHITE);
            return;
        }

        String selectedItem = (String) list_items.getSelectedItem();

        switch (selectedItem) {
            case "+":
                sum = x + y;
                break;
            case "-":
                sum = x - y;
                break;
            case "*":
                sum = x * y;
                break;
            case "/":
                if (y == 0) {
                    result.setText("Y is 0. Division by 0 = Infinity!");
                    result.setBackground(Color.RED);
                    result.setFont(new Font("Serif", Font.BOLD, 20));
                    result.setForeground(Color.WHITE);

                }
                sum = x / y;
                break;
            default:
                result.setText("Select an operation");
                result.setBackground(Color.RED);
                result.setFont(new Font("Serif", Font.BOLD, 20));
                result.setForeground(Color.WHITE);

        }

        // Display result
        result.setText(Integer.toBinaryString(sum));
        result.setBackground(new Color(0, 255, 0)); // Green background for success
        result.setFont(new Font("Serif", Font.BOLD, 20));
        result.setForeground(Color.BLACK);

    }

    public static void Ar_H( JTextArea result, JComboBox<String> list_items, JTextField text1, JTextField text2) {
        int x, y, sum = 0;
        try {
            x = Integer.parseInt(text1.getText(), 16);
            y = Integer.parseInt(text2.getText(), 16);

        } catch (Exception e) {
            result.setText("ENETR A Hexa value");
            result.setBackground(new Color(255, 0, 0));
            result.setFont(new Font("Serif", Font.BOLD, 20));
            result.setForeground(Color.WHITE);

        }

        x = Integer.parseInt(text1.getText(), 16);
        y = Integer.parseInt(text2.getText(), 16);

        String selectedItem = (String) list_items.getSelectedItem();

        switch (selectedItem) {
            case "+":
                sum = x + y;
                break;
            case "-":
                sum = x - y;
                break;
            case "*":
                sum = x * y;
                break;
            case "/":
                if (y == 0) {
                    result.setText("Y is 0. Division by 0 = Infinity!");
                    result.setBackground(Color.RED);
                    result.setFont(new Font("Serif", Font.BOLD, 20));
                    result.setForeground(Color.WHITE);

                }
                sum = x / y;
                break;
            default:
                result.setText("Select an operation");
                result.setBackground(Color.RED);
                result.setFont(new Font("Serif", Font.BOLD, 20));
                result.setForeground(Color.WHITE);

        }
        result.setText(Integer.toBinaryString(sum));
        result.setBackground(new Color(0, 255, 0)); // Green background for success
        result.setFont(new Font("Serif", Font.BOLD, 20));
        result.setForeground(Color.BLACK);

    }

}
