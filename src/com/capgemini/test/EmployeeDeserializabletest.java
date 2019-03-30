package com.capgemini.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;

import org.junit.Test;

import com.capgemini.main.EmployeeClass;
import com.capgemini.main.EmployeeDeserializable;;
public class EmployeeDeserializabletest {

	@Test
	public void testDeserialization() throws ClassNotFoundException, IOException {
		
		EmployeeClass empClass = new EmployeeClass(1,"bob",20000);
		EmployeeDeserializable empDeserializable  = new EmployeeDeserializable();
		assertEquals(empClass,empDeserializable.deSerialization("employee.ser"));
		
	}
}
