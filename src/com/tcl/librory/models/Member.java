package com.tcl.librory.models;

import java.util.Date;

public class Member extends User {
	
	private String emailAddress;
	private Date birthDate;
	private String address;
	private Librarian approvedBy;
	
	public Member(){
	}
	
	public Member(Long id, String username, String password, String firstName, String lastName,
			String emailAddress, Date birthDate, String address, Librarian approvedBy) {
		super(id, username, password, firstName, lastName);
		this.emailAddress = emailAddress;
		this.birthDate = birthDate;
		this.address = address;
		this.approvedBy = approvedBy;
	}

	public void borrow(Long copyId)
	{
		throw new UnsupportedOperationException("Need to code method.");
	}
	
	public void renew(Long transactionId)
	{
		throw new UnsupportedOperationException("Need to code method.");
	}
	
	public void returnBook(Long transactionId)
	{
		throw new UnsupportedOperationException("Need to code method.");
	}
	
	public void register()
	{
		
	}
	
	public void cancelBorrow(Long id)
	{
		throw new UnsupportedOperationException("Need to code method.");
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Librarian getApprovedBy() {
		return approvedBy;
	}

	public void setApprovedBy(Librarian approvedBy) {
		this.approvedBy = approvedBy;
	}
}
