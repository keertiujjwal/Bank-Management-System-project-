package bank.management.system;

import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main_Class extends JFrame implements ActionListener {

    JButton b1,b2,b3,b4,b5,b6,b7;

    String pin;

    main_Class(String pin){

        this.pin = pin;

        super("Transaction System");

        ImageIcon i1  =  new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1400,690,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0,0,1400,690);
        add(l1);

        JLabel label = new JLabel("Please Select Your Transaction");
        label.setBounds(390,140,700,35);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("System",Font.BOLD,24));
        l1.add(label);

        b1 = new JButton("DEPOSIT");
        b1.setForeground(Color.WHITE);
        b1.setBackground(new Color(65,125,128));
        b1.setBounds(375,225,105,27);
        b1.addActionListener(this);
        l1.add(b1);

        b2 = new JButton("CASH WITHDRAW");
        b2.setForeground(Color.WHITE);
        b2.setBackground(new Color(65,125,128));
        b2.setBounds(620,225,140,27);
        b2.addActionListener(this);
        l1.add(b2);

        b3 = new JButton("FAST CASH");
        b3.setForeground(Color.WHITE);
        b3.setBackground(new Color(65,125,128));
        b3.setBounds(375,264,105,27);
        b3.addActionListener(this);
        l1.add(b3);

        b4 = new JButton("MINI STATEMENT");
        b4.setForeground(Color.WHITE);
        b4.setBackground(new Color(65,125,128));
        b4.setBounds(620,264,140,27);
        b4.addActionListener(this);
        l1.add(b4);

        b5 = new JButton("PIN CHANGE");
        b5.setForeground(Color.WHITE);
        b5.setBackground(new Color(65,125,128));
        b5.setBounds(375,303,105,27);
        b5.addActionListener(this);
        l1.add(b5);

        b6 = new JButton("BALANCE ENQiERY");
        b6.setForeground(Color.WHITE);
        b6.setBackground(new Color(65,125,128));
        b6.setBounds(620,303,140,27);
        b6.addActionListener(this);
        l1.add(b6);

        b7 = new JButton("EXIT");
        b7.setForeground(Color.WHITE);
        b7.setBackground(new Color(65,125,128));
        b7.setBounds(375,342,105,27);
        b7.addActionListener(this);
        l1.add(b7);

        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==b1){
            new Deposit(pin);
            setVisible(false);
        } else if (e.getSource()==b7){
            System.exit(0);
        } else if (e.getSource()==b2){
            new Withdrawal(pin);
            setVisible(false);
        } else if (e.getSource()==b6){
            new Enquery(pin);
            setVisible(false);
        } else if (e.getSource()==b3){
            new fast_Cash(pin);
            setVisible(false);
        } else if (e.getSource()==b5){
            new change_Pin(pin);
            setVisible(false);
        } else if (e.getSource()==b4){
            new Mini(pin);
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new main_Class("");
    }
}
