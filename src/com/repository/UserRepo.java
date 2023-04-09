package com.repository;
import com.dbconnection.DbConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import com.pojo.User;

public class UserRepo {
	Connection connection  = DbConnect.createConnection();

	public boolean register(User user) {
	
	try {
			
			PreparedStatement statement = connection.prepareStatement("insert into userin values(?, ?, ?, ? ,?)");

			statement.setString(1, user.getUsername());
			statement.setString(2, user.getPassword());
			statement.setString(3, user.getFirstName());
			statement.setString(4, user.getLastName());
			statement.setString(5, user.getRole());
			

			statement.executeUpdate();
			return true;
		}
		catch (Exception e) {
			System.out.println("inside regsiter of UserRepository");
			return false;
		}
		
	}

	public boolean login(String username,String password,String role) {
		
		
try {
			
			PreparedStatement statement = connection.prepareStatement("select * from userin where username = ? and (pass = ? and rolle = ?)");

			statement.setString(1, username);
			statement.setString(2,password);
			statement.setString(3,role);
			
			ResultSet resultset =  statement.executeQuery();
			
			if(resultset.next() == true) {
			
				return true;
			}
			
		}
		catch(Exception e) {
			
			System.out.println("inside catch of Login of UserRepo");
		}
		
		return false;
		
	}

}
