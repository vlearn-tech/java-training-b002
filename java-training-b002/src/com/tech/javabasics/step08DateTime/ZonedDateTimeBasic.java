package com.tech.javabasics.step08DateTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeBasic {
	public static void main(String[] args) {
		ZonedDateTime currentTimeInIndia = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
		System.out.println(currentTimeInIndia);

		ZonedDateTime timeInAnotherZone = currentTimeInIndia.withZoneSameInstant(ZoneId.of("Singapore"));
		System.out.println(timeInAnotherZone);

		// Print the list of all zone ids
//		for (String zoneIdName : ZoneId.getAvailableZoneIds()) {
//			System.out.println(zoneIdName);
//		}

	}
}
