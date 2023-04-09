package com.runner;
import com.repository.UserRepo;
import com.service.BookService;
import com.service.UserService;
import com.repository.BookRepo;
import com.runner.Menu;

import com.pojo.Book;
import java.util.List;
import java.util.Scanner;



public class Runner {
	

	public static void main(String[] args) throws LoginFailed  {
		
		try (Scanner sci = new Scanner(System.in)) {
			UserService service = new UserService();
			BookService bookService = new BookService();

			System.out.println("Welcome to the Console Application");
			String s = "";

			
			do {

				Menu.menu();
				System.out.println("Enter your Choice");
				int choice = sci.nextInt();

				switch (choice) {

				case 1: {
					// register
					
					if(service.register()){
						System.out.println("you register succesfully");
					}
					
					
					break;
				}
				
				case 2: {
					// login as user
					if(service.loginuser()) {
						
						System.out.println("user Logged in succesfully");
					}
					else {
						System.out.println("login failed");
						throw new LoginFailed("Invalid credentials");
					}
					
					do {

						Menu.subMenuUser();

						int userChoice = sci.nextInt();
						switch (userChoice) {

						case 1: {
							List<Book> books = bookService.getAllBooks();
							for(Book to : books) {
								
			//System.out.println(to.getBookId()+", "+to.getBookName()+", "+to.getDescription() + " ," + to.getPrice()+""+to.getAuthorName());
								System.out.println(to);
							}
							break;
						}
						case 2: {
							//search by authorname
							List<Book> books = bookService.getBooksByAuthorName();
							for(Book to : books) {
								
								//System.out.println(to.getBookId()+", "+to.getBookName()+", "+to.getDescription() + " ," + to.getPrice()+""+to.getAuthorName());
													System.out.println(to);
												}
							
							break;
						}
						case 3: {
							//search by title name
							List<Book> books = bookService.getBooksBytitleName();
							for(Book to : books) {
								
								//System.out.println(to.getBookId()+", "+to.getBookName()+", "+to.getDescription() + " ," + to.getPrice()+""+to.getAuthorName());
													System.out.println(to);
												}
							break;
						}
						case 4: {
							//search by publication name
							List<Book> books = bookService.getBooksBypublName();
							for(Book to : books) {
								
								//System.out.println(to.getBookId()+", "+to.getBookName()+", "+to.getDescription() + " ," + to.getPrice()+""+to.getAuthorName());
													System.out.println(to);
												}
							break;
						}
						case 5: {
							//search by bookid
							List<Book> books = bookService.getBooksById();
							for(Book to : books) {
								
								//System.out.println(to.getBookId()+", "+to.getBookName()+", "+to.getDescription() + " ," + to.getPrice()+""+to.getAuthorName());
													System.out.println(to);
												}

							
							break;
						}
						case 6: {
							//add book in fvt list
								bookService.addFvt();
							break;
						}

						default: {
							try {
								throw new InvalidInputException("Invalid Input");
							} catch (InvalidInputException e) {
								e.printStackTrace();
							}
							break;
						}
						}

						System.out.println("Do you Wish to Continue : select Yes or No ");
						s = sci.next();
					} while (s.equalsIgnoreCase("yes"));

					break;

				}
				case 3: {
					// login with adminprivillage
					
					if(service.loginadmin()) {
						
						System.out.println("Admin Logged in succesfully");
					}
					else {
						
						System.out.println("login failed");
						throw new LoginFailed("Invalid credentials");
					}
					do {

						Menu.subMenuAdmin();

						int adminChoice = sci.nextInt();
						switch (adminChoice) {

						case 1: {//insert new book
							bookService.addBook();
							break;
						}
						case 2: {
							//remove book;
							bookService.removeBook();
							break;
						}
						case 3: {
							//update book
							bookService.updateBook();
							break;
						}
						case 4: {
							//search book by id  or authorname
							List<Book> books = bookService.getBooksByIdorauthor();
							for(Book to : books) {
								
								//System.out.println(to.getBookId()+", "+to.getBookName()+", "+to.getDescription() + " ," + to.getPrice()+""+to.getAuthorName());
													System.out.println(to);
												}

							break;
						}
						case 5: {
							//list all book
							List<Book> books = bookService.getAllBooks();
							for(Book to : books) {
								
			//System.out.println(to.getBookId()+", "+to.getBookName()+", "+to.getDescription() + " ," + to.getPrice()+""+to.getAuthorName());
								System.out.println(to);
							}
							break;
						}
						case 6: {
							//count total book
							int result = bookService.count();
							System.out.println("Total books are : " + result);
							break;
						}
						
						default: {
							try {
								throw new InvalidInputException("Invalid Input");
							} catch (InvalidInputException e) {
								e.printStackTrace();
							}
							break;
						}
						}
						
						System.out.println("Do you Wish to Continue : select Yes or No ");
						s = sci.next();
					} while (s.equalsIgnoreCase("yes"));
					break;
				}
				case 0: {
					// log out
					System.out.println("Loggged out SuccesFully");
					System.exit(0);

				}
				default: {
					try {
						throw new InvalidInputException("Invalid Input");
					} catch (InvalidInputException e) {
						e.printStackTrace();
					}

					break;
				}
				}
				System.out.println();
				
				System.out.println("Do you Wish to Continue : select Yes or No ");
				s = sci.next();

			} while (s.equalsIgnoreCase("yes"));
		}
		System.out.println("Bye Thanks for using me");
		}
	}

