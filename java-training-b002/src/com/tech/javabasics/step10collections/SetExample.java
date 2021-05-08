package com.tech.javabasics.step10collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SuppressWarnings("unused")
public class SetExample {
	public static void main(String[] args) {
		// Initializing list as part of declaration
		List<String> names = List.of("Akash", "Charlie", "Beena", "David", "Frank", "Sameer", "Rahul");

		System.out.println(names);

		// Declare an ArrayList and add duplicate entries
		List<String> namesInArrayList = new ArrayList<>();
		namesInArrayList.addAll(names);
		namesInArrayList.add("Frank");
		namesInArrayList.add("Rahul");
		namesInArrayList.add("Charlie");

		// Duplicates are allowed in array list and hence can be seen here
		System.out.println(namesInArrayList);

		// Create a Set and copy entire array into the set
		Set<String> namesInSet = new HashSet<>();
		// No duplicates
		namesInSet.addAll(namesInArrayList);

		List<String> sortedList = new ArrayList<>(namesInSet);
		Collections.sort(sortedList);

		System.out.println(sortedList);

	}
}
