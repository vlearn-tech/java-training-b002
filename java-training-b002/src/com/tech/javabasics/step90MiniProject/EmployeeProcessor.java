package com.tech.javabasics.step90MiniProject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class EmployeeProcessor {
	public static void main(String[] args) throws IOException {

		List<String> allEmployeeRecords = Files
				.readAllLines(Paths.get("C:\\Users\\HP\\Desktop\\JavaFiles", "SampleCSVFile.csv"));

		List<Employee> employeeList = new ArrayList<>();
		for (String record : allEmployeeRecords) {
			employeeList.add(mapToEmployee(record));
		}

//		for (Employee e : employeeList) {
//			System.out.println(e);
//		}

//		Find sum of salary of all unmarried people - Filter
		Long totalSalaryOfUnmarriedEmployees = 0L;
		Long totalSalaryOfAllEmployees = 0L;
		for (Employee e : employeeList) {
			totalSalaryOfAllEmployees += e.getSalary(); // This is needed for finding average salary at company level.
														// Req 2
			if (!e.getIsMarried()) {
				totalSalaryOfUnmarriedEmployees += e.getSalary();
			}
		}
		System.out.println("Sum of salary of all unmarried people = " + totalSalaryOfUnmarriedEmployees);

//		Find out how many people younger than 40 are earning more than the average payout at the company - Filter + Avg
		Integer avgSalary = ((Long) (totalSalaryOfAllEmployees / employeeList.size())).intValue();
		int numOfEmployeeEarningMoreThanAvg = 0;
		for (Employee e : employeeList) {
			if (e.getAge() < 40 && e.getSalary() > avgSalary) {
				System.out.println(e);
				numOfEmployeeEarningMoreThanAvg++;
			}
		}
		System.out.println("# of people younger than 40 are earning more than the average payout at the company = "
				+ numOfEmployeeEarningMoreThanAvg);

//		Create a summary of number of people, total experience and average salary by region - Missing data
//		Find employees with names more than 5 characters, having an 'e' in them, married, and having less than average salary

	}

	private static Employee mapToEmployee(String recordString) {
		String[] recordElements = recordString.split(",");
		Employee emp = new Employee();
		emp.setId(Long.valueOf(recordElements[0]));
		emp.setFirstName(recordElements[1]);
		emp.setLastName(recordElements[2]);
		emp.setIsMarried(Boolean.valueOf(recordElements[3]));
		emp.setGender(recordElements[4].charAt(0));
		emp.setDateOfBirth(getDateFromString(recordElements[5]));
		emp.setDateOfJoining(getDateFromString(recordElements[6]));
		emp.setSalary(Integer.valueOf(recordElements[7]));
		emp.setRegion(recordElements[8]);
		return emp;
	}

	private static LocalDate getDateFromString(String inputString) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy");
		LocalDate dateValue = LocalDate.parse(inputString, formatter);
		return dateValue;
	}

}
