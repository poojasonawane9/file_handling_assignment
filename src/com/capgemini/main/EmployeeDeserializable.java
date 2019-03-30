package com.capgemini.main;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EmployeeDeserializable {

	public Object deSerialization(String filepath) throws IOException, ClassNotFoundException {
		
		FileInputStream inputStream = new FileInputStream(filepath);
		ObjectInputStream objInputStream = new ObjectInputStream(inputStream);
		
		Object object = objInputStream.readObject();
		objInputStream.close();
		System.out.println(object);
		return object ;
		
	}
}
