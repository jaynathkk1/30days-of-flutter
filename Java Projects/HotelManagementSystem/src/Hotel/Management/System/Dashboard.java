package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard extends JFrame implements ActionListener {
    JButton add,rec;
    Dashboard(){
        super(("HOTEL MANAGEMENT SYSTEM"));

        rec = new JButton("RECEPTION");
        rec.setBounds(425,510,140,30);
        rec.setFont(new Font("Tahoma",Font.BOLD,15));
        rec.setBackground(new Color(255,98,0));
        rec.addActionListener(this);
        rec.setForeground(Color.CYAN);
        add(rec);

        add = new JButton("ADMIN");
        add.setBounds(880,510,140,30);
        add.setFont(new Font("Tahoma",Font.BOLD,15));
        add.setBackground(new Color(255,98,0));
        add.addActionListener(this);
        add.setForeground(Color.CYAN);
        add(add);

        ImageIcon imageIcon2 = new ImageIcon(ClassLoader.getSystemResource("icon/boss.png"));
        Image i2 = imageIcon2.getImage().getScaledInstance(200,195, Image.SCALE_DEFAULT);
        ImageIcon imageIcon3 = new ImageIcon(i2);
        JLabel label1 = new JLabel(imageIcon3);
        label1.setBounds(850,300,200,195);
        add(label1);

        ImageIcon imageIcon22 = new ImageIcon(ClassLoader.getSystemResource("icon/Reception.png"));
        Image i22 = imageIcon22.getImage().getScaledInstance(200,195, Image.SCALE_DEFAULT);
        ImageIcon imageIcon33 = new ImageIcon(i22);
        JLabel label11 = new JLabel(imageIcon33);
        label11.setBounds(400,300,200,195);
        add(label11);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/Dashboard.gif"));
        Image i1 = imageIcon.getImage().getScaledInstance(1950,1080, Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(i1);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(0,0,1950,1080);
        add(label);


        setUndecorated(false);
        setSize(1950,1080);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Dashboard();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == rec) {
            new Reception();
            setVisible(false);
        }
        else {
            new Login2();
            setVisible(false);
        }
    }
}
