package com.tech.javabasics.step12aggregationandinheritence;

public class Address {
	String addressline;
	String city;
	Long zipCode;

	public Address(String addressline, String city, Long zipCode) {
		this.addressline = addressline;
		this.city = city;
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "Address [addressline=" + addressline + ", city=" + city + ", zipCode=" + zipCode + "]";
	}

}
