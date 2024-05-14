package bank.manangement.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignUp extends JFrame implements ActionListener {
    JRadioButton selectMale, selectFemale, selectYes, selectNo;
    JButton nextButton;
    JTextField textName, textFamilyName, textEmail, textAddress, textCity, textPin, textState;
    JDateChooser dateChooser;
    Random ran = new Random();
    long mathEx = (ran.nextLong() % 9000L) + 1000L;
    String first = " " + Math.abs(mathEx);

    SignUp() {
        super("APPLICATION FORM");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel imageBank = new JLabel(i3);
        imageBank.setBounds(20, 10, 100, 100);
        add(imageBank);

        JLabel jLabel = new JLabel("APPLICATION FORM NO." + first);
        jLabel.setForeground(Color.WHITE);
        jLabel.setBounds(160, 20, 600, 40);
        jLabel.setFont(new Font("Raleway", Font.BOLD, 38));
        add(jLabel);

        JLabel jLabel1 = new JLabel("Page 1");
        jLabel1.setForeground(Color.WHITE);
        jLabel1.setFont(new Font("Raleway", Font.BOLD, 28));
        jLabel1.setBounds(350, 70, 600, 35);
        add(jLabel1);

        JLabel jLabel2 = new JLabel("Personal Details");
        jLabel2.setForeground(Color.WHITE);
        jLabel2.setFont(new Font("Raleway", Font.BOLD, 22));
        jLabel2.setBounds(310, 110, 600, 30);
        add(jLabel2);

        JLabel labelName = new JLabel("Name");
        labelName.setForeground(Color.WHITE);
        labelName.setFont(new Font("Raleway", Font.BOLD, 22));
        labelName.setBounds(100, 190, 100, 30);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Raleway", Font.BOLD, 14));
        textName.setBounds(300, 190, 250, 30);
        add(textName);

        JLabel labelFamilyName = new JLabel("Family Name");
        labelFamilyName.setForeground(Color.WHITE);
        labelFamilyName.setFont(new Font("Raleway", Font.BOLD, 22));
        labelFamilyName.setBounds(100, 240, 150, 30);
        add(labelFamilyName);

        textFamilyName = new JTextField();
        textFamilyName.setFont(new Font("Raleway", Font.BOLD, 14));
        textFamilyName.setBounds(300, 240, 250, 30);
        add(textFamilyName);

        JLabel dateOfBirth = new JLabel("Date of Birth");
        dateOfBirth.setForeground(Color.WHITE);
        dateOfBirth.setFont(new Font("Raleway", Font.BOLD, 22));
        dateOfBirth.setBounds(100, 340, 200, 30);
        add(dateOfBirth);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105, 105, 105));
        dateChooser.setBounds(300, 340, 250, 30);
        add(dateChooser);

        JLabel labelGender = new JLabel("Gender");
        labelGender.setForeground(Color.WHITE);
        labelGender.setFont(new Font("Raleway", Font.BOLD, 22));
        labelGender.setBounds(100, 290, 200, 30);
        add(labelGender);

        selectMale = new JRadioButton("Male");
        selectMale.setFont(new Font("Raleway", Font.BOLD, 20));
        selectMale.setBounds(300, 290, 90, 30);
        add(selectMale);

        selectFemale = new JRadioButton("Female");
        selectFemale.setFont(new Font("Raleway", Font.BOLD, 20));
        selectFemale.setBounds(450, 290, 110, 30);
        add(selectFemale);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(selectMale);
        buttonGroup.add(selectFemale);

        JLabel labelEmail = new JLabel("Email address");
        labelEmail.setForeground(Color.WHITE);
        labelEmail.setFont(new Font("Raleway", Font.BOLD, 22));
        labelEmail.setBounds(100, 390, 200, 30);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway", Font.BOLD, 14));
        textEmail.setBounds(300, 390, 250, 30);
        add(textEmail);

        JLabel labelMaritalStatus = new JLabel("Marital status");
        labelMaritalStatus.setForeground(Color.WHITE);
        labelMaritalStatus.setFont(new Font("Raleway", Font.BOLD, 22));
        labelMaritalStatus.setBounds(100, 440, 200, 30);
        add(labelMaritalStatus);

        selectYes = new JRadioButton("Yes");
        selectYes.setFont(new Font("Raleway", Font.BOLD, 20));
        selectYes.setBounds(300, 440, 90, 30);
        add(selectYes);

        selectNo = new JRadioButton("No");
        selectNo.setFont(new Font("Raleway", Font.BOLD, 20));
        selectNo.setBounds(450, 440, 90, 30);
        add(selectNo);

        ButtonGroup buttonGroupMarital = new ButtonGroup();
        buttonGroupMarital.add(selectYes);
        buttonGroupMarital.add(selectNo);

        JLabel labelAddress = new JLabel("Address");
        labelAddress.setForeground(Color.WHITE);
        labelAddress.setFont(new Font("Raleway", Font.BOLD, 22));
        labelAddress.setBounds(100, 490, 200, 30);
        add(labelAddress);

        textAddress = new JTextField();
        textAddress.setFont(new Font("Raleway", Font.BOLD, 14));
        textAddress.setBounds(300, 490, 250, 30);
        add(textAddress);

        JLabel labelCity = new JLabel("City");
        labelCity.setForeground(Color.WHITE);
        labelCity.setFont(new Font("Raleway", Font.BOLD, 22));
        labelCity.setBounds(100, 540, 200, 30);
        add(labelCity);

        textCity = new JTextField();
        textCity.setFont(new Font("Raleway", Font.BOLD, 14));
        textCity.setBounds(300, 540, 250, 30);
        add(textCity);

        JLabel labelState = new JLabel("State");
        labelState.setForeground(Color.WHITE);
        labelState.setFont(new Font("Raleway", Font.BOLD, 22));
        labelState.setBounds(100, 590, 200, 30);
        add(labelState);

        textState = new JTextField();
        textState.setFont(new Font("Raleway", Font.BOLD, 14));
        textState.setBounds(300, 590, 250, 30);
        add(textState);

        JLabel labelPin = new JLabel("Pin code");
        labelPin.setForeground(Color.WHITE);
        labelPin.setFont(new Font("Raleway", Font.BOLD, 22));
        labelPin.setBounds(100, 640, 200, 30);
        add(labelPin);

        textPin = new JTextField();
        textPin.setFont(new Font("Raleway", Font.BOLD, 14));
        textPin.setBounds(300, 640, 250, 30);
        add(textPin);

        nextButton = new JButton("Next");
        nextButton.setFont(new Font("Raleway", Font.BOLD, 14));
        nextButton.setBackground(Color.BLUE);
        nextButton.setForeground(Color.WHITE);
        nextButton.setBounds(620, 710, 80, 30);
        nextButton.addActionListener(this);
        add(nextButton);

        ImageIcon i21 = new ImageIcon(ClassLoader.getSystemResource("icon/backgr.png"));
        Image i22 = i21.getImage().getScaledInstance(850, 800, Image.SCALE_DEFAULT);
        ImageIcon i23 = new ImageIcon(i22);
        JLabel imageBack = new JLabel(i23);
        imageBack.setBounds(0, 0, 850, 800);
        add(imageBack);

        getContentPane().setBackground(new Color(222, 225, 228));
        setLayout(null);
        setSize(850, 800);
        setLocation(360, 40);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formNo = first;
        String name = textName.getText();
        String familyName = textFamilyName.getText();
        String dateOfBirth = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (selectMale.isSelected()) {
            gender = "Male";
        } else if (selectFemale.isSelected()) {
            gender = "Female";
        }
        String email = textEmail.getText();
        String marital = null;
        if (selectYes.isSelected()) {
            marital = "Married";
        } else if (selectNo.isSelected()) {
            marital = "Unmarried";
        }

        String address = textAddress.getText();
        String city = textCity.getText();
        String state = textState.getText();
        String pinCode = textPin.getText();

        try {
            if (textName.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill all the fields");
            } else {
                ConnectionSql c = new ConnectionSql();
                String q;
                q = "INSERT INTO signup VALUES('" + formNo + "', '" + name + "', '" + familyName + "', '" + dateOfBirth + "', '" + gender + "', '" + email + "', '" + marital + "', '" + address + "', '" + city + "', '" + state + "', '" + pinCode + "' )";
                c.statement.executeUpdate(q);
                new SignUpNext(formNo);
                setVisible(false);
            }
        } catch (Exception E) {
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new SignUp();
    }


}
