package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Register2 extends JFrame implements ActionListener {

    JComboBox comboBoxre, comboBoxce, comboBoxin, comboBoxedu, comboBoxocc;

    JTextField textAadhar, textPan;

    JRadioButton r1, r2, r3, r4;

    JButton next;

    String formno;

    Register2(String formno){

        super("Application Form...");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(120,10,100,100);
        add(image);

        this.formno = formno;

        JLabel l1 = new JLabel("Page no. 2");
        l1.setFont(new Font("Raleway", Font.BOLD,19));
        l1.setBounds(300,30,600,40);
        add(l1);

        JLabel l2 = new JLabel("Additional Details...");
        l2.setFont(new Font("Raleway", Font.BOLD,22));
        l2.setBounds(300,60,600,40);
        add(l2);

        JLabel l3 = new JLabel("Religion :");
        l3.setFont(new Font("Raleway",Font.BOLD,18));
        l3.setBounds(150,130,100,28);
        add(l3);

        String religion[] = {"Select religion","Hindu","Muslim","Sikh","Christian","Others..."};
        comboBoxre = new JComboBox(religion);
        comboBoxre.setBackground(new Color(244,235,139));
        comboBoxre.setFont(new Font("Raleway", Font.BOLD,14));
        comboBoxre.setBounds(350, 130, 280, 27);
        add(comboBoxre);

        JLabel l4 = new JLabel("Category :");
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        l4.setBounds(150,180,100,30);
        add(l4);

        String category[] = {"Select category","General","OBC","SC","ST","Others..."};
        comboBoxce = new JComboBox(category);
        comboBoxce.setBackground(new Color(244,235,139));
        comboBoxce.setFont(new Font("Raleway", Font.BOLD,14));
        comboBoxce.setBounds(350, 180, 280, 27);
        add(comboBoxce);

        JLabel l5 = new JLabel("Income :");
        l5.setFont(new Font("Raleway",Font.BOLD,18));
        l5.setBounds(150,230,100,30);
        add(l5);

        String income[] = {"Select yearly income","Null","<1,50,000","<2,50,000","5,00,000","Up to 10,00,000","Above 10,00,000"};
        comboBoxin = new JComboBox(income);
        comboBoxin.setBackground(new Color(244,235,139));
        comboBoxin.setFont(new Font("Raleway", Font.BOLD,14));
        comboBoxin.setBounds(350, 230, 280, 27);
        add(comboBoxin);

        JLabel l6 = new JLabel("Education :");
        l6.setFont(new Font("Raleway",Font.BOLD,18));
        l6.setBounds(150,280,100,30);
        add(l6);

        String edu[] = {"Select education","Uneducated","High school","Intermediate","Graduate","Post graduate","Doctorate", "Others..."};
        comboBoxedu = new JComboBox(edu);
        comboBoxedu.setBackground(new Color(244,235,139));
        comboBoxedu.setFont(new Font("Raleway", Font.BOLD,14));
        comboBoxedu.setBounds(350, 280, 280, 27);
        add(comboBoxedu);

        JLabel l7 = new JLabel("Occupation :");
        l7.setFont(new Font("Raleway",Font.BOLD,18));
        l7.setBounds(150,330,150,30);
        add(l7);

        String occupation[] = {"Select occupation","Salaried","Self-employed","Business","Student","Retired","Others..."};
        comboBoxocc = new JComboBox(occupation);
        comboBoxocc.setBackground(new Color(244,235,139));
        comboBoxocc.setFont(new Font("Raleway", Font.BOLD,14));
        comboBoxocc.setBounds(350, 330, 280, 27);
        add(comboBoxocc);

        JLabel l8 = new JLabel("Aadhar no. :");
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        l8.setBounds(150,380,150,30);
        add(l8);

        textAadhar = new JTextField();
        textAadhar.setFont(new Font("Raleway",Font.BOLD, 14));
        textAadhar.setBackground(new Color(244,235,139));
        textAadhar.setBounds(350, 380,280,27);
        add(textAadhar);

        JLabel l9 = new JLabel("Pan No. :");
        l9.setFont(new Font("Raleway",Font.BOLD,18));
        l9.setBounds(150,425,100,30);
        add(l9);

        textPan = new JTextField();
        textPan.setFont(new Font("Raleway",Font.BOLD, 14));
        textPan.setBackground(new Color(244,235,139));
        textPan.setBounds(350, 425,280,27);
        add(textPan);

        JLabel l10 = new JLabel("Senior citizen :");
        l10.setFont(new Font("Raleway",Font.BOLD,18));
        l10.setBounds(150,465,200,30);
        add(l10);

        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Raleway", Font.BOLD,15));
        r1.setBackground(new Color(244,235,139));
        r1.setBounds(350, 465, 100, 30);
        add(r1);
        r2 = new JRadioButton("No");
        r2.setFont(new Font("Raleway", Font.BOLD,15));
        r2.setBackground(new Color(244,235,139));
        r2.setBounds(450, 465, 100, 30);
        add(r2);
        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(r1);
        bg1.add(r2);

        JLabel l11 = new JLabel("Existing account :");
        l11.setFont(new Font("Raleway",Font.BOLD,18));
        l11.setBounds(150,510,200,30);
        add(l11);

        r3 = new JRadioButton("Yes");
        r3.setFont(new Font("Raleway", Font.BOLD,15));
        r3.setBackground(new Color(244,235,139));
        r3.setBounds(350, 510, 100, 30);
        add(r3);
        r4 = new JRadioButton("No");
        r4.setFont(new Font("Raleway", Font.BOLD,15));
        r4.setBackground(new Color(244,235,139));
        r4.setBounds(450, 510, 100, 30);
        add(r4);
        ButtonGroup bg2 = new ButtonGroup();
        bg2.add(r3);
        bg2.add(r4);

        JLabel l12  = new JLabel("Form no. : ");
        l12.setFont(new Font("Raleway", Font.BOLD, 16));
        l12.setBounds(580, 10,200,40);
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway", Font.BOLD,16));
        l13.setBounds(650,10,100,40);
        add(l13);

        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(590, 600, 100, 28);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);

        setLayout(null);
        setSize(800,700);
        setLocation(270,15);
        getContentPane().setBackground(new Color(244, 235, 139));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String rel = (String) comboBoxre.getSelectedItem();
        String cat = (String) comboBoxce.getSelectedItem();
        String inc = (String) comboBoxin.getSelectedItem();
        String edu = (String) comboBoxedu.getSelectedItem();
        String occ = (String) comboBoxocc.getSelectedItem();

        String adh = textAadhar.getText();
        String pan = textPan.getText();

        String scitizen = "";
        if (r1.isSelected()){
            scitizen = "Yes";
        } else if (r2.isSelected()) {
            scitizen = "No";
        }

        String exAccount = "";
        if (r3.isSelected()){
            exAccount = "yes";
        } else if (r4.isSelected()) {
            exAccount = "No";
        }

        try {
            if (textAadhar.getText().equals("")||textPan.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Please fill all the fields mandate");
            }else {
                Conn conn2 = new Conn();
                String q = "insert into signUp2 values('"+formno+"','"+rel+"','"+cat+"','"+inc+"','"+edu+"','"+occ+"','"+adh+"','"+pan+"','"+scitizen+"','"+exAccount+"')";
                conn2.statement.executeUpdate(q);
                new Register3(formno);
                setVisible(false);
            }

        } catch (Exception E) {
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Register2("");
    }
}
