package Temperature_Converter;

import javax.swing.*;

public class Converter extends JFrame{
    private JTextField textField1;
    private JComboBox tocb;
    private JComboBox fromcb;
    private JTextField resultField;
    private JButton convertButton;
    private javax.swing.JPanel JPanel;

    public Converter() {
        convertButton.addActionListener(e ->  {
            float temp = Float.parseFloat(textField1.getText());
            float result = 0;

            if(fromcb.getSelectedIndex() == 0 && tocb.getSelectedIndex() == 0) {
                result = temp * (9/5) + 32; //celsius to farenheight
            }if(fromcb.getSelectedIndex() == 0 && tocb.getSelectedIndex() == 1) {
                result = temp; // celcius to celcius
            }if(fromcb.getSelectedIndex() == 0 && tocb.getSelectedIndex() == 2) {
                result = (float) (temp + 273.15); // celcius to kelvin
            }

            if (fromcb.getSelectedIndex() == 1 && tocb.getSelectedIndex() == 0) {
                result = temp; //farenheight to farenheight
            } if(fromcb.getSelectedIndex() == 1 && tocb.getSelectedIndex() == 1) {
                result = 5/9 * temp - 32; // farenheight to celcius
            } if(fromcb.getSelectedIndex() == 1 && tocb.getSelectedIndex() == 2) {
                result = (float) ((temp - 32) * 5/9 + 273.15); // farenheight to kelvin
            }

            if(fromcb.getSelectedIndex() == 2 && tocb.getSelectedIndex() == 0) {
                result = (float) ((temp - 273.15) * 9/5 + 32); //kelvin to farenheight
            }if(fromcb.getSelectedIndex() == 2 && tocb.getSelectedIndex() == 1) {
                result = (float) (temp - 273.15);//kelvin to celcius
            }if(fromcb.getSelectedIndex() == 2 && tocb.getSelectedIndex() == 2) {
                result = temp;//kelvin to kelvin
            }

            resultField.setText(String.valueOf(result));
        });
    }

    public static void main(String[] args) {
        Converter converter = new Converter();
        converter.setContentPane(converter.JPanel);
        converter.setDefaultCloseOperation(EXIT_ON_CLOSE);
        converter.setTitle("Temperature Converter");
        converter.setSize(400, 275);
        converter.setVisible(true);
    }
}
