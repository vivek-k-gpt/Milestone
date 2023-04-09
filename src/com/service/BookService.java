package com.service;

import com.repository.BookRepo;
import java.util.List;
import java.util.Scanner;
import com.pojo.Book;



public class BookService{
	BookRepo bookRepository = new BookRepo();
	Scanner sc = new Scanner(System.in);
	
	public List<Book> getAllBooks() {
		
		return bookRepository.findAllBooks();	
	}

	public List<Book> getBooksByAuthorName() {
		// TODO Auto-generated method stub
		System.out.println("enter Author Name  to search book");
		String authName = sc.next();
		
		return bookRepository.findAllBooksbyAuth(authName);
	}

	public List<Book> getBooksBytitleName() {
		// TODO Auto-generated method stub
		System.out.println("enter title to search book");
		String titlename = sc.next();
		
		return bookRepository.findAllBooksbytit(titlename);
	
	}

	public List<Book> getBooksBypublName() {
		// TODO Auto-generated method stub
		System.out.println("enter publicationName to search book");
		String publname = sc.next();
		
		return bookRepository.findAllBooksbypub(publname);
	
	}

	public List<Book> getBooksById() {
		// TODO Auto-generated method stub
		System.out.println("enter book id to search book");
		String publname = sc.next();
		
		return bookRepository.findAllBooksbyid(publname);
		
	}

	public void addFvt() {
		System.out.println("enter your username");
		String username = sc.next();
		
		System.out.println("enter the bookid of your fvt book");
		int fvtbookid = sc.nextInt();

		
		System.out.println("enter the bookid of completed  book");
		int cmpletedBookIde = sc.nextInt();
		
		bookRepository.addFvtandCompletedBookInfo(username,fvtbookid,cmpletedBookIde);
		
	}
	//server data export gl export progress

	public void addBook() {
		// TODO Auto-generated method stub
		System.out.println("Enter bookname ");
		String bookname = sc.next();
		System.out.println("Enter book id");
		String bookid = sc.next();
		System.out.println("enter author name");
		String authname = sc.next();
		System.out.println("enter description about book or publication name");
		String publname = sc.next();
		System.out.println("enter price of book");
		int price = sc.nextInt();
		
		
		Book b1 = new Book(bookname,bookid,authname,publname,price);
		bookRepository.addBook(b1);
	}

	public void removeBook() {
		// TODO Auto-generated method stub
		System.out.println("Enter bookid to remove book");
		String bkid = sc.next();
		
		bookRepository.rmvbook(bkid);
		
	}

	public void updateBook() {
		// TODO Auto-generated method stub
		System.out.println("Enter bookid to update book");
		String bkid = sc.next();
		System.out.println("Enter booktitle to update");
		String  updatebktitle = sc.next();
		
		bookRepository.updateBook(bkid, updatebktitle);
	}

	public int count() {
		// TODO Auto-generated method stub
		return bookRepository.countBook();
		
	}

	public List<Book> getBooksByIdorauthor() {
		// TODO Auto-generated method stub
		System.out.println("enter the book id");
		String bookid = sc.next();
		
		System.out.println("enter the author name");
		String authname = sc.next();
		return bookRepository.getBookbyidorAuth(bookid,authname);
	}

	

}
