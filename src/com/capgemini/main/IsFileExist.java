package com.capgemini.main;

import java.io.File;

public class IsFileExist {

	public boolean isFileExist(String filepath) {
		File file = new File(filepath);
		return file.exists();
	}
}
