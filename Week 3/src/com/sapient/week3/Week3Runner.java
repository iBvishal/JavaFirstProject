package com.sapient.week3;

public class Week3Runner {

	public static void main(String[] args) {
//		Question 1
		Int_Arr_Process obj = new Int_Arr_Process(5);
		obj.readArray();
		obj.sort();
		obj.getSum();
		obj.getMax();
		obj.getMin();
		obj.displayV();
		obj.displayH();
		
//		Question 2
		Matrix mat1 = new Matrix(2);
		Matrix mat2 = new Matrix(2);
		mat1.readMatrix();
		mat2.readMatrix();
		mat1.addMatrix(mat2);
		mat1.isSaclar();
		mat1.multiply(mat2);
		
//		Question 3
		
		
	}
}
