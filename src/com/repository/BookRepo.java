package com.repository;

import com.dbconnection.DbConnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import com.pojo.Book;

public class BookRepo {
	Connection connection  = DbConnect.createConnection();
	
	

	
	public List<Book> findAllBooks() {
		
		List<Book> books = new ArrayList<Book>();
		
		try {
			
			PreparedStatement statement = connection.prepareStatement("select * from bookinfoo");
			
			ResultSet resultSet =  statement.executeQuery();
			while(resultSet.next()) {
				
				String bookname = resultSet.getString(1);
				String  bookid = resultSet.getString(2);
				String authorname  = resultSet.getString(3);
				String desc = resultSet.getString(4);
				int price = resultSet.getInt(5);
				
				Book bookTO = new Book(bookname, bookid, authorname,desc,price);
				books.add(bookTO);
			}
			
		}
		
		catch (Exception e) {
			System.out.println("inside catch of BooKRepo");
		}
		
		return books;
		
		
	}




	public List<Book> findAllBooksbyAuth(String authname) {
		List<Book> books = new ArrayList<Book>();
		
		try {
			
			PreparedStatement statement = connection.prepareStatement("select * from bookinfoo where authorname = ?");
			
			statement.setString(1, authname);
			ResultSet resultSet =  statement.executeQuery();
			while(resultSet.next()) {
				
				String bookname = resultSet.getString(1);
				String  bookid = resultSet.getString(2);
				String authorname  = resultSet.getString(3);
				String desc = resultSet.getString(4);
				int price = resultSet.getInt(5);
				
				Book bookTO = new Book(bookname, bookid, authorname,desc,price);
				books.add(bookTO);
			}
			
		}
		
		catch (Exception e) {
			System.out.println("inside catch of BooKRepo");
		}
		
		return books;
		
		
	}




	public List<Book> findAllBooksbytit(String titlename) {
		// TODO Auto-generated method stub
		
		
	List<Book> books = new ArrayList<Book>();
		
		try {
			
			PreparedStatement statement = connection.prepareStatement("select * from bookinfoo where bookname = ?");
			
			statement.setString(1, titlename);
			ResultSet resultSet =  statement.executeQuery();
			while(resultSet.next()) {
				
				String bookname = resultSet.getString(1);
				String  bookid = resultSet.getString(2);
				String authorname  = resultSet.getString(3);
				String desc = resultSet.getString(4);
				int price = resultSet.getInt(5);
				
				Book bookTO = new Book(bookname, bookid, authorname,desc,price);
				books.add(bookTO);
			}
			
		}
		
		catch (Exception e) {
			System.out.println("inside catch of BooKRepo");
		}
		
		return books;
		
		
	}




	public List<Book> findAllBooksbypub(String publname) {
		// TODO Auto-generated method stub
List<Book> books = new ArrayList<Book>();
		
		try {
			
			PreparedStatement statement = connection.prepareStatement("select * from bookinfoo where descript = ?");
			
			statement.setString(1, publname);
			ResultSet resultSet =  statement.executeQuery();
			while(resultSet.next()) {
				
				String bookname = resultSet.getString(1);
				String  bookid = resultSet.getString(2);
				String authorname  = resultSet.getString(3);
				String desc = resultSet.getString(4);
				int price = resultSet.getInt(5);
				
				Book bookTO = new Book(bookname, bookid, authorname,desc,price);
				books.add(bookTO);
			}
			
		}
		
		catch (Exception e) {
			System.out.println("inside catch of BooKRepo");
		}
		
		return books;
		
	}




