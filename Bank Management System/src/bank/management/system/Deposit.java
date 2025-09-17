package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {

    TextField textField;

    String pin;

    JButton deposit, back;

    Deposit(String pin){

        super("Deposit System");

        this.pin = pin;

        ImageIcon i1  =  new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1400,690,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0,0,1400,690);
        add(l1);

        JLabel label2 = new JLabel("ENETR AMOUNT YOU WANT TO DEPOSIT");
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("System", Font.BOLD, 16));
        label2.setBounds(405,140,400,35);
        l1.add(label2);

        textField = new TextField();
        textField.setBackground(new Color(65,125,128));
        textField.setForeground(Color.WHITE);
        textField.setBounds(450,180,220,25);
        textField.setFont(new Font("Raleway", Font.BOLD,22));
        l1.add(textField);

        deposit = new JButton("DEPOSIT");
        deposit.setBounds(630,305,120,25);
        deposit.setBackground(new Color(65,125,128));
        deposit.setForeground(Color.WHITE);
        deposit.addActionListener(this);
        l1.add(deposit);

        back = new JButton("BACK");
        back.setBounds(630,343,120,25);
        back.setBackground(new Color(65,125,128));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        l1.add(back);

        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String amount = textField.getText();
            Date date = new Date();
            if (e.getSource() == deposit){
                if (textField.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Please enter the amount");
                }else {
                    Conn c = new Conn();
                    c.statement.executeUpdate("insert into bank values('"+pin+"', '"+date+"', 'Deposit', '"+amount+"')");
                    JOptionPane.showMessageDialog(null, "Ru. " +amount+ " Deposit successfully");
                    setVisible(false);
                    new main_Class(pin);
                }
            } else if (e.getSource() == back) {
                setVisible(false);
                new main_Class(pin);
            }
        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Deposit("");
    }
}
