package com.example.model;

public class Book {
	private String title;
	private String author;
	private String ISBN;
	private boolean isAvailable = true;
	
	public Book(String title, String author, String ISBN) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;	
	}
	
	
	public String getTitle() {
		return this.title;
	}
	
	public boolean isAvailable() {
		return this.isAvailable;
	}
	
	public void borrow() {
		this.isAvailable = false;
	}
	
	public void returnBook() {
		this.isAvailable = true;
	}


	@Override
	public String toString() {
		return "\nBook ( title : "+this.title+" author : "+this.author+" ISBN : "+this.ISBN+")\n";
	}

}
