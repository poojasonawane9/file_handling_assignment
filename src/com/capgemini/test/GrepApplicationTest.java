package com.capgemini.test;

import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

import com.capgemini.main.GrepApplication;

public class GrepApplicationTest {
	GrepApplication grepApplication;
	@Test
	public void testFileExistsClass() {
		grepApplication= new GrepApplication();
		assertEquals(true,grepApplication.isFileExsits());
	}
	
	@Test
	public void testFileNotExists() throws FileNotFoundException {
		grepApplication = new GrepApplication();
		assertEquals(false,grepApplication.isFileNotExist());
	}
	
	@Test
	public void testGrepMethod() throws IOException {
		grepApplication = new GrepApplication();
		assertEquals(65,grepApplication.findWord());		
	}
}
