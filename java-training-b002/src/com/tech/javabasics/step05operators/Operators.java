package com.tech.javabasics.step05operators;

public class Operators {
	public static void main(String[] args) {
		int i = 10;
		System.out.println(i);

		i -= 5; // i = i - 5
		System.out.println(i);

		System.out.println(i++);

		System.out.println(i);

		int[] intArr = { 1, 10, 100, 1000, 10000 };
		int whichPower = 2;

		System.out.println("10 raised to the power " + whichPower + " is " + intArr[whichPower++]);
		System.out.println("10 raised to the power " + whichPower + " is " + intArr[whichPower]);

	}
}
