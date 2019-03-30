package com.capgemini.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LineCountApplication {

	public int countNumberOfLines() throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Pooja\\core java\\data.java"));
		int lines = 0;
		while(reader.readLine() != null) {
			lines++;
		}
		reader.close();
		return lines;
	}
}
