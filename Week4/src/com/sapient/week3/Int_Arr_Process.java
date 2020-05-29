package com.sapient.week3;

import java.util.Arrays;

public class Int_Arr_Process {
	private int array[] ;
	private int size ;
	
	Int_Arr_Process() {
		array = new int[10];
	}

	Int_Arr_Process(int size){
		this.size = size;
		array = new int[size];
	}
	
	
	Int_Arr_Process(int[] arr) {
		size = arr.length;
		array = new int[size];
		for(int i=0;i<size;i++) {
			array[i] = arr[i];
		}
	}
	
	void readArray() {
		for(int i=0;i<size;i++) {
			array[i] = Read.readInt();
		}
	}
	
	void sort() {
		Arrays.sort(array);
	}
	
	void getMin() {
		System.out.println("Min = "+Arrays.stream(array).min().getAsInt());
	}
	
	void getMax() {
		System.out.println("Max = "+Arrays.stream(array).max().getAsInt());
	}
	
	void getSum() {
		System.out.println("Sum = "+Arrays.stream(array).reduce(0,(num1, num2)-> num1+num2));
	}
	
	void displayV() {

		 	Arrays.stream(array).forEach(element -> System.out.println(element));
	}

	void displayH() {
		Arrays.stream(array).forEach(element -> System.out.print(element+ " "));
	}
}
