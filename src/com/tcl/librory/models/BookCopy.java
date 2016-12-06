package com.tcl.librory.models;

import java.util.Date;

public abstract class BookCopy {
	private Long id, controlNumber;
	private Book book;
	private Double price;
	private Date purchaseDate;
	
	public BookCopy(){
		
	}
	
	public BookCopy(long id, Book book, long controlNumber, double price, Date purchaseDate){
		this.book = book;
		this.id = id;
		this.controlNumber = controlNumber;
		this.price = price;
		this.purchaseDate = purchaseDate;
	}

	public Long getId() {
		return id;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Long getControlNumber() {
		return controlNumber;
	}

	public Double getPrice() {
		return price;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
}
