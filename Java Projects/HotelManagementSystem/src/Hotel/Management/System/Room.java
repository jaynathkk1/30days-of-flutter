package Hotel.Management.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Room extends JFrame  {
    JTable table;
    JButton back;
    Room(){
        JPanel panel = new JPanel();
        panel.setBounds(5,5,890,590);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);

        JLabel RoomInfo1 = new JLabel("All Room Information");
        RoomInfo1.setBounds(200,5,300,22);
        RoomInfo1.setForeground(Color.cyan);
        RoomInfo1.setFont(new Font("Tahoma", Font.BOLD ,20));
        panel.add(RoomInfo1);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/roomm.png"));
        Image i1 = imageIcon.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(i1);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(600,230,200,200);
        panel.add(label);

        table = new JTable();
        table.setBounds(50,70,500,400);
        table.setBackground(new Color(3,45,48));
        table.setForeground(Color.white);
        panel.add(table);

        try{
            Conn c = new Conn();
            String RoomInfo = "select * from room";
            ResultSet resultSet = c.statement.executeQuery(RoomInfo);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));

        }catch (Exception e){
            e.printStackTrace();
        }

        back = new JButton("BACK");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.white);
        back.setBounds(200,530,120,40);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        JLabel Room_NO = new JLabel("Room No.");
        Room_NO.setBounds(50,45,80,19);
        Room_NO.setForeground(Color.WHITE);
        Room_NO.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(Room_NO);

        JLabel availabability = new JLabel("Availability");
        availabability.setBounds(155,45,80,19);
        availabability.setForeground(Color.WHITE);
        availabability.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(availabability);

        JLabel Status = new JLabel("Status");
        Status.setBounds(255,45,80,19);
        Status.setForeground(Color.WHITE);
        Status.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(Status);

        JLabel Price = new JLabel("Price");
        Price.setBounds(355,45,80,19);
        Price.setForeground(Color.WHITE);
        Price.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(Price);

        JLabel Bad = new JLabel("Bad Type");
        Bad.setBounds(455,45,80,19);
        Bad.setForeground(Color.WHITE);
        Bad.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(Bad);

        setUndecorated(true);
        setLayout(null);
        setSize(900,630);
        setLocation(500,100);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Room();
    }
}
