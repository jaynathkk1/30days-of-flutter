package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddEmployee extends JFrame implements ActionListener {
    JTextField nametext,agetext,gendertext,salarytext,phonetext,adhartext,emailtext;
    JComboBox jobBox;
    JRadioButton genderM,genderF;
    JButton add,back;
    AddEmployee(){
        JPanel panel = new JPanel();
        panel.setBounds(5,5,875,498);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);

        JLabel label = new JLabel("ADD EMPLOYEE DETAILS");
        label.setBounds(194,10,300,22);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Tahoma", Font.BOLD ,22));
        panel.add(label);

        JLabel label1 = new JLabel("NAME");
        label1.setBounds(64,70,152,22);
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("Tahoma", Font.BOLD ,14));
        panel.add(label1);


        nametext = new JTextField();
        nametext.setBounds(200,70,152,22);
        nametext.setFont(new Font("Tahoma", Font.PLAIN ,14));
        nametext.setForeground(Color.WHITE);
        nametext.setBackground(new Color(16,108,115));
        panel.add(nametext);

        JLabel label2 = new JLabel("AGE");
        label2.setBounds(64,110,152,22);
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("Tahoma", Font.BOLD ,14));
        panel.add(label2);


        agetext = new JTextField();
        agetext.setBounds(200,110,152,22);
        agetext.setFont(new Font("Tahoma", Font.PLAIN ,14));
        agetext.setForeground(Color.WHITE);
        agetext.setBackground(new Color(16,108,115));
        panel.add(agetext);

        JLabel label3 = new JLabel("GENDER");
        label3.setBounds(64,150,152,22);
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("Tahoma", Font.BOLD ,14));
        panel.add(label3);


        genderM = new JRadioButton("MALE");
        genderM.setBounds(200,150,60,27);
        genderM.setFont(new Font("Tahoma", Font.PLAIN ,14));
        genderM.setForeground(Color.WHITE);
        genderM.setBackground(new Color(16,108,115));
        panel.add(genderM);

        genderF= new JRadioButton("FEMALE");
        genderF.setBounds(280,150,80,27);
        genderF.setFont(new Font("Tahoma", Font.PLAIN ,14));
        genderF.setForeground(Color.WHITE);
        genderF.setBackground(new Color(16,108,115));
        panel.add(genderF);

        JLabel label4 = new JLabel("JOB");
        label4.setBounds(64,190,152,22);
        label4.setForeground(Color.WHITE);
        label4.setFont(new Font("Tahoma", Font.BOLD ,14));
        panel.add(label4);


        jobBox = new JComboBox(new String[]{"Front Desk","Housekeeping","Kitchen Staff","Room_Service","Manager","Accountant","chef"});
        jobBox.setBounds(200,190,152,22);
        jobBox.setFont(new Font("Tahoma", Font.PLAIN ,14));
        jobBox.setForeground(Color.WHITE);
        jobBox.setBackground(new Color(16,108,115));
        panel.add(jobBox);

        JLabel label5 = new JLabel("SALARY");
        label5.setBounds(64,230,152,22);
        label5.setForeground(Color.WHITE);
        label5.setFont(new Font("Tahoma", Font.BOLD ,14));
        panel.add(label5);


        salarytext = new JTextField();
        salarytext.setBounds(200,230,152,22);
        salarytext.setFont(new Font("Tahoma", Font.PLAIN ,14));
        salarytext.setForeground(Color.WHITE);
        salarytext.setBackground(new Color(16,108,115));
        panel.add(salarytext);

        JLabel label6 = new JLabel("PHONE NO.");
        label6.setBounds(64,270,152,22);
        label6.setForeground(Color.WHITE);
        label6.setFont(new Font("Tahoma", Font.BOLD ,14));
        panel.add(label6);


        phonetext = new JTextField();
        phonetext.setBounds(200,270,152,22);
        phonetext.setFont(new Font("Tahoma", Font.PLAIN ,14));
        phonetext.setForeground(Color.WHITE);
        phonetext.setBackground(new Color(16,108,115));
        panel.add(phonetext);

        JLabel label7 = new JLabel("AADHAR NO.");
        label7.setBounds(64,310,152,22);
        label7.setForeground(Color.WHITE);
        label7.setFont(new Font("Tahoma", Font.BOLD ,14));
        panel.add(label7);


        adhartext = new JTextField();
        adhartext.setBounds(200,310,152,22);
        adhartext.setFont(new Font("Tahoma", Font.PLAIN ,14));
        adhartext.setForeground(Color.WHITE);
        adhartext.setBackground(new Color(16,108,115));
        panel.add(adhartext);

        JLabel label8 = new JLabel("EMAIL");
        label8.setBounds(64,350,152,22);
        label8.setForeground(Color.WHITE);
        label8.setFont(new Font("Tahoma", Font.BOLD ,14));
        panel.add(label8);


        emailtext = new JTextField();
        emailtext.setBounds(200,350,152,22);
        emailtext.setFont(new Font("Tahoma", Font.PLAIN ,14));
        emailtext.setForeground(Color.WHITE);
        emailtext.setBackground(new Color(16,108,115));
        panel.add(emailtext);

        add = new JButton("ADD");
        add.setBounds(64,390,111,20);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        panel.add(add);

        back = new JButton("BACK");
        back.setBounds(240,390,111,20);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        panel.add(back);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/addemp.png"));
        Image image = imageIcon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label9 = new JLabel(imageIcon1);
        label9.setBounds(500,60,300,300);
        panel.add(label9);


        setUndecorated(true);
        setLocation(300,90);
        setLayout(null);
        setSize(885,515);
        setVisible(true);
    }
    public static void main(String[] args) {
        new AddEmployee();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==add){
            String name = nametext.getText();
            String age = agetext.getText();
            String gender = null;
            String job = (String) jobBox.getSelectedItem();
            String salary = salarytext.getText();
            String phone_no = phonetext.getText();
            String adhar = adhartext.getText();
            String email = emailtext.getText();
            if (genderM.isSelected()){
                gender = "Male";
            }else if (genderF.isSelected()){
                gender = "Female";
            }
            try{
                Conn c = new Conn();
                String Q = "insert into employee values('"+name+"','"+age+"','"+gender+"','"+job+"','"+salary+"','"+phone_no+"','"+adhar+"','"+email+"')";
                c.statement.executeUpdate(Q);

                JOptionPane.showMessageDialog(null,"Employee Details Successfully Added");
            }catch (Exception E){
                E.printStackTrace();
            }
        }else {
            setVisible(false);
            new admin();
        }
    }
}
