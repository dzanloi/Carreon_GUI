package SimpleCalculator;

import javax.swing.*;

public class Calculator extends JFrame{
    private JTextField textField1;
    private JButton computeResultButton;
    private JComboBox cb;
    private JTextField textField2;
    private javax.swing.JPanel JPanel;
    private JTextField result;

    public Calculator() {
        computeResultButton.addActionListener(e ->  {
            int num1 = Integer.parseInt(textField1.getText());
            int num2 = Integer.parseInt(textField2.getText());

            if(cb.getSelectedIndex() == 0) {
                int sum = num1 + num2;
                result.setText(String.valueOf(sum));
            }if(cb.getSelectedIndex() == 1) {
                int difference = num1 - num2;
                result.setText(String.valueOf(difference));
            }if(cb.getSelectedIndex() == 2) {
                int product = num1 * num2;
                result.setText(String.valueOf(product));
            }if(cb.getSelectedIndex() == 3) {
                int quotient = num1 / num2;
                result.setText(String.valueOf(quotient));
            }
        });
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setContentPane(calculator.JPanel);
        calculator.setDefaultCloseOperation(EXIT_ON_CLOSE);
        calculator.setSize(325, 175);
        calculator.setTitle("Simple Calculator");
        calculator.setVisible(true);
    }
}
