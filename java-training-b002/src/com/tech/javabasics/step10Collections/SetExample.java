package com.tech.javabasics.step10Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample {
	public static void main(String[] args) {
		// Initializing list as part of declaration
		List<String> names = List.of("Akash", "Charlie", "Beena", "David", "Frank", "Sameer", "Rahul");

		System.out.println(names);

		List<String> namesInArrayList = new ArrayList<>();
		namesInArrayList.addAll(names);
		namesInArrayList.add("Frank");
		namesInArrayList.add("Rahul");
		namesInArrayList.add("Charlie");
		System.out.println(namesInArrayList);

		Set<String> namesInSet = new HashSet<>();
		namesInSet.addAll(namesInArrayList);

		List<String> sortedList = new ArrayList(namesInSet);
		Collections.sort(sortedList);

		System.out.println(sortedList);

	}
}
