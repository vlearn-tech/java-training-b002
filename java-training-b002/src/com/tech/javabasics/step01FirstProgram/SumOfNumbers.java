package com.tech.javabasics.step01FirstProgram;

public class SumOfNumbers {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		int sum = findTotal(num1, num2);

		MyPrintUtils.print(sum);
		MyPrintUtils.print(345);
		MyPrintUtils.print(findTotal(100, 200));
	}

	private static Integer findTotal(Integer number1, Integer number2) {
		Integer total = number1 + number2;
		return total;
	}

}
