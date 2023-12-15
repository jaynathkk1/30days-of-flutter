package Hotel.Management.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class PickUp extends JFrame{
    JButton back,display;
    PickUp(){
        JPanel panel = new JPanel();
        panel.setBounds(5,5,790,590);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);

        JLabel label = new JLabel("Pick Up Service");
        label.setBounds(280,30,300,22);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Tahoma", Font.BOLD ,20));
        panel.add(label);

        Choice c = new Choice();
        c.setBounds(190,80,150,25);
        panel.add(c);

        try {
            Conn C = new Conn();
            ResultSet resultSet = C.statement.executeQuery("select * from driver");
            while (resultSet.next()){
                c.add(resultSet.getString("carname"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        JLabel car = new JLabel("Type of Car");
        car.setBounds(64,80,120,22);
        car.setForeground(Color.WHITE);
        car.setFont(new Font("Tahoma", Font.BOLD ,14));
        panel.add(car);

        JTable table = new JTable();
        table.setBounds(15,230,800,250);
        table.setForeground(Color.WHITE);
        table.setBackground(new Color(3,45,48));
        panel.add(table);

        try{
            Conn c1 = new Conn();
            String q = "select * from driver ";
            ResultSet resultSet = c1.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        }catch (Exception e){
            e.printStackTrace();
        }

        JLabel name = new JLabel("Name ");
        name.setBounds(20,200,80,19);
        name.setForeground(Color.WHITE);
        name.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(name);

        JLabel age = new JLabel("Age");
        age.setBounds(150,200,80,19);
        age.setForeground(Color.WHITE);
        age.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(age);

        JLabel gender = new JLabel("Gender");
        gender.setBounds(250,200,80,19);
        gender.setForeground(Color.WHITE);
        gender.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(gender);

        JLabel job = new JLabel("Company");
        job.setBounds(370,200,80,19);
        job.setForeground(Color.WHITE);
        job.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(job);

        JLabel salary = new JLabel("Car Name");
        salary.setBounds(480,200,80,19);
        salary.setForeground(Color.WHITE);
        salary.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(salary);

        JLabel phone = new JLabel("Available");
        phone.setBounds(590,200,80,19);
        phone.setForeground(Color.WHITE);
        phone.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(phone);

        JLabel id = new JLabel("Location");
        id.setBounds(700,200,120,19);
        id.setForeground(Color.WHITE);
        id.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(id);

        display = new JButton("DISPLAY");
        display.setBackground(Color.BLACK);
        display.setForeground(Color.white);
        display.setBounds(200,500,120,30);
        panel.add(display);
        display.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String q = "select * from driver where carname = '"+c.getSelectedItem()+"'";
                try {
                    Conn c = new Conn();
                    ResultSet resultSet = c.statement.executeQuery(q);
                    table.setModel(DbUtils.resultSetToTableModel(resultSet));
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        back = new JButton("BACK");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.white);
        back.setBounds(350,500,120,30);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });


        setUndecorated(true);
        setLayout(null);
        setLocation(500,100);
        setSize(800,600);
        setVisible(true);
    }
    public static void main(String[] args) {
        new PickUp();
    }
}
