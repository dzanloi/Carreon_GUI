package OrderingSystem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OrderSystem extends JFrame {
    private javax.swing.JPanel JPanel;
    private JCheckBox pizzaCheckBox;
    private JCheckBox friesCheckBox;
    private JCheckBox softDrinksCheckBox;
    private JCheckBox teaCheckBox;
    private JCheckBox sundaeCheckBox;
    private JButton button1;
    private JRadioButton noneRadioButton;
    private JRadioButton a5OffRadioButton;
    private JRadioButton a10OffRadioButton;
    private JRadioButton a15OffRadioButton;
    private JCheckBox burgerCheckBox;

    public OrderSystem() {
        button1.addActionListener(e ->  {
            double sum = 0;
            if (pizzaCheckBox.isSelected()) {
                sum += 100;
            }if (burgerCheckBox.isSelected()) {
                sum += 80;
            }if (friesCheckBox.isSelected()) {
                sum += 65;
            }if (softDrinksCheckBox.isSelected()) {
                sum += 55;
            }if (teaCheckBox.isSelected()) {
                sum += 50;
            }if (sundaeCheckBox.isSelected()) {
                sum += 40;
            }

            float result = (float) sum;
            float resultest = (float) sum;
            if(a5OffRadioButton.isSelected()) {
                result = (float) (sum * 0.05);
                resultest = (float) (sum - result);
            }if(a10OffRadioButton.isSelected()) {
                result = (float) (sum * 0.10);
                resultest = (float) (sum - result);
            }if(a15OffRadioButton.isSelected()) {
                result = (float) (sum * 0.15);
                resultest = (float) (sum - result);
            }

            JOptionPane.showMessageDialog(this, "The total price is Php " + resultest);
        });
    }

    public static void main(String[] args) {
        OrderSystem os = new OrderSystem();
        os.setContentPane(os.JPanel);
        os.setTitle("Food Ordering System");
        os.setSize(350, 400);
        os.setDefaultCloseOperation(EXIT_ON_CLOSE);
        os.setVisible(true);
    }
}
