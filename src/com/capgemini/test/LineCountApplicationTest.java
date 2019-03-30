package com.capgemini.test;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

import org.junit.Test;

import com.capgemini.main.LineCountApplication;

public class LineCountApplicationTest {

	@Test
	public void testLineCountInFile() throws IOException {
		LineCountApplication countLine = new LineCountApplication();
		assertEquals(20, countLine.countNumberOfLines());
	}
}
