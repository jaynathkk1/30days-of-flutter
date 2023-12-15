package Hotel.Management.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class CustomerInfo extends JFrame {
    CustomerInfo(){
        JPanel panel = new JPanel();
        panel.setBounds(5,5,1040,590);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);

        JLabel label = new JLabel("All Customer Information");
        label.setBounds(280,5,300,22);
        label.setForeground(Color.cyan);
        label.setFont(new Font("Tahoma", Font.BOLD ,20));
        panel.add(label);

        JTable table = new JTable();
        table.setLayout(null);
        table.setBounds(20,64,1040,420);
        table.setForeground(Color.WHITE);
        table.setBackground(new Color(3,45,48));
        panel.add(table);

        JButton back = new JButton("BACK");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.white);
        back.setBounds(350,500,120,40);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        try{
            Conn c = new Conn();
            String q = "select * from customer ";
            ResultSet resultSet = c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        }catch (Exception e){
            e.printStackTrace();
        }

        JLabel ID = new JLabel("ID ");
        ID.setBounds(20,40,80,19);
        ID.setForeground(Color.WHITE);
        ID.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(ID);

        JLabel ID_No = new JLabel("ID Number");
        ID_No.setBounds(150,40,120,19);
        ID_No.setForeground(Color.WHITE);
        ID_No.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(ID_No);

        JLabel name = new JLabel("Name");
        name.setBounds(280,40,80,19);
        name.setForeground(Color.WHITE);
        name.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(name);

        JLabel gender = new JLabel("Gender");
        gender.setBounds(410,40,80,19);
        gender.setForeground(Color.WHITE);
        gender.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(gender);

        JLabel country = new JLabel("Country");
        country.setBounds(540,40,80,19);
        country.setForeground(Color.WHITE);
        country.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(country);

        JLabel roomNo = new JLabel("Room NO");
        roomNo.setBounds(670,40,80,19);
        roomNo.setForeground(Color.WHITE);
        roomNo.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(roomNo);

        JLabel check = new JLabel("Check_In Time");
        check.setBounds(800,40,120,19);
        check.setForeground(Color.WHITE);
        check.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(check);

        JLabel deposit = new JLabel("Deposit");
        deposit.setBounds(930,40,80,19);
        deposit.setForeground(Color.WHITE);
        deposit.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(deposit);

        setUndecorated(true);
        setLayout(null);
        setLocation(350,130);
        setSize(1050,600);
        setVisible(true);
    }
    public static void main(String[] args) {
        new CustomerInfo();
    }
}
