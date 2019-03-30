package com.capgemini.test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.IOException;
import org.junit.Test;

import com.capgemini.main.IsFileExist;
import com.capgemini.main.WordCountApplication;

public class WordCountApplicationTest {
	
	@Test
	public void testFileExist() {
		IsFileExist file= new IsFileExist();
		assertTrue(file.isFileExist("C:\\Pooja\\sample.txt"));
	}

	@Test
	public void testNumberOfWordsInFile() throws IOException {
		WordCountApplication wordCount = new WordCountApplication();
		assertEquals(11, wordCount.countNumberOfWordsInFile());
	}
}
