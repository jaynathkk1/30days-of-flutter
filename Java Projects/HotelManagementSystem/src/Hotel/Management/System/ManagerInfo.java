package Hotel.Management.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class ManagerInfo extends JFrame {
    ManagerInfo(){
        JPanel panel = new JPanel();
        panel.setBounds(5,5,990,590);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);

        JLabel label = new JLabel("All Manager Information");
        label.setBounds(280,5,300,22);
        label.setForeground(Color.cyan);
        label.setFont(new Font("Tahoma", Font.BOLD ,20));
        panel.add(label);

        JTable table = new JTable();
        table.setBounds(20,64,980,420);
        table.setForeground(Color.WHITE);
        table.setBackground(new Color(3,45,48));
        panel.add(table);

        JButton back = new JButton("BACK");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.white);
        back.setBounds(350,490,120,40);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        try{
            Conn c = new Conn();
            String q = "select * from employee where job='Manager' ";
            ResultSet resultSet = c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        }catch (Exception e){
            e.printStackTrace();
        }

        JLabel name = new JLabel("NAME");
        name.setBounds(20,40,80,19);
        name.setForeground(Color.WHITE);
        name.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(name);

        JLabel age = new JLabel("AGE");
        age.setBounds(150,40,80,19);
        age.setForeground(Color.WHITE);
        age.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(age);

        JLabel gender = new JLabel("GENDER");
        gender.setBounds(270,40,80,19);
        gender.setForeground(Color.WHITE);
        gender.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(gender);

        JLabel job = new JLabel("JOB");
        job.setBounds(390,40,80,19);
        job.setForeground(Color.WHITE);
        job.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(job);

        JLabel salary = new JLabel("SALARY");
        salary.setBounds(510,40,80,19);
        salary.setForeground(Color.WHITE);
        salary.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(salary);

        JLabel phone = new JLabel("PHONE NO");
        phone.setBounds(630,40,80,19);
        phone.setForeground(Color.WHITE);
        phone.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(phone);

        JLabel id = new JLabel("ADHAR NO");
        id.setBounds(750,40,80,19);
        id.setForeground(Color.WHITE);
        id.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(id);

        JLabel email = new JLabel("EMAIL ID");
        email.setBounds(880,40,80,19);
        email.setForeground(Color.WHITE);
        email.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(email);

        setUndecorated(true);
        setLayout(null);
        setLocation(430,130);
        setSize(1000,600);
        setVisible(true);

    }
    public static void main(String[] args) {
        new ManagerInfo();
    }
}
