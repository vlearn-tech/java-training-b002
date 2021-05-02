package com.tech.javabasics.step08DateTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateBasics {
	public static void main(String[] args) {

		// Common format for now.. You can change this as needed to suit your choice
		DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd-MMM-yyyy");

		// Today's Date
		LocalDate date = LocalDate.now();

		// Show the current date in standard format (YYYY-MM-DD)
		System.out.println(date);

		// Show the date in a different format (DD-MMM-YYYY)
		System.out.println(date.format(pattern));

		// Any Specific date where you know the Year, Month and Day of Month.
		LocalDate someSpecificDate = LocalDate.of(2000, 8, 15);
		System.out.println(someSpecificDate.format(pattern));

		// Parse the date from a input (String)
		String dateStr = "14-Nov-2015";
		LocalDate parsedDate = LocalDate.parse(dateStr, pattern);
		System.out.println(parsedDate.format(pattern));

		LocalDate date1 = LocalDate.of(2021, 02, 13);
		LocalDate date2 = LocalDate.of(2022, 04, 19);

		// What is 10 days post date1
		System.out.println(date1.plusDays(10).plusMonths(2).minusYears(1));

		System.out.println(ChronoUnit.DAYS.between(date1, date2));

		Period period = Period.between(date1, date2);
		System.out.println(period);
		System.out.println(period.getMonths());

		System.out.println(date1.compareTo(date2));

	}
}
