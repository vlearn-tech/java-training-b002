package com.tech.javabasics.step11files;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadingLargeFiles {
	public static void main(String[] args) throws IOException {

		BufferedReader reader = Files
				.newBufferedReader(Paths.get("C:\\Users\\HP\\Desktop\\JavaFiles\\SampleCSVFile.csv"));

		String line = null;

		while ((line = reader.readLine()) != null) {
			System.out.println(line);
		}

	}
}
