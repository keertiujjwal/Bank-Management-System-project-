package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Register3 extends JFrame implements ActionListener {

    JComboBox comboBox1;

    JCheckBox c1, c2, c3, c4, c5, c6;

    JButton email, submit, cancel;

    String formno;

    Register3(String formno){

        super("Application Form...");

        this.formno = formno;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(120,10,100,100);
        add(image);

        JLabel l1  = new JLabel("Form no. :");
        l1.setFont(new Font("Raleway", Font.BOLD, 16));
        l1.setBounds(640, 10,200,40);
        add(l1);

        JLabel l13  = new JLabel(formno);
        l13.setFont(new Font("Raleway", Font.BOLD, 16));
        l13.setBounds(710, 10,200,40);
        add(l13);

        JLabel l2 = new JLabel("Page no. 3");
        l2.setFont(new Font("Raleway", Font.BOLD,19));
        l2.setBounds(300,30,600,40);
        add(l2);

        JLabel l3 = new JLabel("Account Details...");
        l3.setFont(new Font("Raleway", Font.BOLD,22));
        l3.setForeground(new Color(56, 80, 80));
        l3.setBounds(300,60,300,40);
        add(l3);

        JLabel l4 = new JLabel("Account type :");
        l4.setFont(new Font("Raleway", Font.BOLD,18));
        l4.setBounds(150,135,129,28);
        add(l4);

        String accountType[]  = {"Choose account type...","Saving account","Current account","Salary account","Fix deposit","Recurrent deposit account"};
        comboBox1 = new JComboBox(accountType);
        comboBox1.setFont(new Font("Raleway",Font.BOLD,15));
        comboBox1.setBackground(new Color(199,232,215));
        comboBox1.setForeground(new Color(56, 80, 80));
        comboBox1.setBounds(360,135,250,25);
        add(comboBox1);

        JLabel l5 = new JLabel("Card number :");
        l5.setFont(new Font("Raleway", Font.BOLD, 18));
        l5.setBounds(150, 190, 150, 28);
        add(l5);

        JLabel l6 = new JLabel("(Your 16-digits card number)");
        l6.setFont(new Font("Raleway", Font.PLAIN, 15));
        l6.setForeground(new Color(60, 62, 62));
        l6.setBounds(90, 210, 250, 28);
        add(l6);

        JLabel l7 = new JLabel("XXXX-XXXX-XXXX-2341");
        l7.setFont(new Font("Raleway", Font.BOLD, 17));
        l7.setForeground(new Color(56, 80, 80));
        l7.setBounds(360, 190, 250, 28);
        add(l7);

        JLabel l8 = new JLabel("(It would appear in your ATM card/check book and statement)");
        l8.setFont(new Font("Raleway", Font.PLAIN, 15));
        l8.setForeground(new Color(60,62,62));
        l8.setBounds(360, 210, 500, 28);
        add(l8);

        JLabel l9 = new JLabel("Pin :");
        l9.setFont(new Font("Raleway", Font.BOLD, 18));
        l9.setBounds(150, 260, 80, 28);
        add(l9);

        JLabel l10 = new JLabel("XXXX");
        l10.setFont(new Font("Raleway", Font.BOLD, 17));
        l10.setForeground(new Color(56, 80, 80));
        l10.setBounds(360, 260, 70, 28);
        add(l10);

        JLabel l11 = new JLabel("(Your 4-digits password)");
        l11.setFont(new Font("Raleway", Font.PLAIN, 15));
        l11.setForeground(new Color(60, 62, 62));
        l11.setBounds(90, 280, 250, 28);
        add(l11);

        JLabel l12 = new JLabel("(You can see your pin by requesting email)");
        l12.setFont(new Font("Raleway", Font.PLAIN, 15));
        l12.setForeground(new Color(60,62,62));
        l12.setBounds(360, 280, 500, 28);
        add(l12);

        email = new JButton("Click here");
        email.setFont(new Font("Raleway", Font.BOLD, 11));
        email.setBounds(662, 280, 90,22);
        email.setBackground(new Color(56, 80, 80));
        email.setForeground(Color.white);
        email.addActionListener(this);
        add(email);

        JLabel l14 = new JLabel("Service required :");
        l14.setFont(new Font("Raleway", Font.BOLD, 18));
        l14.setBounds(150, 340, 200, 28);
        add(l14);

        c1 = new JCheckBox("Atm Card");
        c1.setBackground(new Color(199,232,215));
        c1.setForeground(new Color(56, 80, 80));
        c1.setFont(new Font("Raleway", Font.TYPE1_FONT, 15));
        c1.setBounds(360,340,170,28);
        add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(new Color(199,232,215));
        c2.setForeground(new Color(56, 80, 80));
        c2.setFont(new Font("Raleway", Font.TYPE1_FONT, 15));
        c2.setBounds(530,340,250,28);
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(new Color(199,232,215));
        c3.setForeground(new Color(56, 80, 80));
        c3.setFont(new Font("Raleway", Font.TYPE1_FONT, 15));
        c3.setBounds(360,380,170,28);
        add(c3);

        c4 = new JCheckBox("Check Book");
        c4.setBackground(new Color(199,232,215));
        c4.setForeground(new Color(56, 80, 80));
        c4.setFont(new Font("Raleway", Font.TYPE1_FONT, 15));
        c4.setBounds(530,380,170,28);
        add(c4);

        c5 = new JCheckBox("Email Alerts");
        c5.setBackground(new Color(199,232,215));
        c5.setForeground(new Color(56, 80, 80));
        c5.setFont(new Font("Raleway", Font.TYPE1_FONT, 15));
        c5.setBounds(530,420,170,28);
        add(c5);

        c6 = new JCheckBox("E-Statement");
        c6.setBackground(new Color(199,232,215));
        c6.setForeground(new Color(56, 80, 80));
        c6.setFont(new Font("Raleway", Font.TYPE1_FONT, 15));
        c6.setBounds(360,420,170,28);
        add(c6);

        JCheckBox c7 = new JCheckBox("I here by declares that above entered details correct to the best of my knowledge...", true);
        c7.setBackground(new Color(199,232,215));
        c7.setFont(new Font("Raleway", Font.TYPE1_FONT, 12));
        c7.setBounds(150,480,640,28);
        add(c7);

        submit = new JButton("Submit");
        submit.setFont(new Font("Raleway", Font.BOLD, 15));
        submit.setBounds(300, 540, 90,25);
        submit.setBackground(new Color(56, 80, 80));
        submit.setForeground(Color.white);
        submit.addActionListener(this);
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setFont(new Font("Raleway", Font.BOLD, 15));
        cancel.setBounds(460, 540, 90,25);
        cancel.setBackground(new Color(56, 80, 80));
        cancel.setForeground(Color.white);
        cancel.addActionListener(this);
        add(cancel);

        setLayout(null);
        setSize(865,650);
        setLocation(270,50);
        getContentPane().setBackground(new Color(199, 232, 215));
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String aType = (String) comboBox1.getSelectedItem();

        Random ran = new Random();

        long first7 = (ran.nextLong() % 90000000L) + 1409963000000000L;
        String cardno = "" + Math.abs(first7);

        long first3 = (ran.nextLong() % 9000L) + 1000L;
        String pin = "" + Math.abs(first3);

        String fac  = "";
        if (c1.isSelected()){
            fac = fac+"Atm Card";
        } else if (c2.isSelected()) {
            fac = fac+"Internet Banking";
        } else if (c3.isSelected()) {
            fac = fac+"Mobile Banking";
        } else if (c4.isSelected()) {
            fac = fac+"Check Book";
        } else if (c5.isSelected()) {
            fac = fac+"Email Alerts";
        } else if (c6.isSelected()) {
            fac = fac+"E-Statement";
        }

        try {
            if (e.getSource()==submit){
                if (aType.equals("")){
                    JOptionPane.showMessageDialog(null,"Please fill all the mandate fields");
                }else {
                    Conn conn1 = new Conn();
                    String q1 = "insert into signUp3 values('"+formno+"','"+aType+"','"+cardno+"','"+pin+"','"+fac+"')";
                    String q2 = "insert into login values('"+formno+"','"+cardno+"','"+pin+"')";
                    conn1.statement.executeUpdate(q1);
                    conn1.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null,"card Number : "+cardno+"\n pin : "+pin);
                    new Deposit(pin);
                    setVisible(false);
                }
            } else if (e.getSource()==cancel) {
                System.exit(0);
            }
        } catch (Exception E) {
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Register3("");
    }
}
