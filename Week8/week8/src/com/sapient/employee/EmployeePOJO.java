package com.sapient.employee;

public class EmployeePOJO {
	int id;
	String name;
	String city;	
	
	EmployeePOJO(){
		this.id = 0;
        this.name = "";
        this.city = "";
	}
	
	EmployeePOJO(int id, String name, String city) {
	        this.id = id;
	        this.name = name;
	        this.city = city;
	 }

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
}
