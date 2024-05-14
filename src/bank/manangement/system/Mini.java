package bank.manangement.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Mini extends JFrame implements ActionListener {
    String pin;
    JButton button;

    Mini(String pin) {
        this.pin = pin;
        getContentPane().setBackground(new Color(255, 255, 255));
        setSize(400, 600);
        setLocation(20, 20);
        setLayout(null);

        JLabel jLabelOne = new JLabel();
        jLabelOne.setBounds(20, 140, 400, 200);
        jLabelOne.setForeground(Color.DARK_GRAY);
        add(jLabelOne);

        JLabel jLabelTwo = new JLabel("SOLAR BANK");
        jLabelTwo.setFont(new Font("System", Font.BOLD, 30));
        jLabelTwo.setBounds(90, 20, 250, 25);
        jLabelTwo.setForeground(Color.DARK_GRAY);
        add(jLabelTwo);

        JLabel jLabelThree = new JLabel();
        jLabelThree.setBounds(20, 80, 300, 20);
        jLabelThree.setForeground(Color.DARK_GRAY);
        add(jLabelThree);

        JLabel jLabelFour = new JLabel();
        jLabelFour.setBounds(20, 400, 300, 20);
        jLabelFour.setForeground(Color.DARK_GRAY);
        add(jLabelFour);


        try {
            ConnectionSql c = new ConnectionSql();
            ResultSet resultSet = c.statement.executeQuery("select * from login where Pin = '" + pin + "'");
            while (resultSet.next()) {
                jLabelThree.setText("Card Number: " + resultSet.getString("Card_number").substring(0, 4) + "XXXXXXXX" + resultSet.getString("Card_number").substring(12));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            int balance = 0;
            ConnectionSql c = new ConnectionSql();
            ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '" + pin + "'");
            while (resultSet.next()) {
                jLabelOne.setText(jLabelOne.getText() + "<html>" + resultSet.getString("date") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + resultSet.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + resultSet.getString("amount") + "<br><br><br><html>");

                if (resultSet.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(resultSet.getString("amount"));
                } else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }
            jLabelFour.setText("Your total balance is EU " + balance);
        } catch (Exception e) {
            e.printStackTrace();
        }
        button = new JButton("Exit");
        button.setBounds(20, 500, 100, 25);
        button.addActionListener(this);
        add(button);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
    }

    public static void main(String[] args) {
        new Mini("");
    }
}



