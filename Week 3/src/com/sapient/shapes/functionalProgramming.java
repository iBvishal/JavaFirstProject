package com.sapient.shapes;

import java.util.List;

public class functionalProgramming {
	public static void main(String[] args) {
		List<Integer> list = java.util.List.of(1, 3,3, 8);
		printBasic(list);
//		printWithFP(list);
	}

	public static void printBasic(List<Integer> list) {
		for(String Integer:list) {
			System.out.println(string);
		}
	}
	
	public static void printWithFP(List<Integer> list) {
		list.stream().filter(element -> element%2 == 0).reduce(0, element -> S );
	}
}
