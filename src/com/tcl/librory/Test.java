package com.tcl.librory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.tcl.librory.models.Author;
import com.tcl.librory.models.Book;
import com.tcl.librory.models.Publisher;

public class Test {

	public static void main(String[] args) {
		List<Book> books = new ArrayList<>();
		List<Author> authors = new ArrayList<>();
		authors.add(new Author(Long.valueOf(1), "Margallo", "Franc", "Cebu City", "4123124"));
		authors.add(new Author(Long.valueOf(2), "Margallo", "Francis", "Cebu City", "4123124"));
		authors.add(new Author(Long.valueOf(3), "Margallo", "Frankel", "Cebu City", "4123124"));
		List<Publisher> publishers = new ArrayList<>();
		publishers.add(new Publisher(Long.valueOf(1), "Margallo Publishing", "Cebu City", "1111222"));
		publishers.add(new Publisher(Long.valueOf(2), "Ong Vaño Publishing", "Cordova", "1111222"));
		publishers.add(new Publisher(Long.valueOf(3), "Uriarte Publishing", "Cebu City", "1111222"));
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);			
			boolean quit = false;
			Long id = Long.valueOf(1);
			do {
				System.out.println("1. Add new Book");
				System.out.println("2. Display Books");
				System.out.println("3. Remove Book");
				System.out.println("4. Exit");
				switch (scanner.nextInt()) {
				case 1:
					scanner.nextLine();
					System.out.println("ISBN: ");
					Long isbn = scanner.nextLong();
					scanner.nextLine();
					System.out.println("Title: ");
					String title = scanner.nextLine();
					System.out.println("Published Date: ");
					Date publishedDate = new SimpleDateFormat("MM-dd-yyyy").parse(scanner.nextLine());
					System.out.println("Author: ");
					Author author = authors.get(scanner.nextInt());
					scanner.nextLine();
					System.out.println("Publisher: ");
					Publisher publisher = publishers.get(scanner.nextInt());
					scanner.nextLine();
					System.out.println("Description: ");
					String description = scanner.nextLine();
					books.add(new Book(id++, isbn, title, description, publishedDate, publisher, author));
					break;
				case 2:
					System.out.println("Books: ");
					for (Book book : books) {
						System.out.println(book.getId() + " " + book.getISBN() + " " + book.getTitle() + " " + book.getAuthor().getFirstName() + " " + book.getAuthor().getLastName() + " " + book.getPublisher().getName() + " " + book.getPublishedDate());
					}
					break;
				case 3:
					System.out.println("Books: ");
					for (Book book : books) {
						System.out.println(book.getId() + " " + book.getISBN() + " " + book.getTitle() + " " + book.getAuthor().getFirstName() + " " + book.getAuthor().getLastName() + " " + book.getPublisher().getName() + " " + book.getPublishedDate());
					}
					System.out.println("Book ID: ");
					int toBeDeleted = scanner.nextInt();
					books.remove(toBeDeleted);
					break;
				case 4:
					quit = true;
					break;
				}
			} while (!quit);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
		
	}
	
}
