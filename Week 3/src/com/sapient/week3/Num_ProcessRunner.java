package com.sapient.week3;

public class Num_ProcessRunner {
	public static void main(String[] args) {
		Num_Process ob[] = new Num_Process[4];
		ob[0] = (a,b)-> (a+b);
		ob[1] = (a,b)-> (a-b);
		ob[2] = (a,b)-> (a*b);
		ob[3] = (a,b)-> (a/b);
		int n = Read.readInt();
		int a = Read.readInt();
		int b = Read.readInt();
		System.out.println(ob[n-1].cal(a, b));
	}
}
