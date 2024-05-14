package bank.manangement.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BalanceEnquire extends JFrame implements ActionListener {
    JButton b1;
    String pin;

    BalanceEnquire(String pin) {
        this.pin = pin;
        ImageIcon imageIconFirst = new ImageIcon(ClassLoader.getSystemResource("icon/atm.png"));
        Image imageIconTwo = imageIconFirst.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon imageIconThree = new ImageIcon(imageIconTwo);
        JLabel label = new JLabel(imageIconThree);
        label.setBounds(0, 0, 1550, 830);
        add(label);

        JLabel label1 = new JLabel("YOUR CURRENT BALANCE IS EU");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System", Font.BOLD, 16));
        label1.setBounds(430, 180, 700, 35);
        label.add(label1);

        JLabel label2 = new JLabel();
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("System", Font.BOLD, 16));
        label2.setBounds(430, 220, 400, 35);
        label.add(label2);

        this.b1 = new JButton("Back");
        this.b1.setBounds(700, 406, 150, 35);
        this.b1.setBackground(new Color(255, 255, 255));
        this.b1.setForeground(Color.DARK_GRAY);
        this.b1.addActionListener(this);
        label.add(this.b1);

        int balance = 0;
        try {
            ConnectionSql c = new ConnectionSql();
            ResultSet resultSet = c.statement.executeQuery("select * from bank where Pin = '" + pin + "'");
            while (resultSet.next()) {
                if (resultSet.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(resultSet.getString("amount"));
                } else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        label2.setText(" " + balance);

        setLayout(null);
        setSize(1550, 1080);
        setLocation(0, 0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new mainClass(pin);
    }

    public static void main(String[] args) {
        new BalanceEnquire("");
    }
}
