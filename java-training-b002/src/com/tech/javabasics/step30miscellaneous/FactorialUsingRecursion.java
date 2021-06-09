package com.tech.javabasics.step30miscellaneous;

public class FactorialUsingRecursion {
	public static void main(String[] args) {
		System.out.println("Factorial of 4 is : " + factorial(4));
		System.out.println("Factorial of 10 is : " + factorial(10));
		System.out.println("Factorial of 5 is : " + factorial(5));
	}

	private static Long factorial(Integer num) {
		if (num <= 2) {
			return num.longValue();
		} else {
			return num * factorial(num - 1);
		}
	}

}
