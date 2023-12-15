package Hotel.Management.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class SearchRoom extends JFrame implements ActionListener {
    JCheckBox checkBox;
    Choice choice;
    JTable table;
    JButton add,back;
    SearchRoom(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,690,495);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);

        JLabel label = new JLabel("Search for room");
        label.setBounds(100,10,300,22);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Tahoma", Font.BOLD ,22));
        panel.add(label);

        JLabel label1 = new JLabel("Room Bad Type :");
        label1.setBounds(20,69,230,15);
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("Tahoma", Font.BOLD ,14));
        panel.add(label1);

        checkBox = new JCheckBox("Only Display Available");
        checkBox.setBounds(400,69,399,22);
        checkBox.setForeground(Color.WHITE);
        checkBox.setBackground(new Color(3,45,48));
        checkBox.setFont(new Font("Tahoma", Font.BOLD ,22));
        panel.add(checkBox);

        choice = new Choice();
        choice.add("Single Bad");
        choice.add("Double Bad");
        choice.setBounds(250,70,120,150);
        panel.add(choice);

        table = new JTable();
        table.setBounds(20,230,695,150);
        table.setForeground(Color.WHITE);
        table.setBackground(new Color(3,45,48));
        panel.add(table);

        try {
            Conn c = new Conn();
            String q = "select * from room ";
            ResultSet resultSet = c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        }catch (Exception e){
            e.printStackTrace();
        }

        JLabel Room_NO = new JLabel("Room No.");
        Room_NO.setBounds(25,200,80,19);
        Room_NO.setForeground(Color.WHITE);
        Room_NO.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(Room_NO);

        JLabel availabability = new JLabel("Availability");
        availabability.setBounds(160,200,80,19);
        availabability.setForeground(Color.WHITE);
        availabability.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(availabability);

        JLabel Status = new JLabel("Status");
        Status.setBounds(300,200,80,19);
        Status.setForeground(Color.WHITE);
        Status.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(Status);

        JLabel Price = new JLabel("Price");
        Price.setBounds(450,200,80,19);
        Price.setForeground(Color.WHITE);
        Price.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(Price);

        JLabel Bad = new JLabel("Bad Type");
        Bad.setBounds(580,200,80,19);
        Bad.setForeground(Color.WHITE);
        Bad.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(Bad);

        add = new JButton("Search");
        add.setBounds(180,400,120,30);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        panel.add(add);

        back = new JButton("BACK");
        back.setBounds(350,400,120,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        panel.add(back);



        setUndecorated(true);
        setLocation(500,200);
        setLayout(null);
        setSize(700,500);
        setVisible(true);
    }
    public static void main(String[] args) {
        new SearchRoom();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==add){
            String Q = "select * from room where type='"+choice.getSelectedItem()+"'";
            String Q1 = "select * from room where avl ='Available' And type = '"+choice.getSelectedItem()+"'";
            try{
                Conn c = new Conn();
                ResultSet resultSet = c.statement.executeQuery(Q);
                table.setModel(DbUtils.resultSetToTableModel(resultSet));
                if (checkBox.isSelected()){
                    ResultSet resultSet1 = c.statement.executeQuery(Q1);
                    table.setModel(DbUtils.resultSetToTableModel(resultSet1));
                }
            }catch (Exception E){
                E.printStackTrace();
            }

        }
        else {
            setVisible(false);
        }
    }
}
