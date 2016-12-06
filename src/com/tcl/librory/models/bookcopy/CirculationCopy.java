package com.tcl.librory.models.bookcopy;

import java.util.Date;

import com.tcl.librory.models.Book;
import com.tcl.librory.models.BookCopy;

public class CirculationCopy extends BookCopy{
	
	private Boolean available;

	public CirculationCopy() {
	}

	public CirculationCopy(long id, Book book, long controlNumber, double price, Date purchaseDate, boolean available) {
		super(id, book, controlNumber, price, purchaseDate);
		this.available = available;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	
	
}
