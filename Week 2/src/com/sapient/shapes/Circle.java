package com.sapient.shapes;

public class Circle {
	int radius;
	public void setRadius(int num){
		this.radius = num ;
	}
	public void calculateArea() {
		System.out.println("The area of Circle is "+ 3.14*radius*radius);
	}
}
