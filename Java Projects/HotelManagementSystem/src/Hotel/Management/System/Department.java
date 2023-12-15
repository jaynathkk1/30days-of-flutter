package Hotel.Management.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Department extends JFrame {
    Department(){
        JPanel panel = new JPanel();
        panel.setBounds(15,40,690,500);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);

        JLabel RoomInfo1 = new JLabel("All Department Information");
        RoomInfo1.setBounds(200,5,300,22);
        RoomInfo1.setForeground(Color.cyan);
        RoomInfo1.setFont(new Font("Tahoma", Font.BOLD ,20));
        panel.add(RoomInfo1);

        JTable table = new JTable();
        table.setLayout(null);
        table.setBounds(10,70,700,310);
        table.setBackground(new Color(4,45,48));
        table.setForeground(Color.WHITE);
        panel.add(table);

        try{
            Conn c = new Conn();
            String departmentInfo = "select * from department ";
            ResultSet resultSet = c.statement.executeQuery(departmentInfo);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        }catch (Exception e){
            e.printStackTrace();
        }

        JButton back = new JButton("BACK");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.white);
        back.setBounds(400,380,120,40);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        JLabel department = new JLabel("Department");
        department.setBounds(65,40,150,19);
        department.setForeground(Color.WHITE);
        department.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(department);

        JLabel budget = new JLabel("Budget");
        budget.setBounds(420,40,150,19);
        budget.setForeground(Color.WHITE);
        budget.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(budget);

        setUndecorated(true);
        setLayout(null);
        setLocation(550,120);
        setSize(720,500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Department();
    }
}
