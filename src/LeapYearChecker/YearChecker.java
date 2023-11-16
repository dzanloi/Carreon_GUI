package LeapYearChecker;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class YearChecker extends JFrame {

    private JTextField textField;
    private JButton Button;
    private javax.swing.JPanel JPanel;

    public YearChecker() {
        Button.addActionListener(e ->  {
            int year = Integer.parseInt(textField.getText());

            if(year % 4 == 0) {
                JOptionPane.showMessageDialog(this, "Leap Year");
            } else {
                JOptionPane.showMessageDialog(this, "Not a leap year");
            }
        });
    }

    public static void main(String[] args) {
        YearChecker app = new YearChecker();
        app.setContentPane(app.JPanel);
        app.setSize(325, 150);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Leap Year Checker");
        app.setVisible(true);

    }
}

