package com.tech.javabasics.step90miniproject;

import java.io.Serializable;

public class EmployeeRegionalReport implements Serializable {

	private static final long serialVersionUID = -3194060866450970841L;

	String region;
	Integer numOfPeople;
	Integer totalExperience;
	Long totalSalary;
	Double averageSalary;

	public EmployeeRegionalReport(String region, EmployeeSummary es) {
		this.region = region;
		this.numOfPeople = es.numOfPeople;
		this.totalExperience = es.totalExperience;
		this.totalSalary = es.totalSalary;
		this.averageSalary = es.averageSalary;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Integer getNumOfPeople() {
		return numOfPeople;
	}

	public void setNumOfPeople(Integer numOfPeople) {
		this.numOfPeople = numOfPeople;
	}

	public Integer getTotalExperience() {
		return totalExperience;
	}

	public void setTotalExperience(Integer totalExperience) {
		this.totalExperience = totalExperience;
	}

	public Long getTotalSalary() {
		return totalSalary;
	}

	public void setTotalSalary(Long totalSalary) {
		this.totalSalary = totalSalary;
	}

	public Double getAverageSalary() {
		return averageSalary;
	}

	public void setAverageSalary(Double averageSalary) {
		this.averageSalary = averageSalary;
	}

	@Override
	public String toString() {
		return "EmployeeRegionalReport [region=" + region + ", numOfPeople=" + numOfPeople + ", totalExperience="
				+ totalExperience + ", totalSalary=" + totalSalary + ", averageSalary=" + Math.round(averageSalary)
				+ "]";
	}

}
