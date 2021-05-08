package com.tech.javabasics.step05operators;

public class LogicalOperation {
	public static void main(String[] args) {
		int age = 10 + (int) (Math.random() * 40);
		String[] names = { "Ashish", "Mohit", "Sudha", "Madhu", "Sachin" };
		String name = names[(int) (Math.random() * names.length)];

		System.out.println(String.format("Chosen person is %s and his/her age is %d", name, age));

		int count = 0;

		if (name.startsWith("M") & age >= 25 & count++ >= 0) {
			System.out.println("You have won a lottery");
		}
		System.out.println(count);

		// && - more efficient - quick exit
		// & - evaluates each and every condition even if it knows the outcome beforehand

	}
}
