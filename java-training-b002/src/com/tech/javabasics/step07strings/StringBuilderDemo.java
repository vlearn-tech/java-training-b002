package com.tech.javabasics.step07strings;

public class StringBuilderDemo {
	public static void main(String[] args) {
		String message = "  Hello  ";
		StringBuilder sb = new StringBuilder(message.trim());

		System.out.println(sb);

		sb.replace(0, 1, "W");
		System.out.println(sb);

		sb.reverse();
		System.out.println(sb);

	}
}
