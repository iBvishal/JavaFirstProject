package com.sapient.shapes;

import java.util.Scanner;

public class Shapes {
	int numberOfSides;
	int side ;
	Scanner sc = new Scanner(System.in);

	void setNumberOfSides() {
		System.out.println("Enter number of Sides");
		this.numberOfSides = sc.nextInt();
	}
	
	void setSide() {
		System.out.println("Enter Value of Side");
		this.side =  sc.nextInt();
	}
	
	void calculateShapeArea() {
		switch (this.numberOfSides) {
			case 1: {
				Circle circle = new Circle();
				circle.setRadius(this.side);
				circle.calculateArea();
				break ;
			}
			case 3: {
				Triangle triangle = new Triangle();
				triangle.setSide(side);
				triangle.calculateArea();
				break;
			}
			case 4 : {
				Square square = new Square();
				square.setSide(side);
				square.calculateArea();
				break ;
			}
			default : {
				System.out.println("No Shapes Present");
				break ;
			}
		}
	}
}
