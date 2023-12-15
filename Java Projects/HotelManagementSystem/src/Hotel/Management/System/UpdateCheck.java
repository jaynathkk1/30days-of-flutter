package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class UpdateCheck extends JFrame implements ActionListener{
    UpdateCheck(){
        JPanel panel = new JPanel();
        panel.setBounds(5,5,940,490);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/updated.png"));
        Image image = imageIcon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(500,60,300,300);
        panel.add(label);

        JLabel label1 = new JLabel("Check-In Details");
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

        JLabel label4 = new JLabel("Name :");
        label4.setBounds(25,174,97,20);
        label4.setFont(new Font("Tahoma",Font.PLAIN,20));
        label4.setForeground(Color.WHITE);
        panel.add(label4);

        JTextField name1 = new JTextField();
        name1.setBounds(248,174,160,28);
        panel.add(name1);

        JLabel label5 = new JLabel("Checked-In :");
        label5.setBounds(25,214,120,20);
        label5.setFont(new Font("Tahoma",Font.PLAIN,20));
        label5.setForeground(Color.WHITE);
        panel.add(label5);

        JTextField checkIn = new JTextField();
        checkIn.setBounds(248,214,160,28);
        panel.add(checkIn);

        JLabel label6 = new JLabel("Amount paid(Rs) :");
        label6.setBounds(25,254,170,20);
        label6.setFont(new Font("Tahoma",Font.PLAIN,20));
        label6.setForeground(Color.WHITE);
        panel.add(label6);

        JTextField amount = new JTextField();
        amount.setBounds(248,254,160,28);
        panel.add(amount);

        JLabel label7 = new JLabel("Pending Amount(Rs) :");
        label7.setBounds(25,294,200,20);
        label7.setFont(new Font("Tahoma",Font.PLAIN,20));
        label7.setForeground(Color.WHITE);
        panel.add(label7);

        JTextField pending = new JTextField();
        pending.setBounds(248,294,160,28);
        panel.add(pending);

        JButton update = new JButton("Update");
        update.setBounds(120,350,80,20);
        update.setBackground(Color.BLACK);
        update.setForeground(Color.WHITE);
        panel.add(update);
        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Conn C = new Conn();
                    String Q = c.getSelectedItem();
                    String room = RoomNo.getText();
                    String name = name1.getText();
                    String check = checkIn.getText();
                    String amount1 = amount.getText();
                    C.statement.executeUpdate("update customer set room = '"+room+"',name = '"+name+"',checkintime ='"+check+"',deposit = '"+amount1+"' where id_number ='"+Q+"'");
                    JOptionPane.showMessageDialog(null,"Update Successfully","Update",1);

                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton check = new JButton("Check");
        check.setBounds(250,350,80,20);
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
                        name1.setText(resultSet.getString("name"));
                        checkIn.setText(resultSet.getString("checkintime"));
                        amount.setText(resultSet.getString("deposit"));
                    }

                    ResultSet resultSet1 = c.statement.executeQuery("select * from room where room_no = '"+RoomNo.getText()+"'");

                    while (resultSet1.next()){
                        String price = resultSet1.getString("price");
                        int amountPaid = Integer.parseInt(price)-Integer.parseInt(amount.getText());
                        pending.setText(""+amountPaid);
                    }
                }catch (Exception E) {
                    E.printStackTrace();
                }
            }
        });

        JButton back = new JButton("Back");
        back.setBounds(400,350,80,20);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Reception();
                setVisible(false);
            }
        });

        setUndecorated(true);
        setLayout(null);
        setSize(950,500);
        setLocation(400,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new UpdateCheck();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
