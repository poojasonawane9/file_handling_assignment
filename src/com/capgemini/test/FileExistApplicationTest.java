package com.capgemini.test;

import static org.junit.Assert.assertTrue;
import java.io.File;

import org.junit.Test;

import com.capgemini.main.IsFileExist;

public class FileExistApplicationTest {
	
	@Test
	public void testFileExist() {
		IsFileExist file= new IsFileExist();
		assertTrue(file.isFileExist("C:\\Pooja\\Head_First_Java_2nd_Edition.pdf"));
	}

}
