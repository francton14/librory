package com.tcl.librory.models;

import java.util.Date;

public class Book {
	private Long id, ISBN;
	private String title, description;
	private Date publishedDate;
	private Publisher publisher;
	private Author author;
	
	public Book() {
	}
	
	public Book(Long id, Long iSBN, String title, String description, Date publishedDate, Publisher publisher,
			Author author) {
		super();
		this.id = id;
		ISBN = iSBN;
		this.title = title;
		this.description = description;
		this.publishedDate = publishedDate;
		this.publisher = publisher;
		this.author = author;
	}

	public Long getISBN() {
		return ISBN;
	}

	public void setISBN(Long ISBN) {
		this.ISBN = ISBN;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getPublishedDate() {
		return publishedDate;
	}

	public void setPublishedDate(Date publishedDate) {
		this.publishedDate = publishedDate;
	}

	public Long getId() {
		return id;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public void setId(Long id) {
		this.id = id;
	}	
	
}
