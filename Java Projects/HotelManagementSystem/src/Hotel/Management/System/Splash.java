package Hotel.Management.System;

import javax.swing.*;

public class Splash extends JFrame {
    Splash() {
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/splash.gif"));
        JLabel label = new JLabel(imageIcon);
        label.setBounds(0,0,858,680);
        add(label);



        setUndecorated(true);
        setLayout(null);
        setSize(858,680);
        setLocation(300,80);
        setVisible(true);

        try{
            Thread.sleep(5000);
            new Login();
            setVisible(false);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Splash();
    }
}
