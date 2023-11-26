package ATM;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class ATM extends JFrame {
    boolean isWrongPin = false;
    String acc;
    private javax.swing.JPanel JPanel;
    private JButton a1Button;
    private JButton a3Button;
    private JButton a2Button;
    private JButton a4Button;
    private JButton a7Button;
    private JButton cancelButton;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a9Button;
    private JButton a8Button;
    private JButton exitbtn;
    private JButton enterButton;
    private JButton darkmode;
    private JButton a0Button;
    private JButton dotbtn;
    private JTextPane ReceiptDisplay;
    private JPanel JButtons;
    private JPanel JReceipt;
    private JPanel JDisplay;
    private JPasswordField pinField;
    private JLabel receiptLabel;
    private JLabel headerPicture;
    private JPanel AfterLoginPanel;
    private JButton depositbtn;
    private JButton exit2;
    private JButton withdrawbtn;
    private JButton backbtn;
    private JButton registerbtn;
    private JTextField textField1;
    public boolean trigger = true;
    private JPanel JPanel3;
    private JButton depositButton;
    private JButton balanceInquiryButton;
    private JButton backButton;
    private JButton exitButton;
    BufferedReader reader;
    BevelBorder bevelBorder = new BevelBorder(BevelBorder.LOWERED, Color.black, Color.white);

    public ATM() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setContentPane(JPanel);
        setTitle("Automated Teller Machine");
        setSize(screenSize.width, screenSize.height);
        setUndecorated(true);
        setVisible(true);

        setLightmode();

        darkmode.addActionListener(e -> {
            if (trigger) {
                setDarkmode(true);
                trigger = false;
            } else {
                setLightmode(false);
                trigger = true;
            }
        });
        a1Button.addActionListener(e -> {
            pinField.setText(pinField.getText() + "1");
        });
        a2Button.addActionListener(e -> {
            pinField.setText(pinField.getText() + "2");
        });
        a3Button.addActionListener(e ->  {
            pinField.setText(pinField.getText() + "3");
        });
        a4Button.addActionListener(e ->  {
            pinField.setText(pinField.getText() + "4");
        });
        a5Button.addActionListener(e ->  {
            pinField.setText(pinField.getText() + "5");
        });
        a6Button.addActionListener(e ->  {
            pinField.setText(pinField.getText() + "6");
        });
        a7Button.addActionListener(e ->  {
            pinField.setText(pinField.getText() + "7");
        });
        a8Button.addActionListener(e ->  {
            pinField.setText(pinField.getText() + "8");
        });
        a9Button.addActionListener(e ->  {
            pinField.setText(pinField.getText() + "9");
        });
        a0Button.addActionListener(e ->  {
            pinField.setText(pinField.getText() + "0");
        });
        dotbtn.addActionListener(e ->  {
            pinField.setText(pinField.getText() + ".");
        });
        cancelButton.addActionListener(e ->  {
            String currentText = pinField.getText();
            if (!currentText.isEmpty()) {
                String newTxt = currentText.substring(0, currentText.length() - 1);
                pinField.setText(newTxt);
            }
        });
        enterButton.addActionListener(e -> {
            try {
                reader = new BufferedReader(new FileReader("C:\\Users\\carre\\IdeaProjects\\Carreon_GUI\\src\\Account.txt"));
                while ((acc = reader.readLine()) != null) {
                    if (acc.equals(new String(pinField.getPassword()))) {
                        setDisplay(isWrongPin);
                        isWrongPin = true;
                    }
                }
                if(!isWrongPin)
                    JOptionPane.showMessageDialog(this, "Wrong pin");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        exitbtn.addActionListener(e -> {
            System.exit(0);
        });
        registerbtn.addActionListener(e ->  {
            //TO FIX. not functional, BETA TEST PA HAHAHAHAHA EXPERIMENT2
            remove(JDisplay);
            RegisterForms register = new RegisterForms(true);

            //TO DO: Make a file reader nga mo read sa database.txt if na ba ang registered PIN didto
        });



         /*************************************BELOW THIS LINE ARE THE LISTENERS FOR THE SECOND FORM*******************/
        exit2.addActionListener(e ->  {
            System.exit(0);
        });
        backbtn.addActionListener(e ->  {
            setDisplay(isWrongPin);
        });
    }

    public void setDisplay(boolean variable) {
        JDisplay.setVisible(variable);
        JReceipt.setVisible(variable);
        JButtons.setVisible(variable);
        AfterLoginPanel.setVisible(!variable);
    }

    public void setDarkmode(boolean variable) {
        BevelBorder bevbord = new BevelBorder(BevelBorder.LOWERED, Color.lightGray, Color.white);
        JPanel.setBackground(Color.DARK_GRAY);
        JReceipt.setBackground(Color.DARK_GRAY);
        ReceiptDisplay.setBackground(Color.LIGHT_GRAY);
        ReceiptDisplay.setForeground(Color.white);
        receiptLabel.setForeground(Color.white);
        JButtons.setForeground(Color.white);
        JButtons.setBackground(Color.black);
        cancelButton.setBorder(bevelBorder);
        exitbtn.setBorder(bevelBorder);
        enterButton.setBorder(bevelBorder);
        a1Button.setBackground(Color.darkGray);
        a1Button.setForeground(Color.white);
        a1Button.setBorder(bevbord);
        a2Button.setBackground(Color.darkGray);
        a2Button.setForeground(Color.white);
        a2Button.setBorder(bevbord);
        a3Button.setBackground(Color.darkGray);
        a3Button.setForeground(Color.white);
        a3Button.setBorder(bevbord);
        a4Button.setBackground(Color.darkGray);
        a4Button.setForeground(Color.white);
        a4Button.setBorder(bevbord);
        a5Button.setBackground(Color.darkGray);
        a5Button.setForeground(Color.white);
        a5Button.setBorder(bevbord);
        a6Button.setBackground(Color.darkGray);
        a6Button.setForeground(Color.white);
        a6Button.setBorder(bevbord);
        a7Button.setBackground(Color.darkGray);
        a7Button.setForeground(Color.white);
        a7Button.setBorder(bevbord);
        a8Button.setBackground(Color.darkGray);
        a8Button.setForeground(Color.white);
        a8Button.setBorder(bevbord);
        a9Button.setBackground(Color.darkGray);
        a9Button.setForeground(Color.white);
        a9Button.setBorder(bevbord);
        a0Button.setBackground(Color.darkGray);
        a0Button.setForeground(Color.white);
        a0Button.setBorder(bevbord);
        darkmode.setBackground(Color.darkGray);
        darkmode.setForeground(Color.white);
        darkmode.setBorder(bevbord);
        dotbtn.setBackground(Color.darkGray);
        dotbtn.setForeground(Color.white);
        dotbtn.setBorder(bevbord);
    }

    public void setLightmode(boolean variable) {
        JPanel.setBackground(Color.white);
        JReceipt.setBackground(Color.white);
        ReceiptDisplay.setForeground(Color.BLACK);
        ReceiptDisplay.setBackground(Color.lightGray);
        receiptLabel.setForeground(Color.blue);
        JButtons.setBackground(Color.gray);
        cancelButton.setBorder(bevelBorder);
        exitbtn.setBorder(bevelBorder);
        enterButton.setBorder(bevelBorder);
        a1Button.setBackground(Color.lightGray);
        a1Button.setForeground(Color.black);
        a1Button.setBorder(bevelBorder);
        a2Button.setBackground(Color.lightGray);
        a2Button.setForeground(Color.black);
        a2Button.setBorder(bevelBorder);
        a3Button.setBackground(Color.lightGray);
        a3Button.setForeground(Color.black);
        a3Button.setBorder(bevelBorder);
        a4Button.setBackground(Color.lightGray);
        a4Button.setForeground(Color.black);
        a4Button.setBorder(bevelBorder);
        a5Button.setBackground(Color.lightGray);
        a5Button.setForeground(Color.black);
        a5Button.setBorder(bevelBorder);
        a6Button.setBackground(Color.lightGray);
        a6Button.setForeground(Color.black);
        a6Button.setBorder(bevelBorder);
        a7Button.setBackground(Color.lightGray);
        a7Button.setForeground(Color.black);
        a7Button.setBorder(bevelBorder);
        a8Button.setBackground(Color.lightGray);
        a8Button.setForeground(Color.black);
        a8Button.setBorder(bevelBorder);
        a9Button.setBackground(Color.lightGray);
        a9Button.setForeground(Color.black);
        a9Button.setBorder(bevelBorder);
        a0Button.setBackground(Color.lightGray);
        a0Button.setForeground(Color.black);
        a0Button.setBorder(bevelBorder);
        darkmode.setBackground(Color.lightGray);
        darkmode.setForeground(Color.black);
        darkmode.setBorder(bevelBorder);
        dotbtn.setBackground(Color.lightGray);
        dotbtn.setForeground(Color.black);
        dotbtn.setBorder(bevelBorder);
    }

    public void setLightmode() {
        JPanel.setBackground(Color.white);
        JReceipt.setBackground(Color.white);
        ReceiptDisplay.setForeground(Color.BLACK);
        ReceiptDisplay.setBackground(Color.lightGray);
        receiptLabel.setForeground(Color.blue);
        JButtons.setBackground(Color.gray);
        cancelButton.setBorder(bevelBorder);
        exitbtn.setBorder(bevelBorder);
        enterButton.setBorder(bevelBorder);
        a1Button.setBackground(Color.lightGray);
        a1Button.setForeground(Color.black);
        a1Button.setBorder(bevelBorder);
        a2Button.setBackground(Color.lightGray);
        a2Button.setForeground(Color.black);
        a2Button.setBorder(bevelBorder);
        a3Button.setBackground(Color.lightGray);
        a3Button.setForeground(Color.black);
        a3Button.setBorder(bevelBorder);
        a4Button.setBackground(Color.lightGray);
        a4Button.setForeground(Color.black);
        a4Button.setBorder(bevelBorder);
        a5Button.setBackground(Color.lightGray);
        a5Button.setForeground(Color.black);
        a5Button.setBorder(bevelBorder);
        a6Button.setBackground(Color.lightGray);
        a6Button.setForeground(Color.black);
        a6Button.setBorder(bevelBorder);
        a7Button.setBackground(Color.lightGray);
        a7Button.setForeground(Color.black);
        a7Button.setBorder(bevelBorder);
        a8Button.setBackground(Color.lightGray);
        a8Button.setForeground(Color.black);
        a8Button.setBorder(bevelBorder);
        a9Button.setBackground(Color.lightGray);
        a9Button.setForeground(Color.black);
        a9Button.setBorder(bevelBorder);
        a0Button.setBackground(Color.lightGray);
        a0Button.setForeground(Color.black);
        a0Button.setBorder(bevelBorder);
        darkmode.setBackground(Color.lightGray);
        darkmode.setForeground(Color.black);
        darkmode.setBorder(bevelBorder);
        dotbtn.setBackground(Color.lightGray);
        dotbtn.setForeground(Color.black);
        dotbtn.setBorder(bevelBorder);
    }


    public static void main(String[] args) {
        ATM atm = new ATM();
    }

    public void createUIComponents() {
        // TODO: place custom component creation code here
        headerPicture = new JLabel(new ImageIcon("punjab.png"));
    }
}