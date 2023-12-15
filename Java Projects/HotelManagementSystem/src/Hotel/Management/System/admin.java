package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class admin extends JFrame implements ActionListener {
    JButton add_Employee,Add_Room,Add_driver,logout,back;
    admin(){

        add_Employee = new JButton("ADD employee");
        add_Employee.setBounds(250,230,200,30);
        add_Employee.setBackground(Color.WHITE);
        add_Employee.setForeground(Color.BLACK);
        add_Employee.setFont(new Font("Tahoma",Font.BOLD,15));
        add_Employee.addActionListener(this);
        add(add_Employee);

        Add_Room = new JButton("ADD Room");
        Add_Room.setBounds(250,380,200,30);
        Add_Room.setBackground(Color.WHITE);
        Add_Room.setForeground(Color.BLACK);
        Add_Room.setFont(new Font("Tahoma",Font.BOLD,15));
        Add_Room.addActionListener(this);
        add(Add_Room);

        Add_driver = new JButton("ADD Driver");
        Add_driver.setBounds(250,550,200,30);
        Add_driver.setBackground(Color.WHITE);
        Add_driver.setForeground(Color.BLACK);
        Add_driver.setFont(new Font("Tahoma",Font.BOLD,15));
        Add_driver.addActionListener(this);
        add(Add_driver);

        logout = new JButton("LOGOUT");
        logout.setBounds(200,700,130,30);
        logout.setBackground(Color.BLACK);
        logout.setForeground(Color.WHITE);
        logout.setFont(new Font("Tahoma",Font.BOLD,15));
        logout.addActionListener(this);
        add(logout);

        back = new JButton("BACK");
        back.setBounds(380,700,130,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Tahoma",Font.BOLD,15));
        add(back);

        ImageIcon l1 = new ImageIcon(ClassLoader.getSystemResource("icon/employees.png"));
        Image l11 = l1.getImage().getScaledInstance(120,120,Image.SCALE_DEFAULT);
        ImageIcon imageIcon = new ImageIcon(l11);
        JLabel label = new JLabel(imageIcon);
        label.setBounds(70,180,120,120);
        add(label);

        ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("icon/room.png"));
        Image image = i1.getImage().getScaledInstance(120,120,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label1 = new JLabel(imageIcon1);
        label1.setBounds(70,340,120,120);
        add(label1);

        ImageIcon i11 =new ImageIcon(ClassLoader.getSystemResource("icon/driver.png"));
        Image image1 = i11.getImage().getScaledInstance(120,120,Image.SCALE_DEFAULT);
        ImageIcon imageIcon11 = new ImageIcon(image1);
        JLabel label11 = new JLabel(imageIcon11);
        label11.setBounds(70,500,120,120);
        add(label11);

        ImageIcon imageIcon2 = new ImageIcon(ClassLoader.getSystemResource("icon/login.gif"));
        Image image2 = imageIcon2.getImage().getScaledInstance(400,400,Image.SCALE_DEFAULT);
        ImageIcon imageIcon3 = new ImageIcon(image2);
        JLabel label2 = new JLabel(imageIcon3);
        label2.setBounds(950,250,400,400);
        add(label2);

        getContentPane().setBackground(new Color(3,45,48));
        setUndecorated(true);
        setLayout(null);
        setSize(1920,1080);
        setVisible(true);
    }

    public static void main(String[] args) {
        new admin();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==add_Employee){
            new AddEmployee();
        }
        else if (e.getSource()==Add_driver){
            new AddDriver();
            setVisible(false);
        }
        else if (e.getSource()==logout){
            new Dashboard();
            setVisible(false);
        }
        else if (e.getSource()==Add_Room){
            new AddRoom();
            setVisible(false);
        }
        else if (e.getSource()==back){
            new Dashboard();
            setVisible(false);
        }

    }
}
