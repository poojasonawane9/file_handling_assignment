package com.capgemini.main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmployeeSerializable {

	public boolean serialization(String filepath,Object obj) throws IOException {
	
		FileOutputStream filStream = new FileOutputStream(filepath);
		ObjectOutputStream obStream = new ObjectOutputStream(filStream);
		obStream.writeObject(obj);
		obStream.close();
		return true;
	}
}
