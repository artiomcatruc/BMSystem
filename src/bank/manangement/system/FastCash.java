package bank.manangement.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener {
    JButton b1, b2, b3, b4, b5, b6, b7;
    String pin;

    FastCash(String pin) {
        this.pin = pin;
        ImageIcon imageIconFirst = new ImageIcon(ClassLoader.getSystemResource("icon/atm.png"));
        Image imageIconTwo = imageIconFirst.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon imageIconThree = new ImageIcon(imageIconTwo);
        JLabel label = new JLabel(imageIconThree);
        label.setBounds(0, 0, 1550, 830);
        add(label);

        JLabel label1 = new JLabel("SELECT WITHDRAWAL AMOUNT");
        label1.setBounds(445, 180, 700, 35);
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System", Font.BOLD, 23));
        label.add(label1);
        this.b1 = new JButton("EU. 100");
        this.b1.setForeground(Color.DARK_GRAY);
        this.b1.setBackground(new Color(255, 255, 255));
        this.b1.setBounds(410, 274, 150, 35);
        this.b1.addActionListener(this);
        label.add(this.b1);
        this.b2 = new JButton("EU. 500");
        this.b2.setForeground(Color.DARK_GRAY);
        this.b2.setBackground(new Color(255, 255, 255));
        this.b2.setBounds(700, 274, 150, 35);
        this.b2.addActionListener(this);
        label.add(this.b2);
        this.b3 = new JButton("EU. 1000");
        this.b3.setForeground(Color.DARK_GRAY);
        this.b3.setBackground(new Color(255, 255, 255));
        this.b3.setBounds(410, 318, 150, 35);
        this.b3.addActionListener(this);
        label.add(this.b3);
        this.b4 = new JButton("EU. 2000");
        this.b4.setForeground(Color.DARK_GRAY);
        this.b4.setBackground(new Color(255, 255, 255));
        this.b4.setBounds(700, 318, 150, 35);
        this.b4.addActionListener(this);
        label.add(this.b4);
        this.b5 = new JButton("EU. 5000");
        this.b5.setForeground(Color.DARK_GRAY);
        this.b5.setBackground(new Color(255, 255, 255));
        this.b5.setBounds(410, 362, 150, 35);
        this.b5.addActionListener(this);
        label.add(this.b5);
        this.b6 = new JButton("EU. 10000");
        this.b6.setForeground(Color.DARK_GRAY);
        this.b6.setBackground(new Color(255, 255, 255));
        this.b6.setBounds(700, 362, 150, 35);
        this.b6.addActionListener(this);
        label.add(this.b6);
        this.b7 = new JButton("BACK");
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
        if (e.getSource() == b7) {
            setVisible(false);
            new mainClass(pin);
        } else {
            String amount = ((JButton) e.getSource()).getText().substring(4);
            ConnectionSql c = new ConnectionSql();
            Date date = new Date();
            try {
                ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '" + pin + "'");
                int balance = 0;
                while (resultSet.next()) {
                    if (resultSet.getString("type").equals("Deposit")) {
                        balance += Integer.parseInt(resultSet.getString("amount"));
                    } else {
                        balance -= Integer.parseInt(resultSet.getString("amount"));
                    }
                }
                String num = "17";
                if (e.getSource() != b7 && balance < Integer.parseInt(amount)) {
                    JOptionPane.showMessageDialog(null, "Insufficient Balance");
                    return;
                }

                c.statement.executeUpdate("insert into bank values ( '" + pin + "', '" + date + "', 'Withdrawal', '" + amount + "' )");
                JOptionPane.showMessageDialog(null, "EU. " + amount + " Debited Successfully");
            } catch (Exception E) {
                E.printStackTrace();
            }
            setVisible(false);
            new mainClass(pin);
        }
    }

    public static void main(String[] args) {
        new FastCash("");
    }
}
