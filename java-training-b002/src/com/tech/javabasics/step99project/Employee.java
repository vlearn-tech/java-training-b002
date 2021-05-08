package com.tech.javabasics.step99project;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Employee {
	static Integer lastUsedEmployeeId = 0;

	Integer id;
	String name;
	Character gender;
	LocalDate dateOfJoining;
	Integer salary;
	Float totalExperience;
	Boolean isMarried;
	String designationInCompany;
	String[] hobbies;

	public Employee(String name, Character gender, LocalDate dateOfJoining, Integer salary, Boolean isMarried,
			String designationInCompany, String[] hobbies) {
		this.id = ++lastUsedEmployeeId;
		this.name = name;
		this.gender = gender;
		this.dateOfJoining = dateOfJoining;
		this.salary = salary;
		this.isMarried = isMarried;
		this.designationInCompany = designationInCompany;
		this.hobbies = hobbies;

		this.totalExperience = ChronoUnit.DAYS.between(dateOfJoining, LocalDate.now()) / 365.0f;
	}

}
