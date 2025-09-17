package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class change_Pin extends JFrame implements ActionListener {

    JButton change, back;

    JPasswordField p1,p2;

    String pin;

    change_Pin (String pin) {

        this.pin = pin;

        ImageIcon i1  =  new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1400,690,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0,0,1400,690);
        add(l1);

        JLabel label = new JLabel("CHANGE YOUR PIN...");
        label.setBounds(470,140,700,32);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("System",Font.BOLD,16));
        l1.add(label);

        JLabel label1 = new JLabel("New Pin :");
        label1.setBounds(390,195,700,32);
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System",Font.BOLD,15));
        l1.add(label1);

        p1 = new JPasswordField();
        p1.setBackground(new Color(134, 206, 209));
        p1.setForeground(Color.BLACK);
        p1.setBounds(540,195,190,25);
        p1.setFont(new Font("Railway", Font.BOLD,16));
        l1.add(p1);

        JLabel label2 = new JLabel("Re-enter new Pin :");
        label2.setBounds(390,240,700,32);
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("System",Font.BOLD,15));
        l1.add(label2);

        p2 = new JPasswordField();
        p2.setBackground(new Color(134, 206, 209));
        p2.setForeground(Color.BLACK);
        p2.setBounds(540,240,190,25);
        p2.setFont(new Font("Railway", Font.BOLD,16));
        l1.add(p2);

        change = new JButton("CHANGE");
        change.setBounds(630,305,120,25);
        change.setBackground(new Color(65,125,128));
        change.setForeground(Color.WHITE);
        change.addActionListener(this);
        l1.add(change);

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
        try{
            String pin1 = p1.getText();
            String pin2 = p2.getText();

            if (!pin1.equals(pin2)) {
                JOptionPane.showMessageDialog(null, "Pin is mismatch");
                return;
            }
            if (e.getSource()==change) {
                if (p1.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "New pin field can't be empty");
                    return;
                }
                if (p2.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Re-enter new pin field can't be empty");
                    return;
                }

                Conn c = new Conn();
                String q1 = "update bank set pin = '"+pin1+"' where pin = '"+pin+"'";
                String q2 = "update login set pin = '"+pin1+"' where pin = '"+pin+"'";
                String q3 = "update signup3 set pin = '"+pin1+"' where pin = '"+pin+"'";

                c.statement.executeUpdate(q1);
                c.statement.executeUpdate(q2);
                c.statement.executeUpdate(q3);

                JOptionPane.showMessageDialog(null,"Pin change successfully");
                setVisible(false);
                new main_Class(pin);
            } else if (e.getSource()==back) {
                setVisible(false);
                new main_Class(pin);
            }

        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new change_Pin("");
    }
}
