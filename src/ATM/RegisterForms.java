package ATM;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class RegisterForms extends JFrame{
    private JButton REGISTERButton;
    protected JPanel RegisterPanel;
    private JButton haveAccountbtn;
    private JLabel headerPicture;
    private javax.swing.JPanel JDisplayreg;
    private JPanel JButtons;
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
    private JPanel JReceipt;
    private JTextPane ReceiptDisplay;
    private JLabel receiptLabel;
    private JPanel registerDisplay;
    public boolean trigger = true;

    private JPasswordField pinFieldreg;
    private JPasswordField reEnterPin;
    BevelBorder bevelBorder = new BevelBorder(BevelBorder.LOWERED, Color.black, Color.white);

    // if true ang parameter, meaning mo show siya, because this will be called if the register button is pressed
    public RegisterForms(boolean visibility) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(screenSize.width, screenSize.height);
        setContentPane(RegisterPanel);
        setResizable(false);
        setUndecorated(true);
        setLocationRelativeTo(null);
        setVisible(visibility);

        setLightmode();

        haveAccountbtn.addActionListener(e ->  {
            setVisible(false);
        });
        REGISTERButton.addActionListener(e ->  {
            try {
                FileWriter file=new FileWriter("database.txt");
                String PIN = pinFieldreg.getText();
                String PIN2 = reEnterPin.getText();
                //TO DO: ig press sa register kay mo write ang PIN ug PIN2 sa database.txt

                JOptionPane.showMessageDialog(this, "Account successfully registered");
                dispose();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        darkmode.addActionListener(e -> {
            if (trigger) {
                setDarkmode(true);
                trigger = false;
            } else {
                setLightmode(false);
                trigger = true;
            }
        });
        //TO DO: Add more listener each button

        exitbtn.addActionListener(e ->  {
            System.exit(0);
        });
    }


    public void setDarkmode(boolean variable) {
        BevelBorder bevbord = new BevelBorder(BevelBorder.LOWERED, Color.lightGray, Color.white);
        RegisterPanel.setBackground(Color.DARK_GRAY);
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
        RegisterPanel.setBackground(Color.white);
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
        RegisterPanel.setBackground(Color.white);
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

    private void createUIComponents() {
        // TODO: place custom component creation code here
        headerPicture = new JLabel(new ImageIcon("punjab.png"));
    }

//    @Override
//    public void createUIComponents() {
//        super.createUIComponents();
//    }
}
