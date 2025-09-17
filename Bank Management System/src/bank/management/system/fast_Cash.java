package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class fast_Cash extends JFrame implements ActionListener {

    JButton b1,b2,b3,b4,b5,b6,b7;

    String pin;

    fast_Cash(String pin){

        this.pin = pin;

        ImageIcon i1  =  new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1400,690,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0,0,1400,690);
        add(l1);

        JLabel label = new JLabel("SELECT WITHDRAWAL AMOUNT...");
        label.setBounds(415,140,700,32);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("System",Font.BOLD,18));
        l1.add(label);

        b1 = new JButton("Ru. 100");
        b1.setForeground(Color.WHITE);
        b1.setBackground(new Color(65,125,128));
        b1.setBounds(375,225,105,27);
        b1.addActionListener(this);
        l1.add(b1);

        b2 = new JButton("Ru. 500");
        b2.setForeground(Color.WHITE);
        b2.setBackground(new Color(65,125,128));
        b2.setBounds(620,225,140,27);
        b2.addActionListener(this);
        l1.add(b2);

        b3 = new JButton("Ru. 1000");
        b3.setForeground(Color.WHITE);
        b3.setBackground(new Color(65,125,128));
        b3.setBounds(375,264,105,27);
        b3.addActionListener(this);
        l1.add(b3);

        b4 = new JButton("Ru. 2000");
        b4.setForeground(Color.WHITE);
        b4.setBackground(new Color(65,125,128));
        b4.setBounds(620,264,140,27);
        b4.addActionListener(this);
        l1.add(b4);

        b5 = new JButton("Ru. 5000");
        b5.setForeground(Color.WHITE);
        b5.setBackground(new Color(65,125,128));
        b5.setBounds(375,303,105,27);
        b5.addActionListener(this);
        l1.add(b5);

        b6 = new JButton("Ru. 10000");
        b6.setForeground(Color.WHITE);
        b6.setBackground(new Color(65,125,128));
        b6.setBounds(620,303,140,27);
        b6.addActionListener(this);
        l1.add(b6);

        b7 = new JButton("BACK");
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
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b7) {
            setVisible(false);
            new main_Class(pin);
        }else {
            String amount = ((JButton) e.getSource()).getText().substring(4);
            Conn c = new Conn();
            Date date = new Date();
            try {
                ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '" + pin + "'");
                int balance = 0;
                while (resultSet.next()) {
                    if (resultSet.getString("type").equals("Deposit")) {
                        balance += Integer.parseInt(resultSet.getString("amount"));
                    } else {
                        balance -= Integer.parseInt(resultSet.getString("amount"));
                    }
                }

                if (e.getSource() != b7 && balance < Integer.parseInt(amount)) {
                    JOptionPane.showMessageDialog(null, "Insufficient Balance");
                    return;
                }

                c.statement.executeUpdate("insert into bank values('" + pin + "','" + date + "', 'Withdrawal', '" + amount + "')");
                JOptionPane.showMessageDialog(null, "Rs. " + amount + " Debited Successfully");
            } catch (Exception E) {
                E.printStackTrace();
            }
            setVisible(false);
            new main_Class(pin);
        }
    }

    public static void main(String[] args) {
        new fast_Cash("");
    }
}
