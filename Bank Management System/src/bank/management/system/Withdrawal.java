package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class Withdrawal extends JFrame implements ActionListener {

    TextField withdrawalField;

    String pin;

    JButton withdrawal, back;

    Withdrawal(String pin){
        this.pin = pin;

        ImageIcon i1  =  new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1400,690,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0,0,1400,690);
        add(l1);

        JLabel label1 = new JLabel("ENTER THE WITHDRAWAL AMOUNT.");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System", Font.BOLD, 16));
        label1.setBounds(425,140,400,35);
        l1.add(label1);

        JLabel label2 = new JLabel("(Maximum withdrawal limit is 10,000 ru only)");
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("System", Font.BOLD, 12));
        label2.setBounds(438,166,400,35);
        l1.add(label2);

        withdrawalField = new TextField();
        withdrawalField.setBackground(new Color(65,125,128));
        withdrawalField.setForeground(Color.WHITE);
        withdrawalField.setBounds(452,210,220,25);
        withdrawalField.setFont(new Font("Raleway", Font.BOLD,16));
        l1.add(withdrawalField);

        withdrawal = new JButton("WITHDRAWAL");
        withdrawal.setBounds(630,305,120,25);
        withdrawal.setBackground(new Color(65,125,128));
        withdrawal.setForeground(Color.WHITE);
        withdrawal.addActionListener(this);
        l1.add(withdrawal);

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
        if (e.getSource()==withdrawal){
            try {
                String amount = withdrawalField.getText();
                Date date = new Date();
                if (withdrawalField.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please enter the Amount you want to withdraw");
                } else {
                    Conn c = new Conn();
                    ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '" + pin + "'");
                    int balance = 0;
                    while (resultSet.next()) {
                        if (resultSet.getString("type").equals("Deposit")) {
                            balance += Integer.parseInt(resultSet.getString("amount"));
                        } else {
                            balance -= Integer.parseInt(resultSet.getString("amount"));
                        }
                    }
                    if (balance < Integer.parseInt(amount)) {
                        JOptionPane.showMessageDialog(null, "Insufficient Balance");
                        return;
                    }
                    c.statement.executeUpdate("insert into bank values('" + pin + "', '" + date + "', 'Withdrawal', '" + amount + "' )");
                    JOptionPane.showMessageDialog(null, "Rs. " + amount + " Debited Successfully");
                    setVisible(false);
                    new main_Class(pin);
                }
            } catch (Exception E) {
            }
        }else if(e.getSource()==back){
            setVisible(false);
            new main_Class(pin);
        }
    }

    public static void main(String[] args) {
        new Withdrawal("");
    }
}
