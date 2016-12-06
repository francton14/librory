package com.tcl.librory.models;

public class Category {
	
	 private Long id;
	 private Double lateFine;
	 private Double lostFine;
	 private Integer maxDuration;
	 
	public Category() {
	}

	public Category(Long id, Double lateFine, Double lostFine, Integer maxDuration) {
		super();
		this.id = id;
		this.lateFine = lateFine;
		this.lostFine = lostFine;
		this.maxDuration = maxDuration;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Double getLateFine() {
		return lateFine;
	}
	
	public void setLateFine(Double lateFine) {
		this.lateFine = lateFine;
	}
	
	public Double getLostFine() {
		return lostFine;
	}
	
	public void setLostFine(Double lostFine) {
		this.lostFine = lostFine;
	}
	
	public Integer getMaxDuration() {
		return maxDuration;
	}
	
	public void setMaxDuration(Integer maxDuration) {
		this.maxDuration = maxDuration;
	}

}
