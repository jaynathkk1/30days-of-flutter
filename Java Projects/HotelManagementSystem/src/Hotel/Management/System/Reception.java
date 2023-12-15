package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reception extends JFrame implements ActionListener {
    JButton button2,button1,button13,EmpInfo,button5,button6,button7,button8,button9,button10,button11,button12,button;
    Reception(){
        JPanel panel =new JPanel();
        panel.setBounds(270,5,1238,775);
        panel.setBackground(new Color(3,45,48));
        add(panel);

        JPanel panel1 =new JPanel();
        panel1.setBounds(10,5,250,775);
        panel1.setBackground(new Color(3,45,48));
        panel1.setLayout(null);
        add(panel1);

        button = new JButton("Add Customer Form");
        button.setFont(new Font("serif",Font.BOLD,14));
        button.setSize(200,30);
        button.setForeground(Color.CYAN);
        button.setBackground(Color.BLACK);
        button.setBounds(20,30,200,30);
        button.addActionListener(this);
        panel1.add(button);

        button1 = new JButton("Room");
        button1.setFont(new Font("serif",Font.BOLD,15));
        button1.setSize(200,30);
        button1.setForeground(Color.CYAN);
        button1.setBackground(Color.BLACK);
        button1.setBounds(20,70,200,30);
        button1.addActionListener(this);
        panel1.add(button1);

        button2 = new JButton("Department");
        button2.setFont(new Font("serif",Font.BOLD,15));
        button2.setSize(200,30);
        button2.setForeground(Color.CYAN);
        button2.setBackground(Color.BLACK);
        button2.setBounds(20,110,200,30);
        button2.addActionListener(this);
        panel1.add(button2);

        EmpInfo = new JButton("All Employee Info");
        EmpInfo.setFont(new Font("serif",Font.BOLD,15));
        EmpInfo.setSize(200,30);
        EmpInfo.setForeground(Color.CYAN);
        EmpInfo.setBackground(Color.BLACK);
        EmpInfo.setBounds(20,150,200,30);
        EmpInfo.addActionListener(this);
        panel1.add(EmpInfo);

        button5 = new JButton("Customer Info");
        button5.setFont(new Font("serif",Font.BOLD,15));
        button5.setSize(200,30);
        button5.setForeground(Color.CYAN);
        button5.setBackground(Color.BLACK);
        button5.setBounds(20,190,200,30);
        panel1.add(button5);
        button5.addActionListener(this);
        panel1.add(button5);

        button6 = new JButton("manager Info");
        button6.setFont(new Font("serif",Font.BOLD,15));
        button6.setSize(200,30);
        button6.setForeground(Color.CYAN);
        button6.setBackground(Color.BLACK);
        button6.setBounds(20,230,200,30);
        button6.addActionListener(this);
        panel1.add(button6);

        button7 = new JButton("Check-Out");
        button7.setFont(new Font("serif",Font.BOLD,15));
        button7.setSize(200,30);
        button7.setForeground(Color.CYAN);
        button7.setBackground(Color.BLACK);
        button7.setBounds(20,270,200,30);
        button7.addActionListener(this);
        panel1.add(button7);

        button8 = new JButton("Update Check-in Details");
        button8.setFont(new Font("serif",Font.BOLD,15));
        button8.setSize(200,30);
        button8.setForeground(Color.CYAN);
        button8.setBackground(Color.BLACK);
        button8.setBounds(20,310,200,30);
        button8.addActionListener(this);
        panel1.add(button8);

        button9 = new JButton("Update Room Status");
        button9.setFont(new Font("serif",Font.BOLD,15));
        button9.setSize(200,30);
        button9.setForeground(Color.CYAN);
        button9.setBackground(Color.BLACK);
        button9.setBounds(20,350,200,30);
        button9.addActionListener(this);
        panel1.add(button9);

        button10 = new JButton("Pick up Service");
        button10.setFont(new Font("serif",Font.BOLD,15));
        button10.setSize(200,30);
        button10.setForeground(Color.CYAN);
        button10.setBackground(Color.BLACK);
        button10.setBounds(20,390,200,30);
        button10.addActionListener(this);
        panel1.add(button10);

        button11 = new JButton("Search Room");
        button11.setFont(new Font("serif",Font.BOLD,15));
        button11.setSize(200,30);
        button11.setForeground(Color.CYAN);
        button11.setBackground(Color.BLACK);
        button11.setBounds(20,430,200,30);
        button11.addActionListener(this);
        panel1.add(button11);

        button12 = new JButton("Logout");
        button12.setFont(new Font("serif",Font.BOLD,15));
        button12.setSize(90,30);
        button12.setForeground(Color.CYAN);
        button12.setBackground(Color.BLACK);
        button12.setBounds(20,470,90,30);
        button12.addActionListener(this);
        panel1.add(button12);

        button13 = new JButton("Back");
        button13.setFont(new Font("serif",Font.BOLD,15));
        button13.setSize(90,30);
        button13.setForeground(Color.CYAN);
        button13.setBackground(Color.BLACK);
        button13.addActionListener(this);
        button13.setBounds(130,470,90,30);
        panel1.add(button13);
        

        ImageIcon imageIcon= new ImageIcon(ClassLoader.getSystemResource("icon/ccc.gif"));
        Image image = imageIcon.getImage().getScaledInstance(600,600,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        panel.setLayout(null);
        label.setBounds(300,100,600,600);
        panel.add(label);

        ImageIcon imageIcon3 = new ImageIcon(ClassLoader.getSystemResource("icon/login.gif"));
        Image image1 = imageIcon3.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
        ImageIcon imageIcon2 = new ImageIcon(image1);
        JLabel label1 = new JLabel(imageIcon2);
        panel.setLayout(null);
        label1.setBounds(10,500,250,250);
        panel1.add(label1);


        setUndecorated(true);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setSize(1920,1080);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Reception();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button) {
           new  NewCustomer();
        } else if (e.getSource()==button1) {
            new Room();
        } else if (e.getSource()==button2) {
            new Department();
        } else if (e.getSource()==button5) {
            new CustomerInfo();
        } else if (e.getSource()==button6) {
            new ManagerInfo();
        } else if (e.getSource()==button7) {
            new CheckOut();
        } else if (e.getSource()==button8) {
            new UpdateCheck();
        } else if (e.getSource()==button9) {
            new UpdateRoom();
        } else if (e.getSource()==button10) {
            new PickUp();
        } else if (e.getSource()==button11) {
            new SearchRoom();
        }else if (e.getSource()==button12){
            setVisible(false);
        } else if (e.getSource()==EmpInfo) {
            new Employee();
        } else if (e.getSource()==button13) {
            new Dashboard();
            setVisible(false);
        }
    }
}
