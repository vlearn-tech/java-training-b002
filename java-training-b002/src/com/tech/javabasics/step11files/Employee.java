package com.tech.javabasics.step11files;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Employee implements Serializable {

	private static final long serialVersionUID = 3227878322850367130L;
	private Long id;
	private String firstName;
	private String lastName;
	private Boolean isMarried;
	private Character gender;
	private LocalDate dateOfBirth;
	private LocalDate dateOfJoining;
	private Integer salary;
	private String region;
	private Integer age;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Boolean getIsMarried() {
		return isMarried;
	}

	public void setIsMarried(Boolean isMarried) {
		this.isMarried = isMarried;
	}

	public Character getGender() {
		return gender;
	}

	public void setGender(Character gender) {
		this.gender = gender;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Integer getAge() {
		Long age = ChronoUnit.YEARS.between(dateOfBirth, LocalDate.now());
		return age.intValue();
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", isMarried=" + isMarried
				+ ", gender=" + gender + ", dateOfBirth=" + dateOfBirth + ", dateOfJoining=" + dateOfJoining
				+ ", salary=" + salary + ", region=" + region + ", age=" + getAge() + "]";
	}

	public static Employee mapToEmployee(String recordString) {
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
