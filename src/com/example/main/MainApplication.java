package com.example.main;

import com.example.model.Book;
import com.example.model.Library;
import com.example.model.Member;

public class MainApplication {

	public static void main(String[] args) {
		
		Library library= new Library();
		
		Book b1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "454354545");
		Book b2 = new Book("1984", "George Orwell", "23434544433");
		Book b3 = new Book("To Kill a Mockingbird", "Harper Lee", "6989890000");
		
		library.addBook(b1);
		library.addBook(b2);
		library.addBook(b3);
		
		Member m1 = new Member("Min Maung Hein", 01);
		Member m2 = new Member("Kyaw TayZa", 02);
		Member m3 = new Member("Nyi Shine", 03);
		
		
		library.addMember(m1);
		library.addMember(m2);
		library.addMember(m3);
		
		
		library.borrowBook(m1, b3);
		library.borrowBook(m2, b1);
		library.borrowBook(m3, b2);
		
		library.displayMembers();
		library.displayBooks();
		
		library.returnBook(m1, b3);
		library.returnBook(m2, b1);
		library.returnBook(m3, b2);
		
		library.displayMembers();
		library.displayBooks();
		
		
		
		
		
		

	}

}
