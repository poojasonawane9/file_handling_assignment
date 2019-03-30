package com.capgemini.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class MyClass implements Serializable {


	private int classRoomNumber;
	private String classSubjects;

	public MyClass() {
		super();
	}

	public MyClass(int classRoomNumber, String classSubjects) {
		super();
		this.classRoomNumber = classRoomNumber;
		this.classSubjects = classSubjects;
	}

	public int getClassRoomNumber() {
		return classRoomNumber;
	}

	public void setClassRoomNumber(int classRoomNumber) {
		this.classRoomNumber = classRoomNumber;
	}

	public String getClassSubjects() {
		return classSubjects;
	}

	public void setClassName(String classSubjects) {
		this.classSubjects = classSubjects;
	}

	public boolean doSerialization(String filePath, Object obj) throws IOException {

		FileOutputStream fileoutputStream = new FileOutputStream(filePath);
		ObjectOutputStream outputStream = new ObjectOutputStream(fileoutputStream);
		outputStream.writeObject(obj);
		outputStream.close();
		System.out.println(obj);
		System.out.println("Writing  object into file successfully!");

		return true;

	}

	public Object doDeSerialization(String filePath) throws IOException, ClassNotFoundException {
		FileInputStream fileInputStream = new FileInputStream(filePath);
		ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);

		ArrayList<MyClass> t = (ArrayList<MyClass>) inputStream.readObject();
		inputStream.close();
		System.out.println(t);
		System.out.println("Reading object from file successfully!");
		return t;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + classRoomNumber;
		result = prime * result + ((classSubjects == null) ? 0 : classSubjects.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyClass other = (MyClass) obj;
		if (classRoomNumber != other.classRoomNumber)
			return false;
		if (classSubjects == null) {
			if (other.classSubjects != null)
				return false;
		} else if (!classSubjects.equals(other.classSubjects))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MyClass [classRoomNumber=" + classRoomNumber + ", classSubjects=" + classSubjects + "]";
	}
}
