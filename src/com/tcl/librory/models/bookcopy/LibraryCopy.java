package com.tcl.librory.models.bookcopy;

import java.util.Date;

import com.tcl.librory.models.Book;
import com.tcl.librory.models.BookCopy;

public class LibraryCopy extends BookCopy {
	
	private Boolean forMembers;
	
	public LibraryCopy() {
	}

	public LibraryCopy(long id, Book book, long controlNumber, double price, Date purchaseDate, boolean formembers) {
		super(id, book, controlNumber, price, purchaseDate);
		this.forMembers = formembers;
	}
	public Boolean getForMembers() {
		return forMembers;
	}

	public void setForMembers(Boolean forMembers) {
		this.forMembers = forMembers;
	}

}