	public List<Book> findAllBooksbyid(String bookide) {
		// TODO Auto-generated method stub
		List<Book> books = new ArrayList<Book>();
		
		try {
			
			PreparedStatement statement = connection.prepareStatement("select * from bookinfoo where bookid = ?");
			
			statement.setString(1, bookide);
			ResultSet resultSet =  statement.executeQuery();
			while(resultSet.next()) {
				
				String bookname = resultSet.getString(1);
				String  bookid = resultSet.getString(2);
				String authorname  = resultSet.getString(3);
				String desc = resultSet.getString(4);
				int price = resultSet.getInt(5);
				
				Book bookTO = new Book(bookname, bookid, authorname,desc,price);
				books.add(bookTO);
			}
			
		}
		
		catch (Exception e) {
			System.out.println("inside catch of BooKRepo");
		}
		
		return books;
		
	}




	public void addFvtandCompletedBookInfo(String username, int fvtbookid, int cmpletedBookIde) {
	
		try {
			
PreparedStatement statement = connection.prepareStatement("insert into booklistinfo(username,fvtlist,completedlist) values(?,?,?)");
			
			statement.setString(1, username);
			statement.setInt(2, fvtbookid);
			statement.setInt(3, cmpletedBookIde);
			 statement.executeUpdate();
		
			
		}
		
		catch (Exception e) {
			System.out.println("inside catch of BooKRepo");
		}
	}




	public void addBook(Book b1) {
		// TODO Auto-generated method stub
		
		try {
			
			PreparedStatement statement = connection.prepareStatement("insert into bookinfoo values(?,?,?,?,?)");
						
						statement.setString(1, b1.getBookName());
						statement.setString(2, b1.getBookId());
						statement.setString(3, b1.getAuthorName());
						statement.setString(4, b1.getDescription());
						statement.setInt(5, b1.getPrice());
						 statement.executeUpdate();
					
						
					}
					
					catch (Exception e) {
						System.out.println("inside catch of BooKRepo");
					}
				
	}




	public void rmvbook(String bkid) {
		
		try {
			
			PreparedStatement statement = connection.prepareStatement("delete from bookinfoo where bookid = ?");
						
						statement.setString(1, bkid);
						
						 statement.executeUpdate();
					
						
					}
					
					catch (Exception e) {
						System.out.println("inside catch of BooKRepo");
					}
		
	}




	public void updateBook(String bkid, String updatebktitle) {
		// TODO Auto-generated method stub
		try {
			
			PreparedStatement statement = connection.prepareStatement("update bookinfoo set bookname = ? where bookid = ?");
						statement.setString(1, updatebktitle);
						statement.setString(2, bkid);
						
						 statement.executeUpdate();
					
						
					}
					
					catch (Exception e) {
						System.out.println("inside catch of BooKRepo");
					}
		
	}




	public int countBook() {
		// TODO Auto-generated method stub
		int count = 0 ;
	try {
			
			PreparedStatement statement = connection.prepareStatement("select count(*) from bookinfoo");
						
						
						ResultSet rs =  statement.executeQuery();
					
						if(rs.next()) {
							count =  rs.getInt(1);
						
						}
					
					}
					
					catch (Exception e) {
						System.out.println("inside catch of BooKRepo");
					}
	return count;
	}




	public List<Book> getBookbyidorAuth(String bookide, String authname) {
		// TODO Auto-generated method stub
		List<Book> books = new ArrayList<Book>();
		
		try {
			
			PreparedStatement statement = connection.prepareStatement("select * from bookinfoo where bookid = ? or authorname = ?");
			
			statement.setString(1, bookide);
			statement.setString(2, authname);
			ResultSet resultSet =  statement.executeQuery();
			while(resultSet.next()) {
				
				String bookname = resultSet.getString(1);
				String  bookid = resultSet.getString(2);
				String authorname  = resultSet.getString(3);
				String desc = resultSet.getString(4);
				int price = resultSet.getInt(5);
				
				Book bookTO = new Book(bookname, bookid, authorname,desc,price);
				books.add(bookTO);
			}
			
		}
		
		catch (Exception e) {
			System.out.println("inside catch of BooKRepo");
		}
		
		return books;
	}
}
