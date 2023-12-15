package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class UpdateRoom extends JFrame {
    UpdateRoom(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,940,490);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/update.png"));
        Image image = imageIcon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(500,60,300,300);
        panel.add(label);

        JLabel label1 = new JLabel("Update Room Status");
        label1.setBounds(124,11,222,25);
        label1.setFont(new Font("Tahoma",Font.BOLD,20));
        label1.setForeground(Color.WHITE);
        panel.add(label1);

        JLabel label2 = new JLabel("ID : ");
        label2.setBounds(25,88,46,16);
        label2.setFont(new Font("Tahoma",Font.PLAIN,20));
        label2.setForeground(Color.WHITE);
        panel.add(label2);

        Choice c = new Choice();
        c.setBounds(248,85,160,20);
        panel.add(c);

        try {
            Conn C = new Conn();
            ResultSet resultSet = C.statement.executeQuery("select * from customer");
            while (resultSet.next()){
                c.add(resultSet.getString("id_number"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        JLabel label3 = new JLabel("Room Number :");
        label3.setBounds(25,129,174,20);
        label3.setFont(new Font("Tahoma",Font.PLAIN,20));
        label3.setForeground(Color.WHITE);
        panel.add(label3);

        JTextField RoomNo = new JTextField();
        RoomNo.setBounds(248,129,160,28);
        panel.add(RoomNo);

        JLabel label4 = new JLabel("Availability :");
        label4.setBounds(25,174,180,20);
        label4.setFont(new Font("Tahoma",Font.PLAIN,20));
        label4.setForeground(Color.WHITE);
        panel.add(label4);

        JTextField avl1 = new JTextField();
        avl1.setBounds(248,174,160,28);
        panel.add(avl1);

        JLabel label5 = new JLabel("Clean Status :");
        label5.setBounds(25,214,180,20);
        label5.setFont(new Font("Tahoma",Font.PLAIN,20));
        label5.setForeground(Color.WHITE);
        panel.add(label5);

        JTextField textStatus = new JTextField();
        textStatus.setBounds(248,214,160,28);
        panel.add(textStatus);


        JButton update = new JButton("Update");
        update.setBounds(120,315,89,23);
        update.setBackground(Color.BLACK);
        update.setForeground(Color.WHITE);
        panel.add(update);
        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Conn C = new Conn();
                    String status = textStatus.getText();
                    String avl = avl1.getText();
                    C.statement.executeUpdate("update room set cleaning_status ='"+status+"',avl='"+avl+"' where room_no = "+RoomNo.getText());

                    JOptionPane.showMessageDialog(null,"Update Successfully");
                    setVisible(false);


                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton check = new JButton("Check");
        check.setBounds(60,355,89,23);
        check.setBackground(Color.BLACK);
        check.setForeground(Color.WHITE);
        panel.add(check);
        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = c.getSelectedItem();
                String q = "select * from customer where id_number = '"+id+"'";
                try {
                    Conn c = new Conn();
                    ResultSet resultSet = c.statement.executeQuery(q);

                    while (resultSet.next()){
                        RoomNo.setText(resultSet.getString("room"));
                    }

                    ResultSet resultSet1 = c.statement.executeQuery("select * from room where room_no = '"+RoomNo.getText()+"'");

                    while (resultSet1.next()){
                        avl1.setText(resultSet1.getString("avl"));
                        textStatus.setText(resultSet1.getString("cleaning_status"));

                    }
                }catch (Exception E) {
                    E.printStackTrace();
                }
            }
        });

        JButton back = new JButton("Back");
        back.setBounds(180,355,89,23);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        setUndecorated(true);
        setLayout(null);
        setSize(950,450);
        setLocation(400,200);
        setVisible(true);
    }
    public static void main(String[] args) {
        new UpdateRoom();
    }
}
