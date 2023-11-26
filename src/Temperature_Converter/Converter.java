package Temperature_Converter;

import javax.swing.*;
import java.awt.*;

public class Converter extends JFrame{
    private JTextField textField;
    private JComboBox tocb;
    private JComboBox fromcb;
    private JTextField resultField;
    private JButton convertButton;
    private javax.swing.JPanel JPanel;
    private JButton darkmode;
    private JLabel heading;
    private JLabel convertlbl;
    private JLabel from;
    private JLabel to;
    private JLabel reslbl;
    private boolean trigger = true;

    public Converter() {
        convertButton.addActionListener(e ->  {
            float temp = Float.parseFloat(textField.getText());
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

        darkmode.addActionListener(e ->  {
            if(trigger) {
                getContentPane().setBackground(Color.DARK_GRAY);
                heading.setForeground(Color.white);
                reslbl.setForeground(Color.white);
                to.setForeground(Color.white);
                from.setForeground(Color.white);
                convertlbl.setForeground(Color.white);
                textField.setBackground(Color.LIGHT_GRAY);
                textField.setForeground(Color.black);
                fromcb.setBackground(Color.LIGHT_GRAY);
                fromcb.setForeground(Color.black);
                tocb.setBackground(Color.LIGHT_GRAY);
                tocb.setForeground(Color.black);
                resultField.setBackground(Color.GRAY);
                resultField.setForeground(Color.cyan);
                trigger = false;
            } else {
                getContentPane().setBackground(Color.white);
                heading.setForeground(Color.black);
                reslbl.setForeground(Color.black);
                to.setForeground(Color.black);
                from.setForeground(Color.black);
                convertlbl.setForeground(Color.black);
                textField.setBackground(Color.white);
                textField.setForeground(Color.black);
                fromcb.setBackground(Color.white);
                fromcb.setForeground(Color.black);
                tocb.setBackground(Color.white);
                tocb.setForeground(Color.black);
                resultField.setBackground(Color.white);
                resultField.setForeground(Color.black);
                trigger = true;
            }

        });
    }

    public static void main(String[] args) {
        Converter converter = new Converter();
        converter.setContentPane(converter.JPanel);
        converter.setDefaultCloseOperation(EXIT_ON_CLOSE);
        converter.setTitle("Temperature Converter");
        converter.setSize(400, 375);
        converter.setVisible(true);
    }
}
