package com.example.customer;

import javax.persistence.Id;

public class Customer {
	
	@Id
	private String id;
	public String FistName;
	public String LastName;
	public int year;
	
	public Customer() {}

	public Customer(String id, String fistName, String lastName, int year) {
		super();
		this.id = id;
		FistName = fistName;
		LastName = lastName;
		this.year = year;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFistName() {
		return FistName;
	}

	public void setFistName(String fistName) {
		FistName = fistName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", FistName=" + FistName + ", LastName=" + LastName + ", year=" + year + "]";
	}

}
