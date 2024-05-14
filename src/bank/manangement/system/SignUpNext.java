package bank.manangement.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUpNext extends JFrame implements ActionListener {
    JComboBox comboBox, comboBox2, comboBox3, comboBox4, comboBox5;
    JTextField textCNP, textID;
    JRadioButton r1, r2, e1, e2;
    JButton next;
    String formNo;

    SignUpNext(String formNo) {
        super("APPLICATION FORM");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel imageBank = new JLabel(i3);
        imageBank.setBounds(20, 10, 100, 100);
        add(imageBank);

        this.formNo = formNo;

        JLabel l1 = new JLabel("Page 2 ");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("Raleway", Font.BOLD, 28));
        l1.setBounds(400, 25, 600, 40);
        add(l1);

        JLabel l2 = new JLabel("Additional Details");
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("Raleway", Font.BOLD, 22));
        l2.setBounds(350, 60, 600, 40);
        add(l2);

        JLabel l3 = new JLabel("Religion");
        l3.setForeground(Color.WHITE);
        l3.setFont(new Font("Raleway", Font.BOLD, 18));
        l3.setBounds(100, 120, 100, 30);
        add(l3);

        String[] religion = {"Christian", "Hindu", "Muslim", "Sikh", "Other"};
        comboBox = new JComboBox(religion);
        comboBox.setBackground(new Color(255, 255, 255));
        comboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox.setBounds(350, 120, 320, 30);
        add(comboBox);

        JLabel l4 = new JLabel("Category");
        l4.setForeground(Color.WHITE);
        l4.setFont(new Font("Raleway", Font.BOLD, 18));
        l4.setBounds(100, 170, 100, 30);
        add(l4);

        String[] Category = {"General", "OBC", "SC", "ST", "Other"};
        comboBox2 = new JComboBox(Category);
        comboBox2.setBackground(new Color(255, 255, 255));
        comboBox2.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox2.setBounds(350, 170, 320, 30);
        add(comboBox2);

        JLabel l5 = new JLabel("Income");
        l5.setForeground(Color.WHITE);
        l5.setFont(new Font("Raleway", Font.BOLD, 18));
        l5.setBounds(100, 220, 100, 30);
        add(l5);

        String[] income = {"Null", "<150,000", "<250,000", "500,000", "Up tp 1000,000", "Above 10,00,000"};
        comboBox3 = new JComboBox(income);
        comboBox3.setBackground(new Color(255, 255, 255));
        comboBox3.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox3.setBounds(350, 220, 320, 30);
        add(comboBox3);

        JLabel l6 = new JLabel("Educational");
        l6.setForeground(Color.WHITE);
        l6.setFont(new Font("Raleway", Font.BOLD, 18));
        l6.setBounds(100, 270, 150, 30);
        add(l6);

        String[] educational = {"Non-Graduate", "Graduate", "Post-Graduate", "Doctorate", "Others"};
        comboBox4 = new JComboBox(educational);
        comboBox4.setBackground(new Color(255, 255, 255));
        comboBox4.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox4.setBounds(350, 270, 320, 30);
        add(comboBox4);


        JLabel l7 = new JLabel("Occupation ");
        l7.setForeground(Color.WHITE);
        l7.setFont(new Font("Raleway", Font.BOLD, 18));
        l7.setBounds(100, 340, 150, 30);
        add(l7);

        String[] Occupation = {"Employed", "Self-Employed", "Business", "Student", "Retired", "Other"};
        comboBox5 = new JComboBox(Occupation);
        comboBox5.setBackground(new Color(255, 255, 255));
        comboBox5.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox5.setBounds(350, 340, 320, 30);
        add(comboBox5);

        JLabel l8 = new JLabel("CNP Number ");
        l8.setForeground(Color.WHITE);
        l8.setFont(new Font("Raleway", Font.BOLD, 18));
        l8.setBounds(100, 390, 150, 30);
        add(l8);

        textCNP = new JTextField();
        textCNP.setFont(new Font("Raleway", Font.BOLD, 18));
        textCNP.setBounds(350, 390, 320, 30);
        add(textCNP);

        JLabel l9 = new JLabel("ID Number ");
        l9.setForeground(Color.WHITE);
        l9.setFont(new Font("Raleway", Font.BOLD, 18));
        l9.setBounds(100, 440, 180, 30);
        add(l9);

        textID = new JTextField();
        textID.setFont(new Font("Raleway", Font.BOLD, 18));
        textID.setBounds(350, 440, 320, 30);
        add(textID);


        JLabel l10 = new JLabel("Senior Citizen : ");
        l10.setForeground(Color.WHITE);
        l10.setFont(new Font("Raleway", Font.BOLD, 18));
        l10.setBounds(100, 490, 180, 30);
        add(l10);

        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(new Color(255, 255, 255));
        r1.setBounds(350, 490, 100, 30);
        add(r1);
        r2 = new JRadioButton("No");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBackground(new Color(255, 255, 255));
        r2.setBounds(460, 490, 100, 30);
        add(r2);

        JLabel l11 = new JLabel("Existing Account : ");
        l11.setForeground(Color.WHITE);
        l11.setFont(new Font("Raleway", Font.BOLD, 18));
        l11.setBounds(100, 540, 180, 30);
        add(l11);

        e1 = new JRadioButton("Yes");
        e1.setFont(new Font("Raleway", Font.BOLD, 14));
        e1.setBackground(new Color(255, 255, 255));
        e1.setBounds(350, 540, 100, 30);
        add(e1);
        e2 = new JRadioButton("No");
        e2.setFont(new Font("Raleway", Font.BOLD, 14));
        e2.setBackground(new Color(255, 255, 255));
        e2.setBounds(460, 540, 100, 30);
        add(e2);

        JLabel l12 = new JLabel("Form No : ");
        l12.setForeground(Color.WHITE);
        l12.setFont(new Font("Raleway", Font.BOLD, 14));
        l12.setBounds(700, 10, 100, 30);
        add(l12);

        JLabel l13 = new JLabel(formNo);
        l13.setForeground(Color.WHITE);
        l13.setFont(new Font("Raleway", Font.BOLD, 14));
        l13.setBounds(760, 10, 60, 30);
        add(l13);

        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBackground(Color.BLUE);
        next.setForeground(Color.WHITE);
        next.setBounds(570, 640, 100, 30);
        next.addActionListener(this);
        add(next);

        ImageIcon i21 = new ImageIcon(ClassLoader.getSystemResource("icon/backgr.png"));
        Image i22 = i21.getImage().getScaledInstance(850, 800, Image.SCALE_DEFAULT);
        ImageIcon i23 = new ImageIcon(i22);
        JLabel imageBack = new JLabel(i23);
        imageBack.setBounds(0, 0, 850, 800);
        add(imageBack);

        setLayout(null);
        setSize(850, 750);
        setLocation(450, 80);
        getContentPane().setBackground(new Color(222, 225, 228));
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String rel = (String) comboBox.getSelectedItem();
        String cate = (String) comboBox2.getSelectedItem();
        String inc = (String) comboBox3.getSelectedItem();
        String edu = (String) comboBox4.getSelectedItem();
        String occ = (String) comboBox5.getSelectedItem();

        String cnp = textCNP.getText();
        String id = textID.getText();

        String citizen = " ";
        if ((r1.isSelected())) {
            citizen = "Yes";
        } else if (r2.isSelected()) {
            citizen = "No";
        }
        String eAccount = " ";
        if ((r1.isSelected())) {
            eAccount = "Yes";
        } else if (r2.isSelected()) {
            eAccount = "No";
        }

        try {
            if (textCNP.getText().isEmpty() || textID.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill all the field");
            } else {
                ConnectionSql c = new ConnectionSql();
                String q = "INSERT INTO signupnext VALUES('" + formNo + "', '" + rel + "', '" + cate + "', '" + inc + "', '" + edu + "', '" + occ + "', '" + citizen + "', '" + eAccount + "', '" + cnp + "', '" + id + "')";
                c.statement.executeUpdate(q);
                new SignUpFinal(formNo);
                setVisible(false);
            }
        } catch (Exception E) {
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new SignUpNext("");
    }
}
