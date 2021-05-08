package com.tech.javabasics.step08datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class DateConversionChallenge {
	public static void main(String[] args) {
		System.out.println("\n\n============= C H A L L E N G E ===============");

		// Assume you have a file in which you have got a date in format yyyy/MMM-dd. You want to covert
		// this into an array of Strings in the format MM/dd/yyyy

		List<String> dateList = List.of("2020/Mar-14", "2021/Apr-30", "2019/Dec-19", "2021/May-02");
		System.out.println(" INPUT LIST : " + dateList);
		List<String> outputDateList = new ArrayList<>();

		// Loop through the list and for each string that you get, call the meothod to reformat the data
		for (String thisDate : dateList) {
			outputDateList.add(parseAndReformatDate(thisDate, "yyyy/MMM-dd", "MM/dd/yyyy"));
		}

		System.out.println("OUTPUT LIST : " + outputDateList);
	}

	private static String parseAndReformatDate(String inputDate, String inputFormat, String outputFormat) {
		LocalDate date = LocalDate.parse(inputDate, DateTimeFormatter.ofPattern(inputFormat));
		return date.format(DateTimeFormatter.ofPattern(outputFormat));
	}
}
