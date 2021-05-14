package com.tech.javabasics.step12aggregationandinheritence;

import java.util.Arrays;

public class OverloadingExample {
	public static void main(String[] args) {
		System.out.println(add(10, 20));
		System.out.println(add(10, 20, 30));
		System.out.println(add(10, 20, 30, 40));
		System.out.println(add(10, 20, 30, 40, 50, 10, 20, 30, 40, 50, 10, 20, 30, 40, 50, 10, 20, 30, 40, 50, 10, 20,
				30, 40, 50, 10, 20, 30, 40, 50));
		System.out.println(add(10.5f, 20.2f));
	}

	private static int add(int... nums) {
		int sum = 0;
		for (int i : nums) {
			sum = sum + i;
		}
		return sum;
	}

	// varargs
	// variable number of arguments
	private static double add(double... values) {
		return Arrays.stream(values).sum();

	}

}
