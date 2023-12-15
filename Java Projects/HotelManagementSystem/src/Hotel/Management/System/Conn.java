package Hotel.Management.System;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {
    Connection connection;
    Statement statement;

    public Conn() {
        String url = "jdbc:mysql://localhost/ishan";
        String user = "root";
        String password = "mAA#1979";
        try{
            connection = DriverManager.getConnection(url,user,password);
            statement = connection.createStatement();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {

        new Conn();
    }
}
