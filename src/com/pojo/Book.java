package com.pojo;

public class Book {
	
	private String bookName;
	private String bookId;
	private String authorName;
	private String description;
	private int noOfCopiesSold;
	private int price;
	public Book() {
		
	}
	//table name bookinfoo
	public Book(String bookName, String bookId, String authorName, String description, int price) {
	
		this.bookName = bookName;
		this.bookId = bookId;
		this.authorName = authorName;
		this.description = description;
		this.price = price;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getNoOfCopiesSold() {
		return noOfCopiesSold;
	}
	public void setNoOfCopiesSold(int noOfCopiesSold) {
		this.noOfCopiesSold = noOfCopiesSold;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", bookId=" + bookId + ", authorName=" + authorName + ", description="
				+ description + ", price=" + price + "]";
	}
	
	
	
	
}
