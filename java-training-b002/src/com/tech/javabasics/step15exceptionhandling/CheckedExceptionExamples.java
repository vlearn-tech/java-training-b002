package com.tech.javabasics.step15exceptionhandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class CheckedExceptionExamples {
	public static void main(String[] args) throws IOException {

		List<String> allLines = Files.readAllLines(Paths.get("C:\\Users\\HP\\Desktop\\JavaFiles\\SampleCSVFile.csv"));
		Long totalSal = 0L;
		int totalNumOfPeople = 0;

		for (String rec : allLines) {
//				System.out.println(rec);
			String[] data = rec.split(",");
			System.out.println(data[1] + " : " + data[7]);
			try {
				totalSal += Integer.valueOf(data[7]);
				totalNumOfPeople++;
			} catch (Exception e) {
				System.out.println("Exception encountered... Discarding this entry and moving on...");
			}
		}

		System.out.println("Total Salary : " + totalSal);
		System.out.println("Total # of people : " + totalNumOfPeople);
		System.out.println("Avg salary : " + totalSal / totalNumOfPeople);

	}
}

//Exception - 3 types

//1. Compile Time Exceptions - [Checked Exception]
//2. [RunTime Exception] - Unchecked Exception
//3. [Errors]
