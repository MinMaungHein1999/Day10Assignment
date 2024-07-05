package com.example.model;

import java.util.ArrayList;

public class Member {
	private String name;
	private int memberId;
	private ArrayList<Book> borrowedBooks=new ArrayList<Book>();
	
	public Member(String name, int memberId) {
		this.name = name;
		this.memberId = memberId;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void borrowBook(Book book) {
		if(book.isAvailable()) {
			book.borrow();
			borrowedBooks.add(book);
			System.out.println("Borrowed Success!!!");
		}else {
			System.out.println("Can't Borrow");
		}
	}
	
	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public void returnBook(Book book) {
		book.returnBook();
		borrowedBooks.remove(book);
		System.out.println("Book Returned !!!");
	}

	@Override
	public String toString() {
		return "\nMember ( Name : "+this.name+" Id : "+this.memberId+" )";
	}
	
	
	

}
