package com.tech.javabasics.step08DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeBasics {
	public static void main(String[] args) {

		// Common format for now.. You can change this as needed to suit your choice
		DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd-MMM-yyyy hh::mm::ss");

		// Today's Date
		LocalDateTime dateTime = LocalDateTime.now();

		// Show the current date in standard format (YYYY-MM-DD)
		System.out.println(dateTime);

		// Show the date in a different format (DD-MMM-YYYY)
		System.out.println(dateTime.format(pattern));

		// Any Specific date where you know the Year, Month and Day of Month.

		// Parse the date from a input (String)

	}
}
