package javaapplication2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author mohamadjawad
 */
public class home extends JFrame {

    JLabel l1;
    JLabel l2;
    JTextField text1;
    JTextField text2;
    JComboBox list_items;
    JButton Calculate;
    JTextArea result;

    JRadioButton Decimal;
    JRadioButton Binary;
    JRadioButton Hexa;

    JPanel panel;

    public home() {
        l1 = new JLabel("Value 1");

        Decimal = new JRadioButton("Decimal");
        Binary = new JRadioButton("Binary");
        Hexa = new JRadioButton("Hexadecimal");

        l2 = new JLabel("Value 2");
        text1 = new JTextField(5);
        text2 = new JTextField(5);
        String[] s = {"+", "-", "*", "/"};
        list_items = new JComboBox(s);
        Calculate = new JButton("calc");
        result = new JTextArea(50, 50);
        result.setEditable(false);
        l1.setHorizontalAlignment(JLabel.RIGHT);
        l2.setHorizontalAlignment(JLabel.RIGHT);
        ButtonGroup group = new ButtonGroup();
        group.add(Decimal);
        group.add(Binary);
        group.add(Hexa);

        panel = new JPanel();
        panel.add(Decimal);
        panel.add(Binary);
        panel.add(Hexa);
        Decimal.setSelected(true);

        text1.addCaretListener(new CaretListener() {
            @Override
            public void caretUpdate(CaretEvent e) {
                if (Decimal.isSelected()) {
                   Convertor.Ar_oper( result, list_items, text1, text2);
                } else if(Binary.isSelected())
                        {
                    Convertor.Ar_B(result, list_items, text1, text2);
                }
                else{
                Convertor.Ar_H(result, list_items, text1, text2);
                }

            }

        });
        text2.addCaretListener(new CaretListener() {
            @Override
            public void caretUpdate(CaretEvent e) {
                  if (Decimal.isSelected()) {
                   Convertor.Ar_oper( result, list_items, text1, text2);
                } else if(Binary.isSelected())
                        {
                    Convertor.Ar_B(result, list_items, text1, text2);
                }
                else{
                Convertor.Ar_H(result, list_items, text1, text2);
                }

            }

        });

        list_items.setSelectedIndex(-1);
        Calculate.addActionListener((ActionEvent e) -> {
             if (Decimal.isSelected()) {
                   Convertor.Ar_oper( result, list_items, text1, text2);
                } else if(Binary.isSelected())
                        {
                    Convertor.Ar_B(result, list_items, text1, text2);
                }
                else{
                Convertor.Ar_H(result, list_items, text1, text2);
                }

        });
        list_items.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                // only when selected
               if (Decimal.isSelected()) {
                   Convertor.Ar_oper( result, list_items, text1, text2);
                } else if(Binary.isSelected())
                        {
                    Convertor.Ar_B(result, list_items, text1, text2);
                }
                else{
                Convertor.Ar_H(result, list_items, text1, text2);
                }
            }

        });

        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 0.3;
        this.add(l1, gbc);
        gbc.gridx = 1;
        gbc.weightx = 0.7;
        this.add(text1, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 0.3;

        this.add(l2, gbc);
        gbc.gridx = 1;
        gbc.weightx = 0.7;
        this.add(text2, gbc);

        gbc.gridy = 2;
        gbc.gridx = 0;
        gbc.weightx = 0.3;
        this.add(list_items, gbc);
        gbc.gridx = 1;
        gbc.weightx = 0.7;
        this.add(Calculate, gbc);

        gbc.gridy = 3;
        gbc.gridx = 1;
        this.add(panel, gbc);
        gbc.gridx = 0;
        gbc.gridy = 7;
        gbc.gridwidth = 2; // span across two columns
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(100, 0, 0, 0);
        gbc.ipady = 50;
        gbc.ipadx = 50;

        this.add(result, gbc);

        this.setPreferredSize(new Dimension(400, 400));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setVisible(true);
        this.pack();

    }

