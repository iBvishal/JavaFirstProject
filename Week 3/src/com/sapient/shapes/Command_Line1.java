package com.sapient.shapes;

import java.util.Scanner;

public class Command_Line1 {
	int sum, max, min, size ;
	double avg ;
	int arr[];
	
	public void displayData() {
		System.out.println("\nSum = " + sum + "\nAverage = " + avg + "\nBiggest = " + max + "\nSmallest ="+ min);
	}
	
	void getData(int n){
		this.size = n ;
		Scanner sc = new Scanner(System.in);
		this.arr = new int[n];
		for(int i=0;i<n;i++) {
			this.arr[i] = sc.nextInt();
		}
	}
	void setData() {
		max = Integer.MIN_VALUE ;
		min = Integer.MAX_VALUE ;
		sum = 0;
		for(int i=0;i<this.size;i++) {
			if(this.arr[i] > this.max) this.max = this.arr[i];
			if(this.arr[i] < this.min) this.min = this.arr[i];
			this.sum += this.arr[i];
		}
		this.avg = this.sum / (double)this.size;
	}
}
