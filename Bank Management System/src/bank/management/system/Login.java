package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {

    JLabel label1,label2,label3;

    public JTextField textField1;

    JPasswordField passwordField2;

    JButton button1, button2, button3;

    //private boolean isPasswordVisible = false;

    Login(){
        super("Bank Management System");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/BG.jpg"));
        Image i2 = i1.getImage().getScaledInstance(850,480, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,850,480);
        add(image);

        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("Icon/bank.png"));
        Image ii2 = ii1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel iimage = new JLabel(ii3);
        iimage.setBounds(350,20,100,100);
        image.add(iimage);

        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("Icon/Card.png"));
        Image iii2 = iii1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel iiimage = new JLabel(iii3);
        iiimage.setBounds(640,320,100,100);
        image.add(iiimage);

        label1 = new JLabel("WELCOME TO ATM");
        label1.setForeground(new Color(6, 237, 243));
        label1.setFont(new Font("AvantGarde",Font.BOLD,35));
        label1.setBounds(240,130,450,40);
        image.add(label1);

        label2 = new JLabel("CARD NO:");
        label2.setFont(new Font("Ralway", Font.BOLD,18));
        label2.setForeground(Color.black);
        label2.setBounds(260, 200, 100, 30);
        image.add(label2);

        textField1 = new JTextField(20);
        textField1.setForeground(Color.BLACK);
        textField1.setBounds(360, 200, 180, 30 );
        textField1.setFont(new Font("Arial", Font.BOLD, 17));
        image.add(textField1);

        label3 = new JLabel("PIN:");
        label3.setFont(new Font("Ralway", Font.BOLD, 18));
        label3.setForeground(Color.BLACK);
        label3.setBounds(260, 240, 100,30);
        image.add(label3);

        passwordField2 = new JPasswordField(20);
        passwordField2.setForeground(Color.BLACK);
        passwordField2.setBounds(360, 240, 180, 30);
        passwordField2.setFont(new Font("Arial", Font.BOLD, 17));
        image.add(passwordField2);

        button1 = new JButton("SIGN IN");
        button1.setFont(new Font("Arial", Font.BOLD, 15));
        button1.setForeground(Color.WHITE);
        button1.setBackground(new Color(18, 48, 99));
        button1.setBounds(260, 290, 120, 30);
        button1.addActionListener(this);
        image.add(button1);

        button2 = new JButton("CLEAR");
        button2.setFont(new Font("Arial", Font.BOLD, 15));
        button2.setForeground(Color.WHITE);
        button2.setBackground(new Color(18, 48, 99));
        button2.setBounds(420, 290, 120, 30);
        button2.addActionListener(this);
        image.add(button2);

        button3 = new JButton("REGISTER");
        button3.setFont(new Font("Arial", Font.BOLD, 15));
        button3.setForeground(Color.WHITE);
        button3.setBackground(new Color(18, 48, 99));
        button3.setBounds(260, 340, 280, 30);
        button3.addActionListener(this);
        image.add(button3);

        setLayout(null);
        setSize(850,480);
        setLocation(280,170);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == button1){
                Conn c = new Conn();
                String cardno = textField1.getText();
                String pin = passwordField2.getText();
                String q = "select * from login where card_no = '"+cardno+"' and pin = '"+pin+"'";
                ResultSet resultSet = c.statement.executeQuery(q);
                if (resultSet.next()){
                    setVisible(false);
                    new main_Class(pin);
                } else {
                    JOptionPane.showMessageDialog(null,"Please Enter Correct Credentials");
                }
            } else if (e.getSource() == button2){
                textField1.setText("");
                passwordField2.setText("");
            } else if (e.getSource() == button3) {
                new Register1();
                setVisible(false);
            }
        } catch (Exception E) {
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
