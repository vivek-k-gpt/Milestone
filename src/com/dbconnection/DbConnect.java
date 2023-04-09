package com.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnect {
	static Connection con;

    public static Connection createConnection(){

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String user="root";
            String pass="root";
            String url = "jdbc:mysql://localhost:3306/myworkdb";

            con= DriverManager.getConnection(url,user,pass);

        }
        catch(Exception ex){
            ex.printStackTrace();
            System.out.println("connection not establish");
        }

        return con;
    }
}
