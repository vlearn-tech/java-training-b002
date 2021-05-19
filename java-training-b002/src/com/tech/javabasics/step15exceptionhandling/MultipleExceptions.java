package com.tech.javabasics.step15exceptionhandling;

public class MultipleExceptions {
	public static void main(String[] args) {
		try {
			// some code
		} catch (IllegalArgumentException | ArithmeticException | ArrayIndexOutOfBoundsException e) {

		}
	}
}
