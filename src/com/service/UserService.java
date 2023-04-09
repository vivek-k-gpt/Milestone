package com.service;
import com.repository.UserRepo;
import com.pojo.User;

import java.util.*;



public class UserService  {

	

	UserRepo repository = new UserRepo();

	Scanner sc = new Scanner(System.in);

	public boolean register  () {
	
		
		System.out.println("Enter your username!!");
		String username = sc.next();
	
        
		System.out.println("Enter your password");
		String pass = sc.next();

		System.out.println("Enter your firstname");
		String firstname = sc.next();
		
		System.out.println("Enter your lasttname");
		String lastname = sc.next();
		
		System.out.println("Enter your Role : Input  Admin : for registering as a 'Admin' \n"
				+ "\t \t Input User : for registering as a 'User' ");
		String role = sc.next();

		User user = new User(username,pass,firstname,lastname ,role);

		  if(repository.register(user)) {
			  return true;
		  }
		  else {
			  return false;
		  }

			  
	}

	public boolean loginuser() {				
		System.out.println("Enter your username");
			String username = sc.next();
		System.out.println("Enter your password");
			String password = sc.next();
		
		
			return repository.login(username,password,"user");
	
}

	public boolean loginadmin() {
		
		System.out.println("Enter your username");
		String username = sc.next();
		System.out.println("Enter your password");
		String password = sc.next();
	
		return repository.login(username,password,"admin");
	}



}





