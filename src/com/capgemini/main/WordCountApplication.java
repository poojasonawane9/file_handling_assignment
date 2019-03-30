package com.capgemini.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class WordCountApplication {
	
	public boolean isFileExist(String filepath) {
		File file = new File(filepath);
		return file.exists();
	}

	public int countNumberOfWordsInFile() throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Pooja\\sample.txt"));
		String lines;
		int count =0;
		while((lines= reader.readLine()) != null) {
			String[] words = lines.split("\\s+");
			count = count + words.length;
		}
		reader.close();
		return count;
	}

}