package com.sapient.week8;
import java.lang.Math; 

public class CalculatorRunner implements NormalOperations, AdvanceOperations {

	@Override
	public double log(double a) throws Exception {
		return Math.log(a);
	}

	@Override
	public int add(int a, int b) {
		return a+b;
	}

	@Override
	public int sub(int a, int b) {
		return a-b;
	}

	@Override
	public int mul(int a, int b) {
		return a*b;
	}

	@Override
	public int div(int a, int b) throws Exception {
		if (b==0) {
			throw new Exception("Divison by zero");
		}
		return a/b;
	}

}
