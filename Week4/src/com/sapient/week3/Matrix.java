package com.sapient.week3;

import java.util.Arrays;

public class Matrix {
	private int[][] array;
	int n;

	Matrix(int n) {
		this.n = n;
		array = new int[n][n];
	}

	Matrix() {
		n = 3;
		array = new int[3][3];
	}

	Matrix(int[][] arr) {
		n = arr.length;
		array = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				array[i][j] = arr[i][j];
			}
		}
	}

	void readMatrix() {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				array[i][j] = Read.readInt();
			}
		}
	}

	void display() {
		for (int[] row : array) {
			System.out.println(Arrays.toString(row));
		}
	}

	void addMatrix(Matrix that) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				this.array[i][j] += that.array[i][j];
			}
		}
		this.display();
	}

	void isSaclar() {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					if (array[i][j] != 1) {
						System.out.println("Not Scalar");
						return;
					}
				} else {
					if (array[i][j] != 0) {
						System.out.println("Not Scalar");
						return;
					}
				}
			}
		}
		System.out.println("Scalar");
	}

	void multiply(Matrix that) {
		if (this.n == that.n) {
			Matrix res = new Matrix(this.n);
			for (int i = 0; i < this.n; i++) {
				for (int j = 0; j < that.n; j++) {
					res.array[i][j] = 0;
					for (int k = 0; k < this.n; k++) {
						res.array[i][j] += this.array[i][k] * that.array[k][j];
					}
				}
			}
			res.display();
		} else {
			System.out.println("Multiplication Operation is not compatible...");
		}
	}
}
