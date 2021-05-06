package com.tech.javabasics.step10Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListUsage {
	public static void main(String[] args) {

		String[] names = { "Akash", "Charlie", "Beena", "David", "Frank", "Sameer", "Rahul" };

//		int[] nums = { 1, 4, 3, 2 };
//		System.out.println(Arrays.toString(nums));
//
//		List<Integer> numbers = new ArrayList<>();
//		numbers.add(0, 10);
//		numbers.add(0, 20);
//
//		for (int i : nums) {
//			numbers.add(0, i);
//		}
//
//		numbers.add(0, 64);
//
//		System.out.println(numbers);
//
//		System.out.println("\n\n\n=======================\n\n\n");

//		names[2] = null;

		System.out.println(Arrays.toString(names));
		System.out.println(names.length);

		System.out.println("\n\n=========== A R R A Y    L I S T ================\n\n");

		// How to add entries from an existing Array
		List<String> nameList = new ArrayList<>();
		nameList.addAll(Arrays.asList(names));

		System.out.println("Contents : " + nameList + " Size : " + nameList.size());

		// Add one more element into ArrayList
		nameList.add("Prithvi");
		System.out.println("Contents : " + nameList + " Size : " + nameList.size());

		// Add elements through logic
		for (String name : names) {
			if (name != null && name.contains("i")) {
				nameList.add(1, name);
				System.out.println("[INT STEP] Contents : " + nameList + " Size : " + nameList.size());
			}
		}

		System.out.println("Contents : " + nameList + " Size : " + nameList.size());

		// remove one element
		nameList.remove("Akash");
		System.out.println("Contents : " + nameList + " Size : " + nameList.size());

		// Add multiple new elements
		nameList.addAll(Arrays.asList(names));
		System.out.println("Contents : " + nameList + " Size : " + nameList.size());

		// Sort elements
		Collections.sort(nameList);
		System.out.println("[SORTED LIST] Contents : " + nameList + " Size : " + nameList.size());

		// Remove element at specific position
		nameList.remove(7);
		System.out.println("[DUPLICATE REMOVAL] : Contents : " + nameList + " Size : " + nameList.size());

		// Find and remove the duplicates from the Array
		List<String> uniqueValues = new ArrayList<>();
		List<String> duplicateValues = new ArrayList<>();
		for (String name : nameList) {
//			System.out.println("Processing : " + name + " Already Processed List : " + alreadyProcessedValues);
			if (uniqueValues.contains(name)) {
				duplicateValues.add(name);
			} else {
				uniqueValues.add(name);
			}
		}

		System.out.println("Unique Names : " + uniqueValues);
		System.out.println("Duplicate Entries : " + duplicateValues);

		// removing multiple elements in one shot
		List<String> filteredNames = uniqueValues;
		filteredNames.removeAll(duplicateValues);

		System.out.println("Filtered Entries : " + filteredNames);

		// Looping constructs
		System.out.println("\n============= U S I N G    F O R   L O O P ===============\n");
		List<String> namesContainingI = new ArrayList<>();

		for (String name : nameList) {
			if (name.contains("i")) {
				namesContainingI.add(name);
			}
		}

		System.out.println(namesContainingI);

		// Advanced Looping Constructs using Lambdas
		System.out.println("\n============= U S I N G    F O R E A C H  ===============\n");
		nameList.forEach(thisName -> {
			if (thisName.contains("i")) {
				System.out.println(thisName);
			}
		});

		System.out.println("\n============= U S I N G    L A M B D A   &   S T R E A M S  ===============\n");
		nameList.stream().filter(name -> name.contains("i")).forEach(System.out::println);

	}
}
