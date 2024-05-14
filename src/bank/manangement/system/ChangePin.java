package bank.manangement.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangePin extends JFrame implements ActionListener {

    private final JButton b1, b2;
    private final JPasswordField jPasswordFieldOne, jPasswordFieldTwo;
    String pin;

    ChangePin(String pin) {
        this.pin = pin;
        ImageIcon imageIconFirst = new ImageIcon(ClassLoader.getSystemResource("icon/atm.png"));
        Image imageIconTwo = imageIconFirst.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon imageIconThree = new ImageIcon(imageIconTwo);
        JLabel label = new JLabel(imageIconThree);
        label.setBounds(0, 0, 1550, 830);
        add(label);

        JLabel label1 = new JLabel("CHANGE YOUR PIN");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System", Font.BOLD, 16));
        label1.setBounds(430, 180, 150, 35);
        label.add(label1);

        JLabel label2 = new JLabel("NEW PIN: ");
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("System", Font.BOLD, 16));
        label2.setBounds(430, 220, 400, 35);
        label.add(label2);

        jPasswordFieldOne = new JPasswordField();
        this.jPasswordFieldOne.setBackground(new Color(255, 255, 255));
        this.jPasswordFieldOne.setForeground(Color.DARK_GRAY);
        this.jPasswordFieldOne.setBounds(600, 220, 180, 25);
        this.jPasswordFieldOne.setFont(new Font("Raleway", 1, 22));
        label.add(this.jPasswordFieldOne);

        JLabel label3 = new JLabel("RE-ENTER NEW PIN: ");
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("System", Font.BOLD, 16));
        label3.setBounds(430, 255, 200, 35);
        label.add(label3);

        jPasswordFieldTwo = new JPasswordField();
        this.jPasswordFieldTwo.setBackground(new Color(255, 255, 255));
        this.jPasswordFieldTwo.setForeground(Color.DARK_GRAY);
        this.jPasswordFieldTwo.setBounds(600, 255, 180, 25);
        this.jPasswordFieldTwo.setFont(new Font("Raleway", 1, 22));
        label.add(this.jPasswordFieldTwo);

        this.b1 = new JButton("CHANGE");
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


        setSize(1550, 1080);
        setLayout(null);
        setLocation(0, 0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String pinOne = jPasswordFieldOne.getText();
            String pinTwo = jPasswordFieldTwo.getText();

            if (!pinOne.equals(pinTwo)) {
                JOptionPane.showMessageDialog(null, "Enter PIN does not match");
                return;
            }
            if (e.getSource() == b1) {
                if (jPasswordFieldOne.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Enter New PIN");
                    return;
                }
                if (jPasswordFieldTwo.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Re-Enter New PIN");
                    return;
                }
                ConnectionSql c = new ConnectionSql();
                String q1 = "update bank set Pin = '" + pinOne + "' where Pin = '" + pin + "' ";
                String q2 = "update login set Pin = '" + pinOne + "' where Pin = '" + pin + "' ";
                String q3 = "update signupfinal set Pin = '" + pinOne + "' where Pin = '" + pin + "' ";

                c.statement.executeUpdate(q1);
                c.statement.executeUpdate(q2);
                c.statement.executeUpdate(q3);

                JOptionPane.showMessageDialog(null, "PIN changed successfully");
                setVisible(false);
                new mainClass(pin);
            } else if (e.getSource() == b2) {
                new mainClass(pin);
                setVisible(false);
            }
        } catch (Exception E) {
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new ChangePin("");
    }
}
