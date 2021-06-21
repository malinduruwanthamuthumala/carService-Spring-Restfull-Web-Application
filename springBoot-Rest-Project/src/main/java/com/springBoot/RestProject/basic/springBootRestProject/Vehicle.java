package com.springBoot.RestProject.basic.springBootRestProject;

public class Vehicle {

	long id;
	String type;
	String regNumber;
	
	public Vehicle(long id, String type, String regNumber) {
		super();
		this.id = id;
		this.type = type;
		this.regNumber = regNumber;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRegNumber() {
		return regNumber;
	}

	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}
	
	
}
