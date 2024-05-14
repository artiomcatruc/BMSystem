package bank.manangement.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignUpFinal extends JFrame implements ActionListener {

    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6;
    JButton s,c;
    String formNo;

    SignUpFinal(String formNo) {
        this.formNo = formNo;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel imageBank = new JLabel(i3);
        imageBank.setBounds(20, 10, 100, 100);
        add(imageBank);

        JLabel l1 = new JLabel("Page 3");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("Raleway",Font.BOLD,28));
        l1.setBounds(320,40,400,40);
        add(l1);

        JLabel l2 = new JLabel("Account Details");
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(280,75,400,40);
        add(l2);

        JLabel l3 = new JLabel("Account Type");
        l3.setForeground(Color.WHITE);
        l3.setFont(new Font("Raleway",Font.BOLD,18));
        l3.setBounds(100,140,200,30);
        add(l3);

        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway",Font.BOLD,16));
        r1.setBackground(new Color(222, 225, 228));
        r1.setBounds(100,180,150,30);
        add(r1);

        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway",Font.BOLD,16));
        r2.setBackground(new Color(222, 225, 228));
        r2.setBounds(350,180,300,30);
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway",Font.BOLD,16));
        r3.setBackground(new Color(222, 225, 228));
        r3.setBounds(100,220,250,30);
        add(r3);

        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway",Font.BOLD,16));
        r4.setBackground(new Color(222, 225, 228));
        r4.setBounds(350,220,250,30);
        add(r4);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);
        buttonGroup.add(r4);

        JLabel l4 = new JLabel("Card Number");
        l4.setForeground(Color.WHITE);
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        l4.setBounds(100,300,200,30);
        add(l4);

        JLabel l5 = new JLabel("(Your 16-digit Card Number)");
        l5.setForeground(Color.WHITE);
        l5.setFont(new Font("Raleway",Font.BOLD,12));
        l5.setBounds(100,330,200,20);
        add(l5);

        JLabel l6 = new JLabel("XXXX-XXXX-XXXX-4841");
        l6.setForeground(Color.WHITE);
        l6.setFont(new Font("Raleway",Font.BOLD,18));
        l6.setBounds(330,300,250,30);
        add(l6);

        JLabel l7 = new JLabel("(It would appear on atm card/cheque Book and Statements)");
        l7.setForeground(Color.WHITE);
        l7.setFont(new Font("Raleway",Font.BOLD,12));
        l7.setBounds(330,330,500,20);
        add(l7);

        JLabel l8 = new JLabel("PIN");
        l8.setForeground(Color.WHITE);
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        l8.setBounds(100,370,200,30);
        add(l8);

        JLabel l9 = new JLabel("XXXX");
        l9.setForeground(Color.WHITE);
        l9.setFont(new Font("Raleway",Font.BOLD,18));
        l9.setBounds(330,370,200,30);
        add(l9);

        JLabel l10 = new JLabel("(4-digit Password)");
        l10.setForeground(Color.WHITE);
        l10.setFont(new Font("Raleway",Font.BOLD,12));
        l10.setBounds(100,400,200,20);
        add(l10);

        JLabel l11 = new JLabel("Services Required");
        l11.setForeground(Color.WHITE);
        l11.setFont(new Font("Raleway",Font.BOLD,18));
        l11.setBounds(100,450,200,30);
        add(l11);

        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(new Color(222, 225, 228));
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBounds(100,500,200,30);
        add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(new Color(222, 225, 228));
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBounds(350,500,200,30);
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(new Color(222, 225, 228));
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBounds(100,550,200,30);
        add(c3);

        c4 = new JCheckBox("EMAIL Alerts");
        c4.setBackground(new Color(222, 225, 228));
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBounds(350,550,200,30);
        add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(new Color(222, 225, 228));
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBounds(100,600,200,30);
        add(c5);

        c6 = new JCheckBox("E-Statement");
        c6.setBackground(new Color(222, 225, 228));
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBounds(350,600,200,30);
        add(c6);

        JCheckBox c7 = new JCheckBox("I here by declares that the above entered details correct to the best of my knowledge.",true);
        c7.setBackground(new Color(222, 225, 228));
        c7.setFont(new Font("Raleway",Font.BOLD,12));
        c7.setBounds(100,680,600,20);
        add(c7);

        JLabel l12 = new JLabel("Form No");
        l12.setForeground(Color.WHITE);
        l12.setFont(new Font("Raleway", Font.BOLD,14));
        l12.setBounds(700,10,100,30);
        add(l12);

        JLabel l13 = new JLabel(formNo);
        l13.setForeground(Color.WHITE);
        l13.setFont(new Font("Raleway", Font.BOLD,14));
        l13.setBounds(760,10,60,30);
        add(l13);


        s = new JButton("Submit");
        s.setFont(new Font("Raleway", Font.BOLD,14));
        s.setBackground(Color.BLUE);
        s.setForeground(Color.WHITE);
        s.setBounds(250,720,100,30);
        s.addActionListener(this);
        add(s);

        c = new JButton("Cancel");
        c.setFont(new Font("Raleway", Font.BOLD,14));
        c.setBackground(Color.BLUE);
        c.setForeground(Color.WHITE);
        c.setBounds(420,720,100,30);
        c.addActionListener(this);
        add(c);

        ImageIcon i21 = new ImageIcon(ClassLoader.getSystemResource("icon/backgr.png"));
        Image i22 = i21.getImage().getScaledInstance(850, 800, Image.SCALE_DEFAULT);
        ImageIcon i23 = new ImageIcon(i22);
        JLabel imageBack = new JLabel(i23);
        imageBack.setBounds(0, 0, 850, 800);
        add(imageBack);

        getContentPane().setBackground(new Color(222, 225, 228));
        setSize(850,800);
        setLayout(null);
        setLocation(400,20);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String atype = null;
        if (r1.isSelected()){
            atype = "Saving Account";
        } else if (r2.isSelected()) {
            atype ="Fixed Deposit Account";
        }else if (r3.isSelected()){
            atype ="Current Account";
        }else if (r4.isSelected()){
            atype = "Recurring Deposit Account";
        }

        Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000L) + 1409963000000000L;
        String cardno = "" + Math.abs(first7);

        long first3 = (ran.nextLong() % 9000L)+ 1000L;
        String pin = "" + Math.abs(first3);

        String fac = "";
        if(c1.isSelected()){
            fac = fac+"ATM CARD ";
        } else if (c2.isSelected()) {
            fac = fac+"Internet Banking";
        } else if (c3.isSelected()) {
            fac = fac+"Mobile Banking";
        } else if (c4.isSelected()) {
            fac = fac+"EMAIL Alerts";
        } else if (c5.isSelected()) {
            fac=fac+"Cheque Book";
        } else if (c6.isSelected()) {
            fac=fac+"E-Statement";
        }

        try {
            if (e.getSource() == s) {
                if (atype.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Fill all the field");
                } else {
                    ConnectionSql c = new ConnectionSql();
                    String q1 = "insert into signupfinal values('"+formNo+"', '"+atype+"','"+cardno+"','"+pin+"','"+fac+"')";
                    String q2 = "insert into login values('" + formNo + "','" + cardno + "','" + pin + "')";
                    c.statement.executeUpdate(q1);
                    c.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null, "Card Number: " + cardno+"\n Pin: " + pin);
                    new Deposit(pin);
                    setVisible(false);
                }
            } else if (e.getSource() == c){
                System.exit(0);
            }
        } catch (Exception E) {
            E.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new SignUpFinal("");
    }
}
