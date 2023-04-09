package com.pojo;

import java.util.List;

public class User {
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String role;
	
	private List<Book> favouriteBooks;
	private List<Book> completedBooks;

	
	
	public User() {
		
	}
	
	
//table name userin

	public User(String username, String password, String firstName, String lastName, String role) {
	
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.role = role;
	}




	public String getUsername() {
		return username;
	}




	public void setUsername(String username) {
		this.username = username;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}




	public String getFirstName() {
		return firstName;
	}




	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}




	public String getLastName() {
		return lastName;
	}




	public void setLastName(String lastName) {
		this.lastName = lastName;
	}




	public List<Book> getFavouriteBooks() {
		return favouriteBooks;
	}




	public void setFavouriteBooks(List<Book> favouriteBooks) {
		this.favouriteBooks = favouriteBooks;
	}




	public List<Book> getCompletedBooks() {
		return completedBooks;
	}




	public void setCompletedBooks(List<Book> completedBooks) {
		this.completedBooks = completedBooks;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}





	
}
