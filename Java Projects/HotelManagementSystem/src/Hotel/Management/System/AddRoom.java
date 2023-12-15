package Hotel.Management.System;

import javax.accessibility.AccessibleAction;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddRoom extends JFrame implements ActionListener {
    JTextField t2,textField2;
    JComboBox comboBox,comboBox1,comboBox2;
    JButton b1,b2;
    AddRoom(){
        JPanel panel = new JPanel();
        panel.setBounds(5,5,875,498);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);

        JLabel label = new JLabel("Add Room");
        label.setBounds(194,10,160,22);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Tahoma", Font.BOLD ,22));
        panel.add(label);

        JLabel label1 = new JLabel(" Room Number");
        label1.setBounds(64,70,152,22);
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("Tahoma", Font.BOLD ,14));
        panel.add(label1);


        t2 = new JTextField();
        t2.setBounds(200,70,152,22);
        t2.setFont(new Font("Tahoma", Font.PLAIN ,14));
        t2.setForeground(Color.WHITE);
        t2.setBackground(new Color(16,108,115));
        panel.add(t2);

        JLabel label2 = new JLabel("Avaibality");
        label2.setBounds(64,110,152,22);
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("Tahoma", Font.BOLD ,14));
        panel.add(label2);


        comboBox = new JComboBox(new String[]{"Available","Occupied"});
        comboBox.setBounds(200,110,152,22);
        comboBox.setFont(new Font("Tahoma", Font.PLAIN ,14));
        comboBox.setForeground(Color.WHITE);
        comboBox.setBackground(new Color(16,108,115));
        panel.add(comboBox);

        JLabel label3 = new JLabel("Price");
        label3.setBounds(64,150,152,22);
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("Tahoma", Font.BOLD ,14));
        panel.add(label3);


        textField2 = new JTextField();
        textField2.setBounds(200,150,152,22);
        textField2.setFont(new Font("Tahoma", Font.PLAIN ,14));
        textField2.setForeground(Color.WHITE);
        textField2.setBackground(new Color(16,108,115));
        panel.add(textField2);

        JLabel label4 = new JLabel("Cleaning Status");
        label4.setBounds(64,190,152,22);
        label4.setForeground(Color.WHITE);
        label4.setFont(new Font("Tahoma", Font.BOLD ,14));
        panel.add(label4);


        comboBox1 = new JComboBox(new String[]{"Clean","Dirty"});
        comboBox1.setBounds(200,190,152,22);
        comboBox1.setFont(new Font("Tahoma", Font.PLAIN ,14));
        comboBox1.setForeground(Color.WHITE);
        comboBox1.setBackground(new Color(16,108,115));
        panel.add(comboBox1);

        JLabel label5 = new JLabel("Bad Type");
        label5.setBounds(64,230,152,22);
        label5.setForeground(Color.WHITE);
        label5.setFont(new Font("Tahoma", Font.BOLD ,14));
        panel.add(label5);


        comboBox2 = new JComboBox(new String[]{"Single Bad","Double Bad"});
        comboBox2.setBounds(200,230,152,22);
        comboBox2.setFont(new Font("Tahoma", Font.PLAIN ,14));
        comboBox2.setForeground(Color.WHITE);
        comboBox2.setBackground(new Color(16,108,115));
        panel.add(comboBox2);

        b1 = new JButton("Add");
        b1.setBounds(64,321,111,20);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        panel.add(b1);

        b2 = new JButton("Back");
        b2.setBounds(190,321,111,20);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        panel.add(b2);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/roomser.png"));
        Image image = imageIcon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label6 = new JLabel(imageIcon1);
        label6.setBounds(500,60,300,300);
        panel.add(label6);

        setUndecorated(true);
        setLocation(20,200);
        setLayout(null);
        setSize(885,500);
        setVisible(true);
    }
    public static void main(String[] args) {
        new AddRoom();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b1){
            try {
                Conn c = new Conn();
                String room = t2.getText();
                String avl = (String)comboBox.getSelectedItem();
                String cleanig_status = (String)comboBox1.getSelectedItem();
                String price = textField2.getText();
                String type = (String) comboBox2.getSelectedItem();

                String Q = "insert into room values('"+room+"','"+avl+"','"+cleanig_status+"','"+price+"','"+type+"')";
                c.statement.executeUpdate(Q);

                JOptionPane.showMessageDialog(null,"Room Successfully Added");

            } catch (Exception E){
                E.printStackTrace();
            }
        }else {
            new admin();
            setVisible(false);
        }
    }
}
