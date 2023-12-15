package Hotel.Management.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class NewCustomer extends JFrame implements ActionListener {

    JLabel date;
    Choice c1;
    JRadioButton genderM,genderF;
    JButton add,back;
    JTextField id_number,nametext,country,deposit;
    JComboBox id;
    NewCustomer(){
        JPanel panel = new JPanel();
        panel.setBounds(5,5,875,498);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);

        JLabel label = new JLabel("NEW CUSTOMER FORM");
        label.setBounds(194,10,300,22);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Tahoma", Font.BOLD ,22));
        panel.add(label);

        JLabel label1 = new JLabel("ID:");
        label1.setBounds(64,70,152,22);
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("Tahoma", Font.BOLD ,14));
        panel.add(label1);


        id = new JComboBox(new String[]{"Passport","Adhar Card","Voter Id","Driving License"});
        id.setBounds(300,70,152,22);
        id.setFont(new Font("Tahoma", Font.PLAIN ,14));
        id.setForeground(Color.BLACK);
        id.setBackground(Color.WHITE);
        panel.add(id);

        JLabel label2 = new JLabel("Number:");
        label2.setBounds(64,110,152,22);
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("Tahoma", Font.BOLD ,14));
        panel.add(label2);


        id_number = new JTextField();
        id_number.setBounds(300,110,152,22);
        id_number.setFont(new Font("Tahoma", Font.PLAIN ,14));
        id_number.setForeground(Color.BLACK);
        id_number.setBackground(Color.WHITE);
        panel.add(id_number);

        JLabel name = new JLabel("Name:");
        name.setBounds(64,150,152,22);
        name.setForeground(Color.WHITE);
        name.setFont(new Font("Tahoma", Font.BOLD ,14));
        panel.add(name);


        nametext = new JTextField();
        nametext.setBounds(300,150,152,22);
        nametext.setFont(new Font("Tahoma", Font.PLAIN ,14));
        nametext.setForeground(Color.BLACK);
        nametext.setBackground(Color.WHITE);
        panel.add(nametext);

        JLabel label3 = new JLabel("GENDER");
        label3.setBounds(64,190,152,22);
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("Tahoma", Font.BOLD ,14));
        panel.add(label3);


        genderM = new JRadioButton("MALE");
        genderM.setBounds(300,190,60,27);
        genderM.setFont(new Font("Tahoma", Font.PLAIN ,14));
        genderM.setForeground(Color.BLACK);
        genderM.setBackground(Color.WHITE);
        panel.add(genderM);

        genderF= new JRadioButton("FEMALE");
        genderF.setBounds(380,190,80,27);
        genderF.setFont(new Font("Tahoma", Font.PLAIN ,14));
        genderF.setForeground(Color.BLACK);
        genderF.setBackground(Color.WHITE);
        panel.add(genderF);

        JLabel label4 = new JLabel("Country:");
        label4.setBounds(64,230,152,22);
        label4.setForeground(Color.WHITE);
        label4.setFont(new Font("Tahoma", Font.BOLD ,14));
        panel.add(label4);

        country = new JTextField();
        country.setBounds(300,230,152,22);
        country.setFont(new Font("Tahoma", Font.PLAIN ,14));
        country.setForeground(Color.BLACK);
        country.setBackground(Color.WHITE);
        panel.add(country);

        JLabel label7 = new JLabel("Allocated Room Number:");
        label7.setBounds(64,270,200,22);
        label7.setForeground(Color.WHITE);
        label7.setFont(new Font("Tahoma", Font.BOLD ,14));
        panel.add(label7);

        c1 = new Choice();
        try{
            Conn c = new Conn();
            ResultSet resultSet = c.statement.executeQuery("select * from room");
            while (resultSet.next()){
                c1.add(resultSet.getString("room_no"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        c1.setBounds(300,270,120,22);
        c1.setForeground(Color.WHITE);
        c1.setFont(new Font("Tahoma", Font.BOLD ,14));
        c1.setBackground(new Color(3,45,48));
        panel.add(c1);

        JLabel label8 = new JLabel("Checked_In");
        label8.setBounds(64,310,152,22);
        label8.setForeground(Color.WHITE);
        label8.setFont(new Font("Tahoma", Font.BOLD ,14));
        panel.add(label8);

        Date date1 =new Date();

        date = new JLabel(""+date1);
        date.setBounds(300,310,250,22);
        date.setForeground(Color.WHITE);
        date.setFont(new Font("Tahoma", Font.BOLD ,14));
        panel.add(date);

        JLabel label5 = new JLabel("Deposit:");
        label5.setBounds(64,350,152,22);
        label5.setForeground(Color.WHITE);
        label5.setFont(new Font("Tahoma", Font.BOLD ,14));
        panel.add(label5);

        deposit = new JTextField();
        deposit.setBounds(300,350,152,22);
        deposit.setFont(new Font("Tahoma", Font.PLAIN ,14));
        deposit.setForeground(Color.BLACK);
        deposit.setBackground(Color.WHITE);
        panel.add(deposit);


        add = new JButton("ADD");
        add.setBounds(64,390,111,20);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        panel.add(add);

        back = new JButton("BACK");
        back.setBounds(240,390,111,20);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        panel.add(back);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/customer.png"));
        Image image = imageIcon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label9 = new JLabel(imageIcon1);
        label9.setBounds(550,60,300,300);
        panel.add(label9);


        setUndecorated(true);
        setLocation(500,100);
        setLayout(null);
        setSize(900,520);
        setVisible(true);
    }
    public static void main(String[] args) {
        new NewCustomer();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== add){
            Conn con= new Conn();
            String radioBTn = null;
            if (genderM.isSelected()){
                radioBTn = "Male";
            }else {
                radioBTn = "Female";
            }
            String s1 = (String)id.getSelectedItem();
            String s2 = id_number.getText();
            String s3 = nametext.getText();
            String s4 = radioBTn;
            String s5 = country.getText();
            String s6 = c1.getSelectedItem();
            String s7 = date.getText();
            String s8 = deposit.getText();

            try {
                String q = "insert into customer  values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"','"+s8+"')";
                String q1 = "update room set avl = 'Occupied' where room_no = "+s6;
                con.statement.executeUpdate(q);
                con.statement.executeUpdate(q1);
                JOptionPane.showMessageDialog(null ,"Added successfully");
                setVisible(false);
            }catch (Exception E){
                E.printStackTrace();
            }

        }
        else {
            setVisible(false);
        }
    }
}
