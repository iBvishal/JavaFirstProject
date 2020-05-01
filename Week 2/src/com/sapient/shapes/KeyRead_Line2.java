package com.sapient.shapes;
import java.util.Arrays;
import java.util.Scanner;

public class KeyRead_Line2 {
	int arr[];
	int size;
	Scanner sc = new Scanner(System.in);
	
	public void read() {
		this.size = sc.nextInt();
		this.arr = new int[size];
		for(int i=0;i<size;i++) {
			this.arr[i] = sc.nextInt();
		}
		sc.close();
	}
	
	public void display() {
	     System.out.printf("Elements in arr[] : %s\n", Arrays.toString(arr));
	}
	
	public void sort() {
		 Arrays.sort(arr); 
		 display();
	}
	
	public boolean find(int toFind) {
		for(int i=0;i<size;i++) {
			if(this.arr[i]==toFind)	return true;
		}
		return false;
	}
}