//    private void cal() {
//        try {
//            int x = (int) Double.parseDouble(text1.getText());
//            int y = (int) Double.parseDouble(text2.getText());
//            int sum;
//
//            String selectedItem = (String) list_items.getSelectedItem();
//        } catch (Exception e) {
//            result.setText("ENter a missing value");
//            result.setBackground(new Color(255, 0, 0));
//            result.setFont(new Font("Serif", Font.BOLD, 20));
//            result.setForeground(Color.WHITE);
//
//        }
//        int x = (int) Double.parseDouble(text1.getText());
//        int y = (int) Double.parseDouble(text2.getText());
//        int sum;
//
//        String selectedItem = (String) list_items.getSelectedItem();
//
//        switch (selectedItem) {
//            case "+":
//                sum = x + y;
//
//                result.setText(String.valueOf(sum));
//                result.setBackground(new Color(0, 255, 0));
//                result.setFont(new Font("Serif", Font.BOLD, 20));
//                break;
//            case "-":
//                sum = x - y;
//                result.setText(String.valueOf(sum));
//                result.setBackground(new Color(0, 255, 0));
//                result.setFont(new Font("Serif", Font.BOLD, 20));
//                break;
//            case "*":
//                sum = x * y;
//                result.setText(String.valueOf(sum));
//                ;
//                result.setBackground(new Color(0, 255, 0));
//                result.setFont(new Font("Serif", Font.BOLD, 20));
//                break;
//            case "/":
//                if (y == 0) {
//                    result.setText("Y is 0  Value / 0 =infinity !!");
//                    result.setBackground(new Color(255, 0, 0));
//                    result.setFont(new Font("Serif", Font.BOLD, 20));
//                    result.setForeground(Color.WHITE);
//                    break;
//                } else {
//                    sum = x / y;
//                    result.setText(String.valueOf(sum));
//                    result.setBackground(new Color(0, 255, 0));
//                    result.setFont(new Font("Serif", Font.BOLD, 20));
//
//                    break;
//                }
//            default:
//                result.setText("select operation");
//                result.setBackground(new Color(255, 0, 0));
//                result.setFont(new Font("Serif", Font.BOLD, 20));
//                result.setForeground(Color.WHITE);
//                break;
//
//        }
//
//    }
//
//    private void cal_b() {
//        try {
//            int x = Integer.parseInt(text1.getText(), 2);
//            int y = Integer.parseInt(text2.getText(), 2);
//
//        } catch (Exception e) {
//            result.setText("ENETR A BINARY NUMBER");
//            result.setBackground(new Color(255, 0, 0));
//            result.setFont(new Font("Serif", Font.BOLD, 20));
//            result.setForeground(Color.WHITE);
//
//        }
//
//        int x = Integer.parseInt(text1.getText(), 2);
//        int y = Integer.parseInt(text2.getText(), 2);
//
//        int sum;
//
//        String selectedItem = (String) list_items.getSelectedItem();
//
//        switch (selectedItem) {
//            case "+":
//                sum = x + y;
//
//                result.setText(Integer.toBinaryString(sum));
//                result.setBackground(new Color(0, 255, 0));
//                result.setFont(new Font("Serif", Font.BOLD, 20));
//                break;
//            case "-":
//                sum = x - y;
//                result.setText(Integer.toBinaryString(sum));
//                result.setBackground(new Color(0, 255, 0));
//                result.setFont(new Font("Serif", Font.BOLD, 20));
//                break;
//            case "*":
//                sum = x * y;
//                result.setText(Integer.toBinaryString(sum));
//                result.setBackground(new Color(0, 255, 0));
//                result.setFont(new Font("Serif", Font.BOLD, 20));
//                break;
//            case "/":
//                if (y == 0) {
//                    result.setText("Y is 0  Value / 0 =infinity !!");
//                    result.setBackground(new Color(255, 0, 0));
//                    result.setFont(new Font("Serif", Font.BOLD, 20));
//                    result.setForeground(Color.WHITE);
//                    break;
//                } else {
//                    sum = x / y;
//                    result.setText(Integer.toBinaryString(sum));
//                    result.setBackground(new Color(0, 255, 0));
//                    result.setFont(new Font("Serif", Font.BOLD, 20));
//
//                    break;
//                }
//            default:
//                result.setText("select operation");
//                result.setBackground(new Color(255, 0, 0));
//                result.setFont(new Font("Serif", Font.BOLD, 20));
//                result.setForeground(Color.WHITE);
//                break;
//
//        }
//
//    }
//
//    private void cal_H() {
//        try {
//            int x = Integer.parseInt(text1.getText(), 16);
//            int y = Integer.parseInt(text2.getText(), 16);
//
//        } catch (Exception e) {
//            result.setText("ENETR A Hexa value");
//            result.setBackground(new Color(255, 0, 0));
//            result.setFont(new Font("Serif", Font.BOLD, 20));
//            result.setForeground(Color.WHITE);
//
//        }
//
//        int x = Integer.parseInt(text1.getText(), 16);
//        int y = Integer.parseInt(text2.getText(), 16);
//
//        int sum;
//
//        String selectedItem = (String) list_items.getSelectedItem();
//
//        switch (selectedItem) {
//            case "+":
//                sum = x + y;
//
//                result.setText(Integer.toHexString(sum));
//                result.setBackground(new Color(0, 255, 0));
//                result.setFont(new Font("Serif", Font.BOLD, 20));
//                break;
//            case "-":
//                sum = x - y;
//               result.setText(Integer.toHexString(sum));
//                result.setBackground(new Color(0, 255, 0));
//                result.setFont(new Font("Serif", Font.BOLD, 20));
//                break;
//            case "*":
//                sum = x * y;
//               result.setText(Integer.toHexString(sum));
//                result.setBackground(new Color(0, 255, 0));
//                result.setFont(new Font("Serif", Font.BOLD, 20));
//                break;
//            case "/":
//                if (y == 0) {
//                    result.setText("Y is 0  Value / 0 =infinity !!");
//                    result.setBackground(new Color(255, 0, 0));
//                    result.setFont(new Font("Serif", Font.BOLD, 20));
//                    result.setForeground(Color.WHITE);
//                    break;
//                } else {
//                    sum = x / y;
//                   result.setText(Integer.toHexString(sum));
//                    result.setBackground(new Color(0, 255, 0));
//                    result.setFont(new Font("Serif", Font.BOLD, 20));
//
//                    break;
//                }
//            default:
//                result.setText("select operation");
//                result.setBackground(new Color(255, 0, 0));
//                result.setFont(new Font("Serif", Font.BOLD, 20));
//                result.setForeground(Color.WHITE);
//                break;
//
//        }
//
//    }

}
