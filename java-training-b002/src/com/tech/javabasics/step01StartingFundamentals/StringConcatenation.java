package com.tech.javabasics.step01StartingFundamentals;

public class StringConcatenation {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = " World";

		int i1 = 169245;
		int i2 = 90108;

		MyPrintUtils.print(i1 + i2);
		MyPrintUtils.print(s1 + s2);

		System.out.println("Sum of 5 and 10 is " + MyPrintUtils.print(i1 + i2));

		System.out.println(s1 + s2);
		System.out.println(s1 + i2);
	}
}
