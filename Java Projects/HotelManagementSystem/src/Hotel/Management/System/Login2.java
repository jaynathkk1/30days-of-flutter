package Hotel.Management.System;

import javax.accessibility.AccessibleAction;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login2 extends JFrame implements ActionListener {
    JTextField textField1;
    JPasswordField passwordField1;
    JButton b1,b2;
    Login2(){
        JLabel label1 = new JLabel("Username");
        label1.setBounds(40,20,100,30);
        label1.setFont(new Font("Tahoma",Font.BOLD,16));
        label1.setForeground(Color.white);
        add(label1);

        JLabel label2 = new JLabel("Username");
        label2.setBounds(40,70,100,30);
        label2.setFont(new Font("Tahoma",Font.BOLD,16));
        label2.setForeground(Color.white);
        add(label2);

        textField1 = new JTextField();
        textField1.setBounds(150,20,150,30);
        setFont(new Font("Tahoma",Font.BOLD,20));
        textField1.setBackground(new Color(26,104,110));
        textField1.setForeground(Color.WHITE);
        add(textField1);

        passwordField1 = new JPasswordField();
        passwordField1.setBounds(150,70,150,30);
        passwordField1.setBackground(new Color(26,104,110));
        passwordField1.setForeground(Color.WHITE);
        add(passwordField1);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/login.gif"));
        Image i1 = imageIcon.getImage().getScaledInstance(255,300,Image.SCALE_DEFAULT);
        JLabel label = new JLabel(imageIcon);
        label.setBounds(318,-30,255,300);
        add(label);

        b1 = new JButton("Login");
        b1.setBounds(40,140,120,30);
        b1.setFont(new Font("Tahoma",Font.BOLD,15));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Cancel");
        b2.setBounds(180,140,120,30);
        b2.setFont(new Font("Tahoma",Font.BOLD,15));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);


        getContentPane().setBackground(new Color(3,45,48));
        setLayout(null);
        setUndecorated(true);
        setLocation(400,270);
        setSize(600,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Login2();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1){

            try {
                Conn c = new Conn();
                String username = textField1.getText();
                String pass = passwordField1.getText();

                String q = "select * from login2 where user = '"+username+"' and password = '"+pass+"' ";
                ResultSet resultSet = c.statement.executeQuery(q);
                if (resultSet.next()){
                    new admin();
                    setVisible(false);
                }
                else {
                    JOptionPane.showMessageDialog(null,"Invalid user or password");
                }
            } catch (Exception ae){
                ae.printStackTrace();
            }
        }
        else {
            System.exit(13);
        }
    }
}
