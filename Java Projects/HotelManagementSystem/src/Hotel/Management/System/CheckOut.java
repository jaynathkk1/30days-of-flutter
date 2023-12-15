package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class CheckOut extends JFrame {
    CheckOut(){
        JPanel panel =new JPanel();
        panel.setBounds(5,5,790,390);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);

        JLabel label = new JLabel("Check-Out");
        label.setBounds(60,15,150,30);
        label.setFont(new Font("Tahoma",Font.BOLD,20));
        label.setForeground(Color.WHITE);
        panel.add(label);

        JLabel Userid = new JLabel("Customer Id");
        Userid.setBounds(20,50,150,30);
        Userid.setFont(new Font("Tahoma",Font.BOLD,14));
        Userid.setForeground(Color.WHITE);
        panel.add(Userid);

        Choice Customer =new Choice();
        Customer.setBounds(250,50,150,30);
        Customer.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(Customer);

        JLabel RoomNo = new JLabel("Room Number ");
        RoomNo.setBounds(20,100,150,30);
        RoomNo.setFont(new Font("Tahoma",Font.BOLD,14));
        RoomNo.setForeground(Color.WHITE);
        panel.add(RoomNo);

        JLabel labelRoomnumber = new JLabel();
        labelRoomnumber.setBounds(250,100,250,30);
        labelRoomnumber.setFont(new Font("Tahoma",Font.BOLD,14));
        labelRoomnumber.setForeground(Color.WHITE);
        panel.add(labelRoomnumber);

        JLabel CheckInTime = new JLabel("Check-In Time");
        CheckInTime.setBounds(20,150,150,30);
        CheckInTime.setFont(new Font("Tahoma",Font.BOLD,14));
        CheckInTime.setForeground(Color.WHITE);
        panel.add(CheckInTime);

        JLabel labelCheckInTime = new JLabel();
        labelCheckInTime.setBounds(250,150,250,30);
        labelCheckInTime.setFont(new Font("Tahoma",Font.BOLD,14));
        labelCheckInTime.setForeground(Color.WHITE);
        panel.add(labelCheckInTime);

        JLabel CheckOut = new JLabel("Check-Out Time");
        CheckOut.setBounds(20,200,150,30);
        CheckOut.setFont(new Font("Tahoma",Font.BOLD,14));
        CheckOut.setForeground(Color.WHITE);
        panel.add(CheckOut);

        Date date = new Date();

        JLabel labelCheckOut = new JLabel(""+date);
        labelCheckOut.setBounds(250,200,250,30);
        labelCheckOut.setFont(new Font("Tahoma",Font.BOLD,14));
        labelCheckOut.setForeground(Color.WHITE);
        panel.add(labelCheckOut);

        try{
            Conn c = new Conn();
            ResultSet resultSet = c.statement.executeQuery("select * from customer");
            while (resultSet.next()){
                Customer.add(resultSet.getString("id_number"));
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        JButton checkOut = new JButton("Check-Out");
        checkOut.setFont(new Font("serif",Font.BOLD,15));
        checkOut.setSize(90,30);
        checkOut.setForeground(Color.CYAN);
        checkOut.setBackground(Color.BLACK);
        checkOut.setBounds(300,300,120,30);
        panel.add(checkOut);
        checkOut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Conn cv = new Conn();
                    cv.statement.executeUpdate("delete from customer where id_number = '"+Customer.getSelectedItem()+"'");
                    cv.statement.executeUpdate("update room set avl='Available' where room_no='"+labelRoomnumber.getText()+"'" );
                    JOptionPane.showMessageDialog(null,"Check-Out Successfully");
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton check = new JButton("Check");
        check.setFont(new Font("serif",Font.BOLD,15));
        check.setSize(90,30);
        check.setForeground(Color.CYAN);
        check.setBackground(Color.BLACK);
        check.setBounds(170,300,120,30);
        panel.add(check);
        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Conn C = new Conn();
                try {
                    ResultSet resultSet = C.statement.executeQuery("select * from customer where id_number ='"+Customer.getSelectedItem()+"'");
                    while (resultSet.next()){
                        labelRoomnumber.setText(resultSet.getString("room"));
                        labelCheckInTime.setText(resultSet.getString("checkintime"));
                    }
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton back = new JButton("Back");
        back.setFont(new Font("serif",Font.BOLD,15));
        back.setSize(90,30);
        back.setForeground(Color.CYAN);
        back.setBackground(Color.BLACK);
        back.setBounds(20,300,120,30);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Reception();
                setVisible(false);
            }
        });

        setUndecorated(true);
        setLayout(null);
        setSize(800,400);
        setLocation(500,210);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CheckOut();
    }
}
