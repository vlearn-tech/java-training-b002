package com.tech.javabasics.step03CodeConstructionLogic;

public class ArraysLoopsAndConditionals {
	public static void main(String[] args) {

//		int i1 = 10;
//		int i2 = 20;
//		int i3 = 30;
//		int i4 = 22;

//		int greatest = 0;
//		if (i1 > i2 && i1 > i3 && i1 > i4) {
//			greatest = i1;
//	 	}

//		System.out.println(numbers[0]);
//		System.out.println(numbers[1]);
//		System.out.println(numbers[2]);
//		System.out.println(numbers[3]);

		Integer[] numbers = { 10, 20, 30, 22, 45 };
		numbers[3] = 33;
		ArrayUtils.printArrayContent(numbers, 'E');

		Integer[] anotherArray = new Integer[5]; // {0, 0, 123, 234, 0}
		anotherArray[0] = 0;
		anotherArray[3] = 234;
		anotherArray[2] = 123;

		Integer[] randomNumbers = ArrayUtils.generateArrayWithRandomValues(10);

		ArrayUtils.printArrayContent(randomNumbers, 'X');

	}

}
