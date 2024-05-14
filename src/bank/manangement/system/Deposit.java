package bank.manangement.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {
    String pin;
    TextField textField;
    JButton b1, b2;

    Deposit(String pin) {
        this.pin = pin;
        ImageIcon imageIconFirst = new ImageIcon(ClassLoader.getSystemResource("icon/atm.png"));
        Image imageIconTwo = imageIconFirst.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon imageIconThree = new ImageIcon(imageIconTwo);
        JLabel label = new JLabel(imageIconThree);
        label.setBounds(0, 0, 1550, 830);
        add(label);

        JLabel label1 = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System", Font.BOLD, 16));
        label1.setBounds(460, 180, 400, 35);
        label.add(label1);
        this.textField = new TextField();
        this.textField.setBackground(new Color(255, 255, 255));
        this.textField.setForeground(Color.DARK_GRAY);
        this.textField.setBounds(460, 230, 320, 25);
        this.textField.setFont(new Font("Raleway", Font.BOLD, 22));
        label.add(this.textField);
        this.b1 = new JButton("DEPOSIT");
        this.b1.setBounds(700, 362, 150, 35);
        this.b1.setBackground(new Color(255, 255, 255));
        this.b1.setForeground(Color.DARK_GRAY);
        this.b1.addActionListener(this);
        label.add(this.b1);
        this.b2 = new JButton("BACK");
        this.b2.setBounds(700, 406, 150, 35);
        this.b2.setBackground(new Color(255, 255, 255));
        this.b2.setForeground(Color.DARK_GRAY);
        this.b2.addActionListener(this);
        label.add(this.b2);

        setLayout(null);
        setSize(1550, 1080);
        setLocation(0, 0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String amount = this.textField.getText();
            Date date = new Date();
            if (e.getSource() == this.b1) {
                if (this.textField.getText().isEmpty()) {
                    JOptionPane.showMessageDialog((Component) null, "Please enter the Amount you want to Deposit");

                } else {
                    ConnectionSql c = new ConnectionSql();
                    c.statement.executeUpdate("INSERT INTO bank values ( '" + pin + "','" + date + "','Deposit', '" + amount + "')");
                    JOptionPane.showMessageDialog((Component) null, "EU. " + amount + " Deposited Successfully");
                    this.setVisible(false);
                    new mainClass(pin);
                }
            } else if (e.getSource() == this.b2) {
                setVisible(false);
                new mainClass(pin);
            }
        } catch (Exception E) {
            E.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Deposit("");
    }


}
