package com.knoldus;
import java.sql.*;
import java.io.*;

public class Jdbc {
    public static void main(String args[]){
        try{
            //Registering the Driver
//             DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            //Getting the connection
            String mysqlUrl = "jdbc:mysql://localhost:3306/emp";
            Connection con = DriverManager.getConnection(mysqlUrl, "root", "knoldus");
            System.out.println("Successfully connected to MySQL database emp");
            //Creating a reader object
            Reader reader = new BufferedReader(new FileReader("com/knoldus/db.sql"));
            //create statement
            Statement stmt = con.createStatement();
            //execute a sql query
            stmt.executeUpdate(String.valueOf(reader));
            ResultSet res = stmt.executeQuery("select * from emp");
            System.out.println(res);
            //process the result
            while (res.next()) {
                System.out.println(res.getString("age"));
            }
        } catch (SQLException | FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
