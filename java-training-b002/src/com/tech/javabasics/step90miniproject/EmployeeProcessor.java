package com.tech.javabasics.step90miniproject;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeProcessor {
	public static void main(String[] args) throws IOException {

		List<String> allEmployeeRecords = Files
				.readAllLines(Paths.get("C:\\Users\\HP\\Desktop\\JavaFiles", "SampleCSVFile.csv"));

		List<Employee> employeeList = new ArrayList<>();
		int index = 0;
		for (String record : allEmployeeRecords) {
			if (index++ > 0) {
				employeeList.add(mapToEmployee(record));
			}
		}

		System.out.println("\n\n============== R E P O R T  -  1 =====================");
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

		System.out.println("\n\n============== R E P O R T  -  2 =====================");

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

		System.out.println("\n\n============== R E P O R T  -  3 =====================");

//		Create a summary of number of people, total experience and average salary by region - Missing data

		// Region :: # of People (count) : Total Exp (sum) : Total Salary/# of people (avg)

		// Create the final summary map in which the report will be stored for each region. Mark region as
		// the key
		Map<String, EmployeeSummary> regionalSummaryMap = new HashMap<>();

		// Walk through all the employees
		for (Employee e : employeeList) {
			// Create an entry for the region if not already present in the summary map
			if (!regionalSummaryMap.containsKey(e.getRegion())) {
				regionalSummaryMap.put(e.getRegion(), new EmployeeSummary());
			}

			// Find the summary details for the region, and call the update functionality to regenerate the
			// summary taking into consideration this additional employee
			EmployeeSummary es = regionalSummaryMap.get(e.getRegion());
			es.updateRegionalSummary(e);
		}

		System.out.println(regionalSummaryMap);
		// Store this report into Text File
		Path filePath = Paths.get("C:\\Users\\HP\\Desktop\\JavaFiles", "EmployeeReportAsText.txt");
		Files.deleteIfExists(filePath);
		Files.createFile(filePath);

		for (String key : regionalSummaryMap.keySet()) {
			String whatToWrite = String.format("%s - %s\n", key, regionalSummaryMap.get(key));
			Files.writeString(filePath, whatToWrite, StandardOpenOption.APPEND);
		}

		// Writing into an object file
		// Refer to ReadEmployeeRegionalReport class for reading the contents of the below object file
		ObjectOutputStream employeeReportObjectStream = new ObjectOutputStream(
				Files.newOutputStream(Paths.get("C:\\Users\\HP\\Desktop\\JavaFiles\\EmployeeReportAsObject.txt")));

		for (String key : regionalSummaryMap.keySet()) {
			EmployeeRegionalReport thisReport = new EmployeeRegionalReport(key, regionalSummaryMap.get(key));
			employeeReportObjectStream.writeObject(thisReport);
		}

		employeeReportObjectStream.close();

		System.out.println("\n\n============== R E P O R T  -  4 =====================");
//		Find employees with names more than 5 characters, having an 'e' in them, married, and having less than average salary
		for (Employee e : employeeList) {
			if (e.getFirstName().toLowerCase().contains("e") && e.getIsMarried() && e.getSalary() < avgSalary) {
				System.out.println(e);
			}
		}

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
		return LocalDate.parse(inputString, DateTimeFormatter.ofPattern("M/d/yyyy"));
	}

}
