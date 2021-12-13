package com.model;

import java.sql.*;
import java.util.Objects;

public class dB {
    public static int CheckLogin(String mail, String pwd) throws SQLException {
        int login =3;
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/users","root","gargi123");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from profile");


        while(resultSet.next()){
            if (Objects.equals(mail, resultSet.getString("email")) && Objects.equals(pwd, resultSet.getString("pwd"))){
                login =2;
                if(Objects.equals(resultSet.getString("usertype"), "prime"))
                    login = 1;
            }
        }
        return login;
    }
}
