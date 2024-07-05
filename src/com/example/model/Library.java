package com.example.model;

import java.util.ArrayList;

public class Library {
	private ArrayList<Book> books = new ArrayList<Book>();
	private ArrayList<Member> members = new ArrayList<Member>();
	
	public Library() {
	}
	
	public void addBook(Book book) {
		books.add(book);
	}
	
	public void addMember(Member member) {
		members.add(member);
	}
	
	public void borrowBook(Member member, Book book) {
		member.borrowBook(book);
	}
	
	public void returnBook(Member member, Book book) {
		member.returnBook(book);
	}
	
	public Member findMember(int memberId) {
		for(Member member : members ) {
			if(member.getMemberId()==memberId) {
				return member;
			}
		}
		return null;
	}
	
	public Book findBook(String title) {
		for(Book book : books) {
			if(book.getTitle().equalsIgnoreCase(title)) {
				return book;
			}
		}
		
		return null;
	}
	
	public void displayBooks() {
		for(Book book : books) {
			System.out.print(book);
		}
	}
	
	public void displayMembers() {
		for(Member member : members) {
			System.out.print(member);
		}
	}
}
