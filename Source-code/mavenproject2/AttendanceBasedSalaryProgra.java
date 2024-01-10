/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AttendanceBasedSalaryProgra extends JFrame {
    JLabel employeeLabel, daysWorkedLabel, ratePerDayLabel, totalSalaryLabel;
    JTextField employeeField, daysWorkedField, ratePerDayField, totalSalaryField;
    JButton calculateButton, clearButton;

    public AttendanceBasedSalaryProgra() {
        setTitle("Attendance-Based Salary Program");
        setSize(400, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        employeeLabel = new JLabel("Employee Name:");
        daysWorkedLabel = new JLabel("Days Worked:");
        ratePerDayLabel = new JLabel("Rate per Day:");
        totalSalaryLabel = new JLabel("Total Salary:");

        employeeField = new JTextField(10);
        daysWorkedField = new JTextField(5);
        ratePerDayField = new JTextField(5);
        totalSalaryField = new JTextField(10);
        totalSalaryField.setEditable(false);

        calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int daysWorked = Integer.parseInt(daysWorkedField.getText());
                double ratePerDay = Double.parseDouble(ratePerDayField.getText());
                double totalSalary = daysWorked * ratePerDay;
                totalSalaryField.setText(Double.toString(totalSalary));
            }
        });

        clearButton = new JButton("Clear");
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                employeeField.setText("");
                daysWorkedField.setText("");
                ratePerDayField.setText("");
                totalSalaryField.setText("");
            }
        });

        JPanel panel = new JPanel(new GridLayout(5, 2));
        panel.add(employeeLabel);
        panel.add(employeeField);
        panel.add(daysWorkedLabel);
        panel.add(daysWorkedField);
        panel.add(ratePerDayLabel);
        panel.add(ratePerDayField);
        panel.add(totalSalaryLabel);
        panel.add(totalSalaryField);
        panel.add(calculateButton);
        panel.add(clearButton);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
     AttendanceBasedSalaryProgram a=   new AttendanceBasedSalaryProgram();
    }
}
