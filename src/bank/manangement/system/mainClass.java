package bank.manangement.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainClass extends JFrame implements ActionListener {
    JButton b1, b2, b3, b4, b5, b6, b7;
    String pin;

    mainClass(String pin) {

        this.pin = pin;

        ImageIcon imageIconFirst = new ImageIcon(ClassLoader.getSystemResource("icon/atm.png"));
        Image imageIconTwo = imageIconFirst.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon imageIconThree = new ImageIcon(imageIconTwo);
        JLabel label = new JLabel(imageIconThree);
        label.setBounds(0, 0, 1550, 830);
        add(label);

        JLabel label1 = new JLabel("PLEASE SELECT YOUR TRANSACTION");
        label1.setBounds(415, 180, 700, 35);
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System", Font.BOLD, 23));
        label.add(label1);
        this.b1 = new JButton("DEPOSIT");
        this.b1.setForeground(Color.DARK_GRAY);
        this.b1.setBackground(new Color(255, 255, 255));
        this.b1.setBounds(410, 274, 150, 35);
        this.b1.addActionListener(this);
        label.add(this.b1);
        this.b2 = new JButton("CASH WITHDRAWAL");
        this.b2.setForeground(Color.DARK_GRAY);
        this.b2.setBackground(new Color(255, 255, 255));
        this.b2.setBounds(700, 274, 150, 35);
        this.b2.addActionListener(this);
        label.add(this.b2);
        this.b3 = new JButton("FAST CASH");
        this.b3.setForeground(Color.DARK_GRAY);
        this.b3.setBackground(new Color(255, 255, 255));
        this.b3.setBounds(410, 318, 150, 35);
        this.b3.addActionListener(this);
        label.add(this.b3);
        this.b4 = new JButton("MINI STATEMENT");
        this.b4.setForeground(Color.DARK_GRAY);
        this.b4.setBackground(new Color(255, 255, 255));
        this.b4.setBounds(700, 318, 150, 35);
        this.b4.addActionListener(this);
        label.add(this.b4);
        this.b5 = new JButton("PIN CHANGE");
        this.b5.setForeground(Color.DARK_GRAY);
        this.b5.setBackground(new Color(255, 255, 255));
        this.b5.setBounds(410, 362, 150, 35);
        this.b5.addActionListener(this);
        label.add(this.b5);
        this.b6 = new JButton("BALANCE ENQUIRY");
        this.b6.setForeground(Color.DARK_GRAY);
        this.b6.setBackground(new Color(255, 255, 255));
        this.b6.setBounds(700, 362, 150, 35);
        this.b6.addActionListener(this);
        label.add(this.b6);
        this.b7 = new JButton("EXIT");
        this.b7.setForeground(Color.DARK_GRAY);
        this.b7.setBackground(new Color(255, 255, 255));
        this.b7.setBounds(700, 406, 150, 35);
        this.b7.addActionListener(this);
        label.add(this.b7);

        setLayout(null);
        setSize(1550, 1080);
        setLocation(0, 0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            new Deposit(pin);
            setVisible(false);
        } else if (e.getSource() == b7) {
            System.exit(0);
        } else if (e.getSource() == b2) {
            new Withdrawal(pin);
            setVisible(false);
        } else if (e.getSource() == b6) {
            new BalanceEnquire(pin);
            setVisible(false);
        } else if (e.getSource() == b3) {
            new FastCash(pin);
            setVisible(false);
        } else if (e.getSource() == b5) {
            new ChangePin(pin);
            setVisible(false);
        } else if (e.getSource() == b4) {
            new Mini(pin);
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new mainClass("");
    }


}
