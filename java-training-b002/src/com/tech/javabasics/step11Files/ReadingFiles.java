package com.tech.javabasics.step11Files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadingFiles {
	public static void main(String[] args) throws IOException {

		List<String> lines = Files.readAllLines(Paths.get("C:\\Users\\HP\\Desktop\\JavaFiles", "SampleCSVFile.csv"));

		for (String rec : lines) {
			System.out.println(rec);
		}

	}
}
