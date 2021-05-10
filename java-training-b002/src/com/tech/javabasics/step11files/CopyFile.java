package com.tech.javabasics.step11files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class CopyFile {
	public static void main(String[] args) throws IOException {

		List<String> lines = Files.readAllLines(Paths.get("C:\\Users\\HP\\Desktop\\JavaFiles\\SampleCSVFile.csv"));
		Files.write(Paths.get("C:\\Users\\HP\\Desktop\\JavaFiles\\SampleCSVFile_Copy.csv"), lines);

		System.out.println("File copied");
	}
}
