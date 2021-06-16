package com.spring.restfull.carservice.carservice;

public class Car {

	private Integer id;
	private String regNumber;
	private String type;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRegNumber() {
		return regNumber;
	}

	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Car(Integer id, String regNumber, String type) {
		super();
		this.id = id;
		this.regNumber = regNumber;
		this.type = type;
	}
	
	
}
