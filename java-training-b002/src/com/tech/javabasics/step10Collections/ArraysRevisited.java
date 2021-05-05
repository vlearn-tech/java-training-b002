package com.tech.javabasics.step10Collections;

import java.util.Arrays;

public class ArraysRevisited {
	public static void main(String[] args) {

		String[] names = { "Akash", "Charlie", "Beena", "David", "Frank", "Sameer", "Rahul" };

		names[2] = null;

		System.out.println(Arrays.toString(names));
		System.out.println(names.length);

	}
}
