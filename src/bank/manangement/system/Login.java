package bank.manangement.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {
    JLabel jLabel, jLabel1, jLabel2;
    JTextField textField;
    JPasswordField passwordField;
    JButton jButtonSignIn, jButtonClear, jButtonSignUp;

    Login() {
        super("Bank Management System");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel imageBank = new JLabel(i3);
        imageBank.setBounds(380, 10, 100, 100);
        add(imageBank);

        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image i12 = i11.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i13 = new ImageIcon(i12);
        JLabel imageCard = new JLabel(i13);
        imageCard.setBounds(630, 350, 100, 100);
        add(imageCard);

        jLabel = new JLabel("WELCOME TO ATM");
        jLabel.setForeground(Color.WHITE);
        jLabel.setFont(new Font("AvantGarde", Font.BOLD, 38));
        jLabel.setBounds(250, 125, 450, 40);
        add(jLabel);

        jLabel1 = new JLabel("Card No:");
        jLabel1.setFont(new Font("Raleway", Font.BOLD, 28));
        jLabel1.setForeground(Color.WHITE);
        jLabel1.setBounds(150, 190, 375, 30);
        add(jLabel1);

        textField = new JTextField(15);
        textField.setBounds(325, 190, 230, 30);
        textField.setFont(new Font("Arial", Font.BOLD, 14));
        add(textField);

        jLabel2 = new JLabel("PIN: ");
        jLabel2.setFont(new Font("Raleway", Font.BOLD, 28));
        jLabel2.setForeground(Color.WHITE);
        jLabel2.setBounds(150, 250, 375, 30);
        add(jLabel2);

        passwordField = new JPasswordField(15);
        passwordField.setBounds(325, 250, 230, 30);
        passwordField.setFont(new Font("Arial", Font.BOLD, 14));
        add(passwordField);

        jButtonSignIn = new JButton("SIGN IN");
        jButtonSignIn.setFont(new Font("Arial", Font.BOLD, 14));
        jButtonSignIn.setForeground(Color.WHITE);
        jButtonSignIn.setBackground(Color.BLUE);
        jButtonSignIn.setBounds(325, 300, 100, 30);
        jButtonSignIn.addActionListener(this);
        add(jButtonSignIn);

        jButtonClear = new JButton("CLEAR");
        jButtonClear.setFont(new Font("Arial", Font.BOLD, 14));
        jButtonClear.setForeground(Color.WHITE);
        jButtonClear.setBackground(Color.BLUE);
        jButtonClear.setBounds(455, 300, 100, 30);
        jButtonClear.addActionListener(this);
        add(jButtonClear);

        jButtonSignUp = new JButton("SIGN UP");
        jButtonSignUp.setFont(new Font("Arial", Font.BOLD, 14));
        jButtonSignUp.setForeground(Color.WHITE);
        jButtonSignUp.setBackground(Color.BLUE);
        jButtonSignUp.setBounds(325, 350, 230, 30);
        jButtonSignUp.addActionListener(this);
        add(jButtonSignUp);

        ImageIcon i21 = new ImageIcon(ClassLoader.getSystemResource("icon/backgr.png"));
        Image i22 = i21.getImage().getScaledInstance(850, 480, Image.SCALE_DEFAULT);
        ImageIcon i23 = new ImageIcon(i22);
        JLabel imageBack = new JLabel(i23);
        imageBack.setBounds(0, 0, 850, 480);
        add(imageBack);

        setLayout(null);
        setSize(850, 480);
        setLocation(450, 200);
        setUndecorated(true);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == jButtonSignIn) {
                ConnectionSql c = new ConnectionSql();
                String cardNo = textField.getText();
                String pin = passwordField.getText();
                String q = "select * from login where Card_number = '" + cardNo + "' and Pin = '" + pin + "'";
                ResultSet resultSet = c.statement.executeQuery(q);
                if (resultSet.next()) {
                    setVisible(false);
                    new mainClass(pin);
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number or Pin");
                }
            } else if (e.getSource() == jButtonClear) {
                textField.setText("");
                passwordField.setText("");
            } else if (e.getSource() == jButtonSignUp) {
                new SignUp();
                setVisible(false);
            }
        } catch (Exception E) {
            E.printStackTrace();
        }
    }
}