package bank.manangement.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class Withdrawal extends JFrame implements ActionListener {
    String pin;
    TextField textField;
    JButton b1, b2;

    Withdrawal(String pin) {
        this.pin = pin;
        ImageIcon imageIconFirst = new ImageIcon(ClassLoader.getSystemResource("icon/atm.png"));
        Image imageIconTwo = imageIconFirst.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon imageIconThree = new ImageIcon(imageIconTwo);
        JLabel label = new JLabel(imageIconThree);
        label.setBounds(0, 0, 1550, 830);
        add(label);

        JLabel label1 = new JLabel("MAXIMUM WITHDRAWAL IS EU.10,000");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System", 1, 16));
        label1.setBounds(460, 180, 700, 35);
        label.add(label1);

        JLabel label2 = new JLabel("PLEASE ENTER YOUR AMOUNT");
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("System", 1, 16));
        label2.setBounds(460, 220, 400, 35);
        label.add(label2);

        this.textField = new TextField();
        this.textField.setBackground(new Color(255, 255, 255));
        this.textField.setForeground(Color.DARK_GRAY);
        this.textField.setBounds(460, 270, 320, 25);
        this.textField.setFont(new Font("Raleway", 1, 22));
        label.add(this.textField);
        this.b1 = new JButton("WITHDRAW");
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
        if (e.getSource() == b1) {
            try {
                String amount = textField.getText();
                Date date = new Date();
                if (textField.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter the amount you want to withdraw");
                } else {
                    ConnectionSql c = new ConnectionSql();
                    ResultSet resultSet = c.statement.executeQuery("select * from bank where Pin = '" + pin + "'");
                    int balance = 0;
                    while (resultSet.next()) {
                        if (resultSet.getString("type").equals("Deposit")) {
                            balance += Integer.parseInt(resultSet.getString("amount"));
                        } else {
                            balance -= Integer.parseInt(resultSet.getString("amount"));
                        }
                    }
                    if (balance < Integer.parseInt(amount)) {
                        JOptionPane.showMessageDialog(null, "Insufficient Balance");
                        return;
                    }
                    c.statement.executeUpdate("insert into bank values ( '" + pin + "', '" + date + "', 'Withdrawal', '" + amount + "' )");
                    JOptionPane.showMessageDialog(null, "EU. " + amount + " Debited Successfully");
                    setVisible(false);
                    new mainClass(pin);
                }
            } catch (Exception E) {
                E.printStackTrace();
            }
        } else if (e.getSource() == b2) {
            setVisible(false);
            new mainClass(pin);
        }
    }

    public static void main(String[] args) {
        new Withdrawal("");
    }
}
