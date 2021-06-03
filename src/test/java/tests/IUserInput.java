package tests;

import javax.swing.*;

public interface IUserInput {

    double firstNumber = Double.parseDouble(JOptionPane.showInputDialog(null,
            "Write a first number:"));
    double secondNumber = Double.parseDouble(JOptionPane.showInputDialog(null,
            "Write a second number:"));
}
