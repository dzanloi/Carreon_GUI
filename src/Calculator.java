import javax.swing.*;

public class Calculator extends JFrame{
    private JTextField nameField;
    private javax.swing.JPanel JPanel;
    private JButton SABMETButton;
    private JRadioButton rbm;
    private JRadioButton rbf;
    private JComboBox cb;
    private JTextField textField1;
    private JRadioButton cbc;
    private JRadioButton cbcpp;
    private JRadioButton java;
    private JRadioButton rbs;
    private JRadioButton csharp;
    private JTextArea textarea;


    public Calculator() {
        Calculator c = this;
        SABMETButton.addActionListener(e -> {
            String name = nameField.getText();

            if(name.equals("") || cb.getSelectedIndex() == 0) {

            if(cb.getSelectedIndex() == 0) {
                int opt = JOptionPane.showConfirmDialog(this, "I will set this to CS ha");
                if(opt == JOptionPane.YES_OPTION) {
                    cb.setSelectedIndex(1);
                } else {
                    return;
                }
            }
            if(name.length() == 0) {
                name = JOptionPane.showInputDialog("What is your name?");
                nameField.setText(name);
            }
                textarea.setText("You sabmeted, " + name + "\n");
                textarea.append("Your gender is ");

                if (rbm.isSelected()) {
                    textarea.append("Male\n");
                }
                if (rbf.isSelected()) {
                    textarea.append("Female\n");
                }
                if (rbs.isSelected()) {
                    textarea.append("Unsure\n");
                }

                String prog = (String) cb.getSelectedItem();
                textarea.append("Program is " + prog);

                if(!cbc.isSelected() && !java.isSelected() && !cbcpp.isSelected()) {
                    textarea.append(" and ygvfgvfffvggggfgvfgvfvgvfgvf                                    ou know nothing");
                } else {
                    textarea.append("You know to code: \n");
                    if(cbc.isSelected()) {
                        textarea.append("C\n");
                    }if(java.isSelected()) {
                        textarea.append("Java\n");
                    }if(cbcpp.isSelected()) {
                        textarea.append("C++\n");
                    }
                }
            }
        });
    }

    public static void main(String[] args) {
        Calculator app = new Calculator();
        app.setContentPane(app.JPanel);
        app.setSize(500, 500);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Callyoulater");


    }

}
