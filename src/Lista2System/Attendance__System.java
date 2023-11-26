package Lista2System;

import javax.swing.*;

public class Attendance__System extends JFrame {

    private javax.swing.JPanel JPanel;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JTextField textField1;

    public static void main(String[] args) {
        Attendance__System attendance = new Attendance__System();
        attendance.setContentPane(attendance.JPanel);
        attendance.setTitle("Library sa CIT");
        attendance.setDefaultCloseOperation(EXIT_ON_CLOSE);
        attendance.setSize(700, 400);
        attendance.setVisible(true);
    }
}
