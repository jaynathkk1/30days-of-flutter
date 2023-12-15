package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddDriver extends JFrame implements ActionListener {
    JTextField textField,textField1,textField2,textField3,textField4;
    JComboBox comboBox,comboBox1;
    JButton b1,b2;
    AddDriver(){
        JPanel panel = new JPanel();
        panel.setBounds(5,5,875,498);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);

        JLabel label = new JLabel("ADD DRIVER");
        label.setBounds(194,10,160,22);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Tahoma", Font.BOLD ,22));
        panel.add(label);

        JLabel label1 = new JLabel("NAME");
        label1.setBounds(64,70,152,22);
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("Tahoma", Font.BOLD ,14));
        panel.add(label1);


        textField = new JTextField();
        textField.setBounds(200,70,152,22);
        textField.setFont(new Font("Tahoma", Font.PLAIN ,14));
        textField.setForeground(Color.WHITE);
        textField.setBackground(new Color(16,108,115));
        panel.add(textField);

        JLabel label2 = new JLabel("AGE");
        label2.setBounds(64,110,152,22);
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("Tahoma", Font.BOLD ,14));
        panel.add(label2);


        textField1 = new JTextField();
        textField1.setBounds(200,110,152,22);
        textField1.setFont(new Font("Tahoma", Font.PLAIN ,14));
        textField1.setForeground(Color.WHITE);
        textField1.setBackground(new Color(16,108,115));
        panel.add(textField1);

        JLabel label3 = new JLabel("GENDER");
        label3.setBounds(64,150,152,22);
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("Tahoma", Font.BOLD ,14));
        panel.add(label3);


        comboBox = new JComboBox(new String[]{"MALE","FEMALE"});
        comboBox.setBounds(200,150,152,22);
        comboBox.setFont(new Font("Tahoma", Font.PLAIN ,14));
        comboBox.setForeground(Color.WHITE);
        comboBox.setBackground(new Color(16,108,115));
        panel.add(comboBox);

        JLabel label4 = new JLabel("CAR COMPANY");
        label4.setBounds(64,190,152,22);
        label4.setForeground(Color.WHITE);
        label4.setFont(new Font("Tahoma", Font.BOLD ,14));
        panel.add(label4);


        textField2 = new JTextField();
        textField2.setBounds(200,190,152,22);
        textField2.setFont(new Font("Tahoma", Font.PLAIN ,14));
        textField2.setForeground(Color.WHITE);
        textField2.setBackground(new Color(16,108,115));
        panel.add(textField2);

        JLabel label5 = new JLabel("CAR NAME");
        label5.setBounds(64,230,152,22);
        label5.setForeground(Color.WHITE);
        label5.setFont(new Font("Tahoma", Font.BOLD ,14));
        panel.add(label5);


        textField3 = new JTextField();
        textField3.setBounds(200,230,152,22);
        textField3.setFont(new Font("Tahoma", Font.PLAIN ,14));
        textField3.setForeground(Color.WHITE);
        textField3.setBackground(new Color(16,108,115));
        panel.add(textField3);

        JLabel label6 = new JLabel("AVAILABLE");
        label6.setBounds(64,270,152,22);
        label6.setForeground(Color.WHITE);
        label6.setFont(new Font("Tahoma", Font.BOLD ,14));
        panel.add(label6);


        comboBox1 = new JComboBox(new String[]{"YES","NO"});
        comboBox1.setBounds(200,270,152,22);
        comboBox1.setFont(new Font("Tahoma", Font.PLAIN ,14));
        comboBox1.setForeground(Color.WHITE);
        comboBox1.setBackground(new Color(16,108,115));
        panel.add(comboBox1);

        JLabel label7 = new JLabel("LOCATION");
        label7.setBounds(64,310,152,22);
        label7.setForeground(Color.WHITE);
        label7.setFont(new Font("Tahoma", Font.BOLD ,14));
        panel.add(label7);


        textField4 = new JTextField();
        textField4.setBounds(200,310,152,22);
        textField4.setFont(new Font("Tahoma", Font.PLAIN ,14));
        textField4.setForeground(Color.WHITE);
        textField4.setBackground(new Color(16,108,115));
        panel.add(textField4);

        b1 = new JButton("ADD");
        b1.setBounds(64,350,111,20);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        panel.add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(240,350,111,20);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        panel.add(b2);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/license.png"));
        Image image = imageIcon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label8 = new JLabel(imageIcon1);
        label8.setBounds(500,60,300,300);
        panel.add(label8);


        setUndecorated(true);
        setLocation(20,200);
        setLayout(null);
        setSize(885,500);
        setVisible(true);
    }
    public static void main(String[] args) {
        new AddDriver();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==b1){
            try{
                Conn c = new Conn();
                String name = textField.getText();
                String age = textField1.getText();
                String gender = (String)comboBox.getSelectedItem();
                String company = textField2.getText();
                String carname = textField3.getText();
                String avl = (String) comboBox1.getSelectedItem();
                String location = textField4.getText();

                String Q = "insert into driver values('"+name+"','"+age+"','"+gender+"','"+company+"','"+carname+"','"+avl+"','"+location+"')";
                c.statement.executeUpdate(Q);

                JOptionPane.showMessageDialog(null,"Driver Successfully Added");

            }catch (Exception E){
                E.printStackTrace();
            }
        }else {
            new admin();
            setVisible(false);
        }
    }
}
