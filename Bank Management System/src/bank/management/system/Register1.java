package bank.management.system;

import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Register1 extends JFrame implements ActionListener {

    //String formno;
    JRadioButton r1,r2,r3,m1,m2,m3;
    JButton next;
    JTextField textName, textFname, textEmail, textAdd, textCity, textPin, textState;
    JDateChooser dateChooser;
    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String first = "" + Math.abs(first4);

    Register1(){
        super("Application Form...");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1 = new JLabel("Application Form No:" + first);
        label1.setBounds(250,20,600,40);
        label1.setFont(new Font("Raleway", Font.BOLD, 28));
        add(label1);

        JLabel label2 = new JLabel("Page No. 1");
        label2.setFont(new Font("Raleway", Font.BOLD, 22));
        label2.setBounds(370,60,600,30);
        add(label2);

        JLabel label3 = new JLabel("Personal details");
        label3.setFont(new Font("Raleway",Font.BOLD,22));
        label3.setBounds(340,94,600,30);
        add(label3);

        JLabel labelName = new JLabel("Name :");
        labelName.setFont(new Font("Raleway", Font.BOLD, 20));
        labelName.setBounds(100, 190, 80, 30);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Raleway", Font.BOLD, 14));
        textName.setBounds(350, 190, 330, 30);
        add(textName);

        JLabel labelFname = new JLabel("Father's name :");
        labelFname.setFont(new Font("Raleway", Font.BOLD, 20));
        labelFname.setBounds(100,230,200,30);
        add(labelFname);

        textFname = new JTextField();
        textFname.setFont(new Font("Raleway", Font.BOLD,14));
        textFname.setBounds(350,230,330,30);
        add(textFname);

        JLabel labelDOB = new JLabel("Date of birth :");
        labelDOB.setFont(new Font("Raleway", Font.BOLD, 20));
        labelDOB.setBounds(100,269,250,30);
        add(labelDOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setFont(new Font("Raleway", Font.BOLD, 14));
        dateChooser.setBounds(350, 270,330,30);
        add(dateChooser);

        JLabel email = new JLabel("Email :");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100,350,100,30);
        add(email);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway", Font.BOLD,14));
        textEmail.setBounds(350, 350, 330,30);
        add(textEmail);

        JLabel gender = new JLabel("Gender :");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100,308, 100,30);
        add(gender);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway", Font.BOLD,14));
        r1.setBackground(new Color(222, 255, 228));
        r1.setBounds(350, 310, 80, 30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBackground(new Color(222, 255, 228));
        r2.setBounds(464, 310, 100, 30);
        add(r2);

        r3 = new JRadioButton("Other...");
        r3.setFont(new Font("Raleway", Font.BOLD, 14));
        r3.setBackground(new Color(222, 255, 228));
        r3.setBounds(598, 310, 100, 30);
        add(r3);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);

        JLabel ms = new JLabel("Marital status :");
        ms.setFont(new Font("Raleway", Font.BOLD, 20));
        ms.setBounds(100,393,200,30);
        add(ms);

        m1 = new JRadioButton("Married");
        m1.setFont(new Font("Raleway", Font.BOLD,14));
        m1.setBackground(new Color(222,255,228));
        m1.setBounds(350, 393, 80,30);
        add(m1);

        m2 = new JRadioButton("Unmarried");
        m2.setFont(new Font("Raleway", Font.BOLD,14));
        m2.setBackground(new Color(222,255,228));
        m2.setBounds(464, 393, 100,30);
        add(m2);

        m3 = new JRadioButton("Other...");
        m3.setFont(new Font("Raleway", Font.BOLD, 14));
        m3.setBackground(new Color(222,255,228));
        m3.setBounds(598, 393, 80, 30);
        add(m3);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);
        buttonGroup1.add(m3);

        JLabel add = new JLabel("Address :");
        add.setFont(new Font("Raleway", Font.BOLD, 20));
        add.setBounds(100,435,100,30);
        add(add);

        textAdd = new JTextField();
        textAdd.setFont(new Font("Raleway", Font.BOLD,14));
        textAdd.setBounds(350, 435, 330,30);
        add(textAdd);

        JLabel city = new JLabel("City :");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100,478,100,30);
        add(city);

        textCity = new JTextField();
        textCity.setFont(new Font("Raleway", Font.BOLD,14));
        textCity.setBounds(350, 478, 330,30);
        add(textCity);

        JLabel pin = new JLabel("Pin code :");
        pin.setFont(new Font("Raleway", Font.BOLD, 20));
        pin.setBounds(100,520,100,30);
        add(pin);

        textPin = new JTextField();
        textPin.setFont(new Font("Raleway", Font.BOLD,14));
        textPin.setBounds(350, 520, 330,30);
        add(textPin);

        JLabel state = new JLabel("State :");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100, 563, 100, 30);
        add(state);

        textState = new JTextField();
        textState.setFont(new Font("Raleway", Font.BOLD,14));
        textState.setBounds(350, 563, 330, 30);
        add(textState);

        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(580,615,100,30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,710);
        setLocation(280,10);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String formno = first;
        String name = textName.getText();
        String fName = textFname.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;

        if (r1.isSelected()){
            gender = "Male";
        } else if (r2.isSelected()){
            gender = "Female";
        } else if (r3.isSelected()) {
            gender = "Other";
        }
        String email = textEmail.getText();
        String marital = "null";
        if (m1.isSelected()){
            marital = "Married";
        } else if (m2.isSelected()) {
            marital = "Unmarried";
        } else if (m3.isSelected()) {
            marital = "Other";
        }
        String add = textAdd.getText();
        String city = textCity.getText();
        String pin = textPin.getText();
        String state = textState.getText();

        try{
            if (textName.getText().equals("")){
                JOptionPane.showConfirmDialog(null, "Please fill all the fields");
            }else {
                Conn conn1 = new Conn();
                String q = "insert into signUp values('"+formno+"', '"+name+"', '"+fName+"', '"+dob+"','"+gender+"', '"+email+"', '"+marital+"', '"+add+"', '"+city+"', '"+pin+"', '"+state+"')";
                conn1.statement.executeUpdate(q);
                new Register2(formno);
                setVisible(false);
            }
        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Register1();
    }
}
