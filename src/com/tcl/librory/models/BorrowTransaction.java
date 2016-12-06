package com.tcl.librory.models;

import java.util.Date;

public class BorrowTransaction 
{
	private Long transactionId;
	private Date dateBorrowed;
	private Date dateReturned;
	private byte renewed;
	private boolean damaged;
	private boolean lost;
	private Member borrower;
	private Librarian approvedBy;
	
	public BorrowTransaction() {
	}

	public Long getTransactionId() {
		return transactionId;
	}
	
	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}
	public Date getDateBorrowed() {
		return dateBorrowed;
	}
	public void setDateBorrowed(Date dateBorrowed) {
		this.dateBorrowed = dateBorrowed;
	}
	public Date getDateReturned() {
		return dateReturned;
	}
	public void setDateReturned(Date dateReturned) {
		this.dateReturned = dateReturned;
	}
	public byte getRenewed() {
		return renewed;
	}
	public void setRenewed(byte renewed) {
		this.renewed = renewed;
	}
	public boolean isDamaged() {
		return damaged;
	}
	public void setDamaged(boolean damaged) {
		this.damaged = damaged;
	}
	public boolean isLost() {
		return lost;
	}
	public void setLost(boolean lost) {
		this.lost = lost;
	}

	public Member getBorrower() {
		return borrower;
	}

	public void setBorrower(Member borrower) {
		this.borrower = borrower;
	}

	public Librarian getApprovedBy() {
		return approvedBy;
	}

	public void setApprovedBy(Librarian approvedBy) {
		this.approvedBy = approvedBy;
	}
}
