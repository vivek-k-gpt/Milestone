package com.runner;

import javax.management.RuntimeErrorException;

public class Menu {

	public static void menu() {
		System.out.println("Select options to Perform The task");
		System.out.println("Enter 1 to register");
		System.out.println("Enter 2 to Login as User"); 
		System.out.println("Enter 3 to Login as Admin");  
		System.out.println("Enter 0 to Log Out");
	}

	public static void subMenuUser() {
		System.out.println("Welcome User: Select option to perform the task");
		System.out.println("Enter 1 for list all Books");
		System.out.println("Enter 2 to search the book by Author Name");
		System.out.println("Enter 3 to search by title Name");
		System.out.println("Enter 4 to search by publication/Description Name");
		System.out.println("Enter 5 to search by Book id");
		System.out.println("enter 6 to add books in favourite list and also in completed list");
		
		
	}
	
	public static void subMenuAdmin() {
		System.out.println("Welcome Admin: Select option to perform the task");
		System.out.println("Enter 1 for insert new  Book");
		System.out.println("Enter 2 for remove Book");
		System.out.println("Enter 3 for update Book");
		System.out.println("Enter 4 to search Book by id or author");
		System.out.println("Enter 5 for list all Book");
		System.out.println("Enter 6 for count all Book");
		
	}
	
}

class InvalidInputException extends Exception{

	public InvalidInputException(String message) {
		super(message);
	}


	
}
class LoginFailed extends RuntimeException{
	public LoginFailed(String msg) {
		super(msg);
	}
}

